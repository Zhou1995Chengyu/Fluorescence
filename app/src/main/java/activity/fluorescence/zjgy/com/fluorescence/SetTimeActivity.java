package activity.fluorescence.zjgy.com.fluorescence;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

import activity.fluorescence.zjgy.com.fragment.DatePickerFragment;
import activity.fluorescence.zjgy.com.fragment.TimePickerFragment;

/**
 * Created by panda on 2017/11/10.
 */

public class SetTimeActivity extends Activity implements View.OnClickListener {

    private Button bt1;
    private Button bt2;
    private Intent intent;

    private TimePicker timePicker;
    private CalendarView calendarView;

    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_time);

        bt1=(Button) findViewById(R.id.bt1);
        bt2=(Button) findViewById(R.id.bt2);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

        Calendar c=Calendar.getInstance();
        year=c.get(Calendar.YEAR);
        month=c.get(Calendar.MONTH);
        day=c.get(Calendar.DAY_OF_MONTH);
        hour=c.get(Calendar.HOUR);
        minute=c.get(Calendar.MINUTE);

    }

    private void showDate(int year,int month,int day,int hour,int mi){
        EditText et1=(EditText) findViewById(R.id.set_time_et1);
        et1.setText(year+"年"+month+"月"+day+"日"+hour+"时"+mi+"分");
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bt1:
                DialogFragment timeFragment = new TimePickerFragment();
                timeFragment.show(getFragmentManager(), "timePicker");
                break;
            case R.id.bt2:
                DialogFragment dataFragment = new DatePickerFragment();
                dataFragment.show(getFragmentManager(), "datePicker");
                break;
            default:break;
        }
    }
}
