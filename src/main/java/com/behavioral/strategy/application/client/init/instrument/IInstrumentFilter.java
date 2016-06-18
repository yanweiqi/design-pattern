package com.behavioral.strategy.application.client.init.instrument;

import com.behavioral.strategy.application.client.init.domain.Instrument;

/**
 * Created by yujianming on 2016/2/18.
 */
@FunctionalInterface
public interface IInstrumentFilter {
	
    boolean filter(Instrument instrument);
}
