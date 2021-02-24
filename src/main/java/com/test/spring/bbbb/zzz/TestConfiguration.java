package com.test.spring.bbbb.zzz;

import com.test.spring.util.Util;
import com.test.spring.util.Util1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;

@Configuration
//@EnableConfigurationProperties(FtpProperties.class)
//@ConditionalOnClass(PoolingFtpService.class)
//@ConditionalOnProperty(prefix = FtpProperties.prefix, name = "enabled", havingValue = "true")
public class TestConfiguration {

    @Bean
    public Util util() {
        return new Util1();
    }
//
//    @Autowired
//    private FtpProperties ftpProperties;
//    private ObjectPool<FTPClient> pool;
//
//    @Bean
//    @ConditionalOnProperty(prefix = FtpProperties.prefix, name = "pooling", havingValue = "true")
//    public FtpService ftpService() {
//
//        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
//        poolConfig.setTestOnBorrow(true);
//        poolConfig.setTestOnReturn(true);
//        poolConfig.setTestWhileIdle(true);
//        poolConfig.setMinEvictableIdleTimeMillis(60000);
//        poolConfig.setSoftMinEvictableIdleTimeMillis(50000);
//        poolConfig.setTimeBetweenEvictionRunsMillis(30000);
//        pool = new GenericObjectPool<>(new FtpClientPooledObjectFactory(ftpProperties), poolConfig);
//        preLoadingFtpClient(ftpProperties.getInitialSize(), poolConfig.getMaxIdle());
//
//        PoolingFtpService poolingFtpService = new PoolingFtpService(pool);
//
//        return poolingFtpService;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean(FtpService.class)
//    public FtpService simpleFtpService() {
//        return new SimpleFtpService(ftpProperties);
//    }
//
//    private void preLoadingFtpClient(Integer initialSize, int maxIdle) {
//        if (initialSize == null || initialSize <= 0) {
//            return;
//        }
//
//        int size = Math.min(initialSize.intValue(), maxIdle);
//        for (int i = 0; i < size; i++) {
//            try {
//                pool.addObject();
//            } catch (Exception e) {
//                log.error("preLoading FTPClient error...", e);
//            }
//        }
//
//    }
//
//    @PreDestroy
//    public void destroy() {
//        if (pool != null) {
//            pool.close();
//            if (log.isInfoEnabled()) {
//                log.info("FTP client pool destroyed!");
//            }
//        }
//    }

}
