package com.iroshnk.router.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by HP on 8/9/2017.
 */
public class CopyProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Now processing ");
        System.out.println("Now processing " + exchange.getIn().getBody(String.class));
        //exchange.getIn().setBody("Now processing " + exchange.getIn().getBody(String.class));
    }
}
