package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询权益信息
 *
 * @author auto create
 * @since 1.0, 2025-05-27 19:12:31
 */
public class AlipayCommerceTransportVehownerbaseBenefitinterestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7225874483345563719L;

	/**
	 * 权益编码，用于获取对应的权益信息，从会员信息获取。
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
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
