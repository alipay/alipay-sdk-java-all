package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.inventory.out.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:07
 */
public class MybankCreditSupplychainInventoryOutConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1387884453983868294L;

	/** 
	 * 警戒额度
	 */
	@ApiField("alert_amt")
	private String alertAmt;

	/** 
	 * 标识客户的当前贷款状态
	 */
	@ApiField("arg_status")
	private String argStatus;

	/** 
	 * CONTROL 可以出库
BAN 禁止出库
WARNING 达到警戒比例（此时也可以出库）
	 */
	@ApiField("controll_status")
	private String controllStatus;

	/** 
	 * 授信额度
	 */
	@ApiField("credit_amt")
	private String creditAmt;

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
	 * 实际待还款总金额=待还款本金+所有利息(正常利息+逾期利息+逾期本金罚息+逾期利息罚息)
	 */
	@ApiField("repay_amt")
	private String repayAmt;

	/** 
	 * 水位额度
	 */
	@ApiField("water_level_amt")
	private String waterLevelAmt;

	public void setAlertAmt(String alertAmt) {
		this.alertAmt = alertAmt;
	}
	public String getAlertAmt( ) {
		return this.alertAmt;
	}

	public void setArgStatus(String argStatus) {
		this.argStatus = argStatus;
	}
	public String getArgStatus( ) {
		return this.argStatus;
	}

	public void setControllStatus(String controllStatus) {
		this.controllStatus = controllStatus;
	}
	public String getControllStatus( ) {
		return this.controllStatus;
	}

	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}
	public String getCreditAmt( ) {
		return this.creditAmt;
	}

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

	public void setWaterLevelAmt(String waterLevelAmt) {
		this.waterLevelAmt = waterLevelAmt;
	}
	public String getWaterLevelAmt( ) {
		return this.waterLevelAmt;
	}

}
