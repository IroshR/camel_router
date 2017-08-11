package com.iroshnk.router.transformer;

/**
 * Created by HP on 8/10/2017.
 */
public class MyTransformer {
    public String transformContent(String body) {
        String upperCaseContent = body.toUpperCase();
        return upperCaseContent;
    }
}
