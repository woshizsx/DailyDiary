package sxkeji.net.dailydiary.utils;

import android.os.CountDownTimer;
import android.widget.TextView;

public class TimeCount extends CountDownTimer {
    private TextView checking;

    public TimeCount(long millisInFuture, long countDownInterval,
                     TextView checking) {
        super(millisInFuture, countDownInterval);// 参数依次为总时长,和计时的时间间隔
        this.checking = checking;
    }

    @Override
    public void onFinish() {// 计时完毕时触发
        checking.setText("重新验证");
        checking.setClickable(true);
    }

    @Override
    public void onTick(long millisUntilFinished) {// 计时过程显示
        checking.setClickable(false);
        checking.setText("剩余" + millisUntilFinished / 1000 + "秒");
    }
}
