package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用受理服务协议查询
 *
 * @author auto create
 * @since 1.0, 2021-03-12 10:55:43
 */
public class ZhimaCreditPeUserContractQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7638743254786113389L;

	/**
	 * 芝麻信用场景，由芝麻信用侧分配，如：天猫信用购，淘宝租赁等
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCreditScene() {
		return this.creditScene;
	}
	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
