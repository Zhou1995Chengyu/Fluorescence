package activity.fluorescence.zjgy.com.fluorescence;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by panda on 2017/11/10.
 */

public class SetDataActivity extends Activity implements View.OnClickListener {

    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_data);

      //  bt1=(Button) findViewById(R.id.query_button1);
        //bt2=(Button) findViewById(R.id.query_button2);
       // bt1.setOnClickListener(this);
      //  bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
          /*  case R.id.query_button1:
                break;
            case R.id.query_button2:
                break;
            default:break;*/
        }
    }
}
