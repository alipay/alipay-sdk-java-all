package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务权益使用信息查询
 *
 * @author auto create
 * @since 1.0, 2026-10-26 10:32:58
 */
public class AlipayCommerceMedicalInsuranceServicerightsusageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4811935464691958135L;

	/**
	 * 保司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 履约单ID
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getFulfillmentId() {
		return this.fulfillmentId;
	}
	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
