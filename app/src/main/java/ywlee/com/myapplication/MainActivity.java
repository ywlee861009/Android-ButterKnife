package ywlee.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    /**
     * Find View 대신 멤버변수를 @BindView Annotation 을 이용하여 선언한다.
     */
    @BindView(R.id.btn_hello) Button mBtnHello;
    @BindView(R.id.txv_hello) TextView mTxvHello;

    /**
     * On Click 이벤트 처리는 @OnClick Annotation 을 이용한다.
     */
    @OnClick(R.id.btn_hello)
    public void onHello() {
        mTxvHello.setText("Hello Butter Knife");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Set Content 후 ButterKnife.bind 하면 끝
         */
        ButterKnife.bind(this);

        initView();
    }


    private void initView() {

    }


}
