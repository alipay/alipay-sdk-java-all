package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单查询
 *
 * @author auto create
 * @since 1.0, 2025-04-22 17:39:53
 */
public class AlipayCommerceMedicalInsuranceOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3446915593492798563L;

	/**
	 * 标识实际赔付的保险公司，由支付宝定义枚举值，垫资的实际理赔保司为众安，那么枚举值为ZHONGAN
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 试算流水号。
	 */
	@ApiField("pre_settle_no")
	private String preSettleNo;

	/**
	 * 外部请求来源，用于区分接入保司类型或垫资方。
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝交易号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易类型。
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPreSettleNo() {
		return this.preSettleNo;
	}
	public void setPreSettleNo(String preSettleNo) {
		this.preSettleNo = preSettleNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
