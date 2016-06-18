package com.behavioral.strategy.application.client.init.instrument;

import com.behavioral.strategy.application.client.init.domain.IInstrumentsPicker;

/**
 * Created by yujianming on 2016/1/28.
 */
@FunctionalInterface
public interface IInstrumentSelector {
    void instruments(IInstrumentsPicker universe);
}
