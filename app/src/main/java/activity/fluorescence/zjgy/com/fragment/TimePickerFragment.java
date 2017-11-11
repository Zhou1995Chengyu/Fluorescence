package activity.fluorescence.zjgy.com.fragment;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by panda on 2017/11/10.
 */

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // 使用当前时间作为时间选择对话框的默认值
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        //创建时间选择对话框的新实例并返回它
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // 当用户选择时间时执行
    }
}

