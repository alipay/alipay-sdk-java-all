package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商户下的设备服务列表
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:49:44
 */
public class AlipayCommerceIotServicemodelServicelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1685433824931476623L;

	/**
	 * 服务的类型，如播报服务（service_voice），打印服务（service_print）
	 */
	@ApiField("service_key")
	private String serviceKey;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getServiceKey() {
		return this.serviceKey;
	}
	public void setServiceKey(String serviceKey) {
		this.serviceKey = serviceKey;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
