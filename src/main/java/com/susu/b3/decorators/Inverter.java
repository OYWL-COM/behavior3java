package com.susu.b3.decorators;

import com.susu.b3.constant.B3Status;
import com.susu.b3.core.Decorator;
import com.susu.b3.core.Tick;

/**
 * @author SilenceSu
 * @Email Silence.Sx@Gmail.com
 * Created by Silence on 2019/3/2.
 */
public class Inverter extends Decorator {

    @Override
    public B3Status onTick(Tick tick) {
        if (this.getChild() == null) {
            return B3Status.ERROR;
        }
        B3Status status = this.getChild().execute(tick);
        if (status == B3Status.SUCCESS) {
            status = B3Status.FAILURE;
        } else if (status == B3Status.FAILURE) {
            status = B3Status.SUCCESS;
        }
        return status;
    }
}
