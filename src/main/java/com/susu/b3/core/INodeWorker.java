package com.susu.b3.core;

import com.susu.b3.constant.B3Status;

/**
 * @author SilenceSu
 * @Email Silence.Sx@Gmail.com
 * Created by Silence on 2019/3/2.
 */
public interface INodeWorker {

    void onEnter(Tick tick);

    void onOpen(Tick tick);

    B3Status onTick(Tick tick);

    void onClose(Tick tick);

    void onExit(Tick tick);

}
