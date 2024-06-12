package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单周期数据查询
 *
 * @author auto create
 * @since 1.0, 2022-11-16 19:31:17
 */
public class AlipayPcreditHuabeiAuthAccumulationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5871765257576955483L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 买家在支付宝的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 买家在支付宝的用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 协议结算周期，使用支付宝端回传的周期信息。
	 */
	@ApiField("period")
	private String period;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

}
