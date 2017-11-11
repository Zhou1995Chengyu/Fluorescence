package activity.fluorescence.zjgy.com.fragment;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Created by panda on 2017/11/10.
 */

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // 使用当前日期作为日期选择对话框的默认值
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // 创建日期选择对话框的一个实例并返回它
       // return new DatePickerDialog(getActivity(), mdateListener, year, month, day);
        Dialog dialog= new DatePickerDialog(getActivity(), this, year, month, day);
        dialog.setContentView(AlertDialog.THEME_HOLO_LIGHT);
        return  dialog;
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // 当用户设置日期时执行
    }
}

