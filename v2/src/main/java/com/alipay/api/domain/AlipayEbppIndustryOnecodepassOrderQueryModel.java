package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一码通订单查询
 *
 * @author auto create
 * @since 1.0, 2022-12-20 19:50:59
 */
public class AlipayEbppIndustryOnecodepassOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7498564853823173939L;

	/**
	 * 机构编码
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
