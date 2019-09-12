package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-04 22:11:35
 */
public class AlipayUserAgreementTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 4582765443741521124L;

	/** 
	 * 单次金额限制
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 执行时间
	 */
	@ApiField("execute_time")
	private String executeTime;

	/** 
	 * 周期
	 */
	@ApiField("period")
	private String period;

	/** 
	 * 周期类型
	 */
	@ApiField("period_type")
	private String periodType;

	/** 
	 * 总金额限制
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 总支付次数
	 */
	@ApiField("total_payments")
	private String totalPayments;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}
	public String getExecuteTime( ) {
		return this.executeTime;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
	public String getPeriod( ) {
		return this.period;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}
	public String getPeriodType( ) {
		return this.periodType;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalPayments(String totalPayments) {
		this.totalPayments = totalPayments;
	}
	public String getTotalPayments( ) {
		return this.totalPayments;
	}

}
