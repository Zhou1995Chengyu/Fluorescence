package activity.fluorescence.zjgy.com.fluorescence;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by panda on 2017/11/10.
 */

public class SetActivity extends Activity implements View.OnClickListener {

    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        bt1=(Button) findViewById(R.id.set_button1);
        bt2=(Button) findViewById(R.id.set_button2);
        bt3=(Button) findViewById(R.id.set_button3);
        bt4=(Button) findViewById(R.id.set_button4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.set_button1:
                intent=new Intent(SetActivity.this,SetTimeActivity.class);
                startActivity(intent);
                break;
            case R.id.set_button2:
                intent=new Intent(SetActivity.this,SetDataActivity.class);
                startActivity(intent);
                break;
            case R.id.set_button3:
                intent=new Intent(SetActivity.this,SetUserActivity.class);
                startActivity(intent);
                break;
            case R.id.set_button4:
                intent=new Intent(SetActivity.this,SetItemActivity.class);
                startActivity(intent);
                break;
            default:break;
        }
    }
}
