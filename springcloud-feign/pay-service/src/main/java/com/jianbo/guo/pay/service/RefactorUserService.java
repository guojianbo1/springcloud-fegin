package com.jianbo.guo.pay.service;

import com.jianbo.guo.service.UserService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/22
 * @since 1.0
 */
@FeignClient(value = "user-service")
public interface RefactorUserService extends UserService {

}
