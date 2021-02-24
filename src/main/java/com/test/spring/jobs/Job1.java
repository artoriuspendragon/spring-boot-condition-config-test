package com.test.spring.jobs;

import com.test.spring.aaa.aaa.bbb.aaa.TestService3;
import com.test.spring.aaa.aaa.bbb.bbbb.TestService4;
import com.test.spring.aaa.aaa.cddd.TestService7;
import com.test.spring.aaa.aaa.cddd.TestService8;
import com.test.spring.aaa.aaa.cddd.aaaa.TestService5;
import com.test.spring.aaa.aaa.zzzz.aaaa.TestService6;
import com.test.spring.aabb.ccccd.TestService1;
import com.test.spring.aabb.ccccd.TestService2;
import com.test.spring.bbbb.TestService9;
import com.test.spring.bbbb.zzz.TestService10;
import com.test.spring.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Util.class)
public class Job1 {
    @Autowired
    TestService1 testService1;
    @Autowired
    TestService2 testService2;
    @Autowired
    TestService3 testService3;
    @Autowired
    TestService4 testService4;
    @Autowired
    TestService5 testService5;
    @Autowired
    TestService6 testService6;
    @Autowired
    TestService7 testService7;
    @Autowired
    TestService8 testService8;
    @Autowired
    TestService9 testService9;
    @Autowired
    TestService10 testService10;

}
