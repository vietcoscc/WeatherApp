package com.example.viet.weatherapp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.viet.weatherapp.R;
import com.example.viet.weatherapp.model.CustomApplication;
import com.example.viet.weatherapp.presenter.MainPresenterImp;
import com.roger.catloadinglibrary.CatLoadingView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Retrofit;

import static com.example.viet.weatherapp.model.CustomApplication.APP_ID;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {
    private static final String TAG = "MainActivity";
    private MainPresenterImp mMainPresenterImp;
    @BindView(R.id.edtCity)
    EditText edtCity;
    @BindView(R.id.btnCallApi)
    Button btnCallApi;
    @BindView(R.id.tvResult)
    TextView tvResult;
    CatLoadingView catLoadingView = new CatLoadingView();
    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initPresenter();
        initViews();

        Log.i("MainActivity", retrofit.baseUrl().toString());

    }

    private void initViews() {
        CustomApplication customApplication = (CustomApplication) getApplication();
        customApplication.getmNetComponent().inject(this);
        btnCallApi.setOnClickListener(this);

    }

    private void initPresenter() {
        mMainPresenterImp = new MainPresenterImp(this);
    }

    @Override
    public void displayResult(String result) {
        Log.i(TAG, "displayResult");
        tvResult.setText(result);
        catLoadingView.dismiss();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnCallApi) {
            String city = edtCity.getText().toString();
            mMainPresenterImp.callApi(retrofit, city, APP_ID);
            catLoadingView.show(getSupportFragmentManager(), "");
        }
    }
}
