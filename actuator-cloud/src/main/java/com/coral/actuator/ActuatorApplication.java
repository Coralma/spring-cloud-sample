package com.coral.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-boot-actuator模块提供了一个监控和管理生产环境的模块，可以使用http、jmx、ssh、telnet等拉管理和监控应用。
 */
@RestController
@SpringBootApplication
public class ActuatorApplication {

    @RequestMapping(value = "/act", method = RequestMethod.GET)
    public String act() {
        return "Actuator Test Case";
    }

    /**
     * 通过URL监控当前系统状态
     * 健康情况：    http://localhost:8080/health
     *
     * 具体明细如下：
     autoconfig	显示一个auto-configuration的报告，该报告展示所有auto-configuration候选者及它们被应用或未被应用的原因	true
     beans	显示一个应用中所有Spring Beans的完整列表	true
     configprops	显示一个所有@ConfigurationProperties的整理列表	true
     dump	执行一个线程转储	true
     env	暴露来自Spring　ConfigurableEnvironment的属性	true
     health	展示应用的健康信息（当使用一个未认证连接访问时显示一个简单的’status’，使用认证连接访问则显示全部信息详情）	false
     info	显示任意的应用信息	false
     metrics	展示当前应用的’指标’信息	true
     mappings	显示一个所有@RequestMapping路径的整理列表	true
     shutdown	允许应用以优雅的方式关闭（默认情况下不启用）	true
     trace	显示trace信息（默认为最新的一些HTTP请求）
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }

}
