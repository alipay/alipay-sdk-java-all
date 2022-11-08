package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 两个支付宝用户实名信息匹配校验接口
 *
 * @author auto create
 * @since 1.0, 2022-06-29 11:02:10
 */
public class AlipayUserAuthenticationMatchModel extends AlipayObject {

	private static final long serialVersionUID = 1567197186831922966L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id_1")
	private String userId1;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id_2")
	private String userId2;

	public String getUserId1() {
		return this.userId1;
	}
	public void setUserId1(String userId1) {
		this.userId1 = userId1;
	}

	public String getUserId2() {
		return this.userId2;
	}
	public void setUserId2(String userId2) {
		this.userId2 = userId2;
	}

}
