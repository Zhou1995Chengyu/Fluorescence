package activity.fluorescence.zjgy.com.fluorescence;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SelfActivity extends Activity implements View.OnClickListener {

    private Button bt1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self);

        bt1=(Button) findViewById(R.id.self_button1);
        bt1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.self_button1:
                Intent intent=new Intent(SelfActivity.this,LoginActivity.class);
                startActivity(intent);;
                break;
            default:break;
        }
    }
}
