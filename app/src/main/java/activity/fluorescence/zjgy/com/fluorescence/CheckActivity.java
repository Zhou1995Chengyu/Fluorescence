package activity.fluorescence.zjgy.com.fluorescence;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Switch;

/**
 * Created by panda on 2017/11/10.
 */

public class CheckActivity extends Activity implements OnClickListener{

/*
    static {
        System.loadLibrary("FLOURColloidalGold");
    }

    public static native void CD4Count(result myres, double[] xi);
*/
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        bt1=(Button) findViewById(R.id.check_button1);
        bt2=(Button) findViewById(R.id.check_button2);
        bt3=(Button) findViewById(R.id.check_button3);
        bt4=(Button) findViewById(R.id.check_button4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.check_button1:
                break;
            case R.id.check_button2:
                intent=new Intent(CheckActivity.this,CheckChartActivity.class);
                startActivity(intent);
                break;
            case R.id.check_button3:
                break;
            case R.id.check_button4:
                intent=new Intent(CheckActivity.this,MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }
    }
}
