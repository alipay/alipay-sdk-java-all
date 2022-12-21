package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一码通关单接口
 *
 * @author auto create
 * @since 1.0, 2022-12-20 19:51:37
 */
public class AlipayEbppIndustryOnecodepassOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 8687886883889762836L;

	/**
	 * 机构编码，接入时由支付宝小二分配
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
