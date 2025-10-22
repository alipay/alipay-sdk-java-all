package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.affinitycard.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-11 16:52:30
 */
public class AlipayPcreditHuabeiAffinitycardApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6274362666478695723L;

	/** 
	 * 可用额度，单位：元，精确到小数点后2位
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 08-每月8号
10-每月10号
	 */
	@ApiField("repay_date")
	private String repayDate;

	/** 
	 * 总额度，单位：元，精确到小数点后2位
	 */
	@ApiField("total_amount")
	private String totalAmount;

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
