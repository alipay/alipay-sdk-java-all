package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.inventory.out.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class MybankCreditSupplychainInventoryOutApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2594521781354441477L;

	/** 
	 * 待还正常利息
	 */
	@ApiField("normal_int_amt")
	private String normalIntAmt;

	/** 
	 * 待还逾期利息
	 */
	@ApiField("ovd_int_amt")
	private String ovdIntAmt;

	/** 
	 * 待还逾期利息罚息
	 */
	@ApiField("ovd_int_pen_int_amt")
	private String ovdIntPenIntAmt;

	/** 
	 * 待还逾期本金罚息
	 */
	@ApiField("ovd_prin_pen_int_amt")
	private String ovdPrinPenIntAmt;

	/** 
	 * 待还款本金
	 */
	@ApiField("prin_amt")
	private String prinAmt;

	/** 
	 * 实际待还款总金额=水位差+所有利息(正常利息+逾期利息+逾期本金罚息+逾期利息罚息)，水位差 ＝ 正常本金-水位额度
	 */
	@ApiField("repay_amt")
	private String repayAmt;

	public void setNormalIntAmt(String normalIntAmt) {
		this.normalIntAmt = normalIntAmt;
	}
	public String getNormalIntAmt( ) {
		return this.normalIntAmt;
	}

	public void setOvdIntAmt(String ovdIntAmt) {
		this.ovdIntAmt = ovdIntAmt;
	}
	public String getOvdIntAmt( ) {
		return this.ovdIntAmt;
	}

	public void setOvdIntPenIntAmt(String ovdIntPenIntAmt) {
		this.ovdIntPenIntAmt = ovdIntPenIntAmt;
	}
	public String getOvdIntPenIntAmt( ) {
		return this.ovdIntPenIntAmt;
	}

	public void setOvdPrinPenIntAmt(String ovdPrinPenIntAmt) {
		this.ovdPrinPenIntAmt = ovdPrinPenIntAmt;
	}
	public String getOvdPrinPenIntAmt( ) {
		return this.ovdPrinPenIntAmt;
	}

	public void setPrinAmt(String prinAmt) {
		this.prinAmt = prinAmt;
	}
	public String getPrinAmt( ) {
		return this.prinAmt;
	}

	public void setRepayAmt(String repayAmt) {
		this.repayAmt = repayAmt;
	}
	public String getRepayAmt( ) {
		return this.repayAmt;
	}

}
