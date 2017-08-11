package com.iroshnk.router;

import org.apache.camel.spring.Main;

/**
 * Created by HP on 8/9/2017.
 */
public class StartRouter {
    public static void main(String[] args) throws Exception {
        StartRouter router = new StartRouter();
        router.boot();
    }

    private void boot() throws Exception {
        final Main main = new Main();
        main.setApplicationContextUri("app_context.xml");
        System.out.println("Starting Router. Use ctrl + c to terminate the JVM.\n");
        main.run();
    }
}
