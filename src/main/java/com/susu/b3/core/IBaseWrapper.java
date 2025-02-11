package com.susu.b3.core;

import com.susu.b3.constant.B3Status;

/**
 * 包装类
 * @author SilenceSu
 * @Email Silence.Sx@Gmail.com
 * Created by Silence on 2019/3/4.
 */
public interface IBaseWrapper {

    B3Status run(Tick tick);

    void enter(Tick tick);

    void open(Tick tick);

    B3Status tick(Tick tick);

    void close(Tick tick);

    void exit(Tick tick);
}
