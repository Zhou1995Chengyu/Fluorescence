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

public class SetUserActivity extends Activity implements View.OnClickListener {

    private Button bt1;
    private Button bt2;
    private Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_user);

        bt1=(Button) findViewById(R.id.set_user_button1);
        bt2=(Button) findViewById(R.id.set_user_button2);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.set_user_button1:
                break;
            case R.id.set_user_button2:
                break;
            case R.id.set_item_button3:
                intent=new Intent(SetUserActivity.this,SetActivity.class);
                startActivity(intent);
                break;
            default:break;
        }
    }
}
