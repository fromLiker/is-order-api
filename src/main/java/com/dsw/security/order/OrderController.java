/**
 * 
 */
package com.dsw.security.order;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
//import com.dsw.security.server.resource.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import lombok.extern.slf4j.Slf4j;

/**
 * @author Liker
 *
 */
@RestController
@RequestMapping("/orders")
//@Slf4j
public class OrderController {
	
    private static Logger log = LoggerFactory.getLogger(OrderController.class);
    
    private RestTemplate restTemplate = new RestTemplate();
    
    @PostMapping
//    public OrderInfo create(@RequestBody OrderInfo info, @AuthenticationPrincipal  String user){
//    public OrderInfo create(@RequestBody OrderInfo info, @AuthenticationPrincipal User user){
//    public OrderInfo create(@RequestBody OrderInfo info, @AuthenticationPrincipal(expression= "#this.id") Long userId){
    public OrderInfo create(@RequestBody OrderInfo info, @RequestHeader String username){
        log.info("Order id is: " + info.getProductId());
//        log.info("User is : " + user.getUsername());
//        log.info("UserId is : " + user.getId());
//        log.info("UserId is : " + userId);
        log.info("User is : " + username);
//        PriceInfo priceInfo = restTemplate.getForObject("http://localhost:9060/prices/"+info.getProductId(), PriceInfo.class);
//        log.info("Price is : " + priceInfo.getPrice());
        return info;
    }
	
//	@Autowired
//	private OAuth2RestTemplate restTemplate;
//	
//	@PostMapping
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@SentinelResource("createOrder")
//	public OrderInfo create(@RequestBody OrderInfo info, @AuthenticationPrincipal String username) throws InterruptedException {
//		log.info("user is " + username);
//		restTemplate.getForObject("http://localhost:8080/users/13", String.class);
//		Thread.sleep(RandomUtils.nextInt(100, 1000));
////		throw new RuntimeException("haha, test");
//		return info;
//	}
//	
	@GetMapping("/{id}")
//	public OrderInfo getInfo(@PathVariable Long id, @AuthenticationPrincipal String username) {
	public OrderInfo getInfo(@PathVariable Long id, @RequestHeader String username) {
		log.info("user is " + username);
		log.info("orderId is " + id);
		OrderInfo info = new OrderInfo();
		info.setId(id);
		info.setProductId(id * 5);
		return info;
	}
//	@GetMapping("/{id}")
//	public OrderInfo getInfo(@PathVariable Long id) {
//		log.info("orderId is " + id);
//		return new OrderInfo();
//	}

}