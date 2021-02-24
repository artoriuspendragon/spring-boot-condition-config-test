package com.test.spring.aaa.aaa.cddd;


import com.test.spring.util.Util;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnBean(FtpService.class)
@ConditionalOnBean(Util.class)
public class TestService8 {
    private String test="11";
//
//    @Autowired
//    private UserOperationSynchronizer userOperationSynchronizer;
//
//    @Autowired
//    private EquipLogSynchronizer equipLogSynchronizer;
//
//    @Autowired
//    private EquipPowerSynchronizer equipPowerSynchronizer;
//
//    @Autowired
//    private EquipRuntimeSynchronizer equipRuntimeSynchronizer;
//
//    @Autowired
//    private ScadaEquipErrorDurationSynchronizer scadaEquipErrorDurationSynchronizer;
//
//    public void synchronize() {
//        //同步用户操作指令信息
//        userOperationSynchronizer.doSynchronize();
//        //同步设备运行
//        equipRuntimeSynchronizer.doSynchronize();
//        //同步设备运行日志
//        equipLogSynchronizer.doSynchronize();
//        //同步用电量信息
//        equipPowerSynchronizer.doSynchronize();
//        //同步故障次数和持续时间
//        scadaEquipErrorDurationSynchronizer.doSynchronize();
//    }

}
