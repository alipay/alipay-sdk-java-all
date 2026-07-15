package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.affinitycard.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-02 15:42:55
 */
public class AlipayPcreditHuabeiAffinitycardApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1348422835526593843L;

	/** 
	 * 可用额度，单位：元，精确到小数点后2位
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 还款日，08表示每月8号，10表示每月10号
	 */
	@ApiField("repay_date")
	private String repayDate;

	/** 
	 * 总额度，单位：元，精确到小数点后2位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 花呗联名卡产品账户，后续可以基于该参数查询和关闭联名卡
	 */
	@ApiField("user_prod_account_no")
	private String userProdAccountNo;

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

	public void setUserProdAccountNo(String userProdAccountNo) {
		this.userProdAccountNo = userProdAccountNo;
	}
	public String getUserProdAccountNo( ) {
		return this.userProdAccountNo;
	}

}
