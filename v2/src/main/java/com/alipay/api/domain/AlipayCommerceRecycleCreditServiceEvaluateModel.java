package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收信用取服务评估openapi
 *
 * @author auto create
 * @since 1.0, 2026-03-30 10:37:43
 */
public class AlipayCommerceRecycleCreditServiceEvaluateModel extends AlipayObject {

	private static final long serialVersionUID = 6711478828285117943L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 服务类目编码
	 */
	@ApiField("service_category")
	private String serviceCategory;

	/**
	 * 二级商户信息
	 */
	@ApiField("submerchant")
	private String submerchant;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getServiceCategory() {
		return this.serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public String getSubmerchant() {
		return this.submerchant;
	}
	public void setSubmerchant(String submerchant) {
		this.submerchant = submerchant;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
