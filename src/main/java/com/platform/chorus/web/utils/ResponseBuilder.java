package com.platform.chorus.web.utils;

import com.platform.chorus.web.swagger.model.SuccessResponseBody;

/**
 * Create by A.T on 2019/4/18
 */
public class ResponseBuilder {
    static public SuccessResponseBody success() {
        return new SuccessResponseBody();
    }
}
