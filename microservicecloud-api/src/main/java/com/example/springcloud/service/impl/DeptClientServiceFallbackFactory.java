package com.example.springcloud.service.impl;

import com.example.springcloud.entities.Dept;
import com.example.springcloud.service.IDeptFeignClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *  1.服务降级处理是在客户端实现完成的，与服务端没有关系
 *  2.@Component 把普通pojo实例化到spring容器中，相当于配置文件中的 <bean id="" class=""/>）
 *   泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类。
 * @author GuLin
 * @date 2021-05-24 15:40
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<IDeptFeignClientService> {


    @Override
    public IDeptFeignClientService create(Throwable throwable) {
        return new IDeptFeignClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(long id) {
                return new Dept().setDeptNo(id).setDeptName("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDbSource("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
