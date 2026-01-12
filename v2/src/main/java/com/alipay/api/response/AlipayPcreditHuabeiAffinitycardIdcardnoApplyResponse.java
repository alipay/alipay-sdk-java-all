package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.affinitycard.idcardno.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-09 10:57:45
 */
public class AlipayPcreditHuabeiAffinitycardIdcardnoApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5582645566494769915L;

	/** 
	 * 支付宝用户2088账号
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 可用额度，单位：元，精确到小数点后2位
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 08-每月8号 10-每月10号
	 */
	@ApiField("repay_date")
	private String repayDate;

	/** 
	 * 总额度，单位：元，精确到小数点后2位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}
	public String getRepayDate( ) {
		return this.repayDate;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
