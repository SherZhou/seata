/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.server.console.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


/**
 * @description: Spring security config in server
<<<<<<< HEAD
=======
 * @authorz: jameslcj wfnuser
>>>>>>> 95a603b2 (feature: add filter for http request)
 * @author: Sher
 */
@Configuration(proxyBeanMethods = false)

public class WebSecurityConfig  {

    /**
     * The constant AUTHORIZATION_HEADER.
     */
    public static final String AUTHORIZATION_HEADER = "Authorization";

    /**
     * The constant AUTHORIZATION_TOKEN.
     */
    public static final String AUTHORIZATION_TOKEN = "access_token";

    /**
     * The constant SECURITY_IGNORE_URLS_SPILT_CHAR.
     */
    public static final String SECURITY_IGNORE_URLS_SPILT_CHAR = ",";

    /**
     * The constant TOKEN_PREFIX.
     */
    public static final String TOKEN_PREFIX = "Bearer ";


    @Autowired
    private JwtTokenUtils tokenProvider;

    @Autowired
    private Environment env;

    /**
     * Password encoder password encoder.
     *
     * @return the password encoder
     */


}