package com.example.viet.weatherapp.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.viet.weatherapp.R;
import com.example.viet.weatherapp.manager.CustomApplication;
import com.roger.catloadinglibrary.CatLoadingView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.viet.weatherapp.common.Constants.APP_ID;

public class MainActivity extends AppCompatActivity implements MainMvpView, View.OnClickListener {
    private static final String TAG = "MainActivity";

    @BindView(R.id.edtCity)
    EditText edtCity;
    @BindView(R.id.btnCallApi)
    Button btnCallApi;
    @BindView(R.id.tvResult)
    TextView tvResult;
    CatLoadingView catLoadingView = new CatLoadingView();

//    @Inject
//    Retrofit retrofit;

    @Inject
    MainPresenter<MainMvpView> mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initViews();
        mMainPresenter.onAttach(this);
//        Log.i("MainActivity", retrofit.baseUrl().toString());
    }

    private void initViews() {
        CustomApplication customApplication = (CustomApplication) getApplication();
        customApplication.getmActivityComponent().inject(this);
        btnCallApi.setOnClickListener(this);

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
            mMainPresenter.callApi( city, APP_ID);
            catLoadingView.show(getSupportFragmentManager(), "");
        }
    }

    @Override
    public void showProgress() {
        Log.i(TAG, "showProgress");
    }

    @Override
    public void hideProgress() {
        Log.i(TAG, "hideProgress");
    }

    @Override
    public void showMessage(String message) {
        Log.i(TAG, "showMessage");
    }

    @Override
    protected void onDestroy() {
        mMainPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMainPresenter.onAttach(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMainPresenter.onDetach();
    }
}
