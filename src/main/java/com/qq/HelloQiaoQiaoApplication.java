package com.qq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * @program: springboot
 * @description:
 * @author: qiaoqaio
 * @create: 2022-08-02 21:06
 **/

// Spring Boot应用标注在某个类上说明这个类是SpringBoot的主配置类，SpringBoot就应该运行这个类的main方法来启动SpringBoot应用；
@SpringBootApplication
/**
* @Target({ElementType.TYPE})
 * @Retention(RetentionPolicy.RUNTIME)
 * @Documented
 * @Inherited
 * // 标注在某个类上，表示这是一个Spring Boot的配置类；
 * // **********************************************************
 * // @Target({ElementType.TYPE})
 * // @Retention(RetentionPolicy.RUNTIME)
 * // @Documented
 * // @Configuration  // @Configuration:配置类上来标注这个注解；
 * // 配置类 ----- 配置文件；配置类也是容器中的一个组件；@Component
 * // @Indexed
 * // public @interface SpringBootConfiguration {
 * @SpringBootConfiguration
 * // 开启自动配置功能；
 * // 以前我们需要配置的东西，Spring Boot帮我们自动配置；@EnableAutoConfiguration告诉SpringBoot开启自动配置功能；这样自动配置才能生效；
 * // ********************************************************
 * // @AutoConfigurationPackage  // 自动配置包
 * // @Import({AutoConfigurationImportSelector.class})   // Spring的底层注解@Import，给容器中导入一个组件；导入的组件由AutoConfigurationPackages.Registrar.class；
 * 将主配置类（@SpringBootApplication标注的类）的所在包及下面所有子包里面的所有组件扫描到Spring容器；
 * // public @interface EnableAutoConfiguration {
 * // ********************************************************
 * // @Import(EnableAutoConfigurationImportSelector.class)；
 * 给容器中导入组件？
 * EnableAutoConfigurationImportSelector：导入哪些组件的选择器；
 * 将所有需要导入的组件以全类名的方式返回；这些组件就会被添加到容器中；
 * 会给容器中导入非常多的自动配置类（xxxAutoConfiguration）；就是给容器中导入这个场景需要的所有组件，
 * 并配置好这些组件；
 * @EnableAutoConfiguration
 * @ComponentScan(
 *     excludeFilters = {@Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {TypeExcludeFilter.class}
 * ), @Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {AutoConfigurationExcludeFilter.class}
 * )}
 * )
 * public @interface SpringBootApplication {
*/
public class HelloQiaoQiaoApplication {
    public static void main(String[] args) {
        // 启动spring应用
        SpringApplication.run(HelloQiaoQiaoApplication.class, args);
    }
}
