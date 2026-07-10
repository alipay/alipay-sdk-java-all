package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前置优惠咨询
 *
 * @author auto create
 * @since 1.0, 2026-05-27 16:54:56
 */
public class AlipayCommerceTransportIndustryPromoConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8599339281617617445L;

	/**
	 * 行业场景编码
	 */
	@ApiField("industry_scene")
	private String industryScene;

	/**
	 * 支付宝open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单金额,单位：元，支持两位小数
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 合作方编码
	 */
	@ApiField("partner_code")
	private String partnerCode;

	/**
	 * 二级商户id
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getIndustryScene() {
		return this.industryScene;
	}
	public void setIndustryScene(String industryScene) {
		this.industryScene = industryScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPartnerCode() {
		return this.partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
