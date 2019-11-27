package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.inremit.remittance.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasInremitRemittanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7284518392789974485L;

	/** 
	 * 汇款单的接受时间
	 */
	@ApiField("accept_time")
	private String acceptTime;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("alipay_trans_id")
	private String alipayTransId;

	/** 
	 * 银行从汇款机构的NRA账号扣钱的交易号
	 */
	@ApiField("bank_trans_id")
	private String bankTransId;

	/** 
	 * 银行实际使用的汇率
	 */
	@ApiField("deduct_fx_rate")
	private String deductFxRate;

	/** 
	 * 表示api调用失败的原因
	 */
	@ApiField("error")
	private String error;

	/** 
	 * 表示这个api的调用是否成功
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 外部商户的交易号码
	 */
	@ApiField("partner_trans_id")
	private String partnerTransId;

	/** 
	 * 实际接收方收到的钱的数目
	 */
	@ApiField("receiving_amount")
	private String receivingAmount;

	/** 
	 * 接收方实际收到金额对应的币种
	 */
	@ApiField("receiving_amount_currency")
	private String receivingAmountCurrency;

	/** 
	 * 汇款成功的时间戳，北京时间
	 */
	@ApiField("result_time")
	private String resultTime;

	/** 
	 * 实际上从汇款机构在银行开的NRA账号里面扣除的数额
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/** 
	 * 银行从NRA账号扣除金额对应的币种
	 */
	@ApiField("settle_amount_currency")
	private String settleAmountCurrency;

	/** 
	 * 汇款单当前状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 错误状态的原因
	 */
	@ApiField("status_error")
	private String statusError;

	public void setAcceptTime(String acceptTime) {
		this.acceptTime = acceptTime;
	}
	public String getAcceptTime( ) {
		return this.acceptTime;
	}

	public void setAlipayTransId(String alipayTransId) {
		this.alipayTransId = alipayTransId;
	}
	public String getAlipayTransId( ) {
		return this.alipayTransId;
	}

	public void setBankTransId(String bankTransId) {
		this.bankTransId = bankTransId;
	}
	public String getBankTransId( ) {
		return this.bankTransId;
	}

	public void setDeductFxRate(String deductFxRate) {
		this.deductFxRate = deductFxRate;
	}
	public String getDeductFxRate( ) {
		return this.deductFxRate;
	}

	public void setError(String error) {
		this.error = error;
	}
	public String getError( ) {
		return this.error;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setPartnerTransId(String partnerTransId) {
		this.partnerTransId = partnerTransId;
	}
	public String getPartnerTransId( ) {
		return this.partnerTransId;
	}

	public void setReceivingAmount(String receivingAmount) {
		this.receivingAmount = receivingAmount;
	}
	public String getReceivingAmount( ) {
		return this.receivingAmount;
	}

	public void setReceivingAmountCurrency(String receivingAmountCurrency) {
		this.receivingAmountCurrency = receivingAmountCurrency;
	}
	public String getReceivingAmountCurrency( ) {
		return this.receivingAmountCurrency;
	}

	public void setResultTime(String resultTime) {
		this.resultTime = resultTime;
	}
	public String getResultTime( ) {
		return this.resultTime;
	}

	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}
	public String getSettleAmount( ) {
		return this.settleAmount;
	}

	public void setSettleAmountCurrency(String settleAmountCurrency) {
		this.settleAmountCurrency = settleAmountCurrency;
	}
	public String getSettleAmountCurrency( ) {
		return this.settleAmountCurrency;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusError(String statusError) {
		this.statusError = statusError;
	}
	public String getStatusError( ) {
		return this.statusError;
	}

}
