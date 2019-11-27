package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RemitExchangeRate;
import com.alipay.api.domain.RemitAgent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.fund.remit.receive.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasFundRemitReceiveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5251842767569817654L;

	/** 
	 * bank_name, 汇款银行名
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * bank_trans_id, 银行交易号
	 */
	@ApiField("bank_trans_id")
	private String bankTransId;

	/** 
	 * error_code, 错误码. 如果汇款状态status = FAILED, 则提供细节错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * error_message, 错误信息. 如果汇款状态status = FAILED, 则提供error_message描述具体错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * memo, 汇款留言，汇款人填写
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * network_trans_id是汇款机构用来标示一笔汇款交易的。
	 */
	@ApiField("network_trans_id")
	private String networkTransId;

	/** 
	 * network_trans_time, 标明汇款机构的交易时间。格式采用ISO 8601 YYYY-MM-DDThh:mm:ssZ。
	 */
	@ApiField("network_trans_time")
	private String networkTransTime;

	/** 
	 * receive_amount, 汇款汇入金额, 采用receive_currency参数标示的汇出币种最小金额单位。例如: receive_currency = USD, USD最小单位为$0.01(一美分),则 receive_amount = 100 是$1.00USD。如果receive_currency = JPY, JPY最小单位是1日元，则receive_amount = 100是100JPY
	 */
	@ApiField("receive_amount")
	private Long receiveAmount;

	/** 
	 * receive_currency, 汇款汇入币种
	 */
	@ApiField("receive_currency")
	private String receiveCurrency;

	/** 
	 * recieve_fx_rate, 收款汇率。支付宝给汇款代理展示用的汇率
	 */
	@ApiField("receive_fx_rate")
	private RemitExchangeRate receiveFxRate;

	/** 
	 * receive_purpose, 收款方填写的收款目的。enum值包括：
TRAVEL_EXPENSE	
PATENT_FEE
CONSULTING_FEE
SERVICE_FEE
LIVING_EXPENSE
OTHER
	 */
	@ApiField("receive_purpose")
	private String receivePurpose;

	/** 
	 * 汇款Agent信息
	 */
	@ApiField("send_agent")
	private RemitAgent sendAgent;

	/** 
	 * send_amount, 汇款汇出金额, 采用send_currency参数标示的汇出币种最小金额单位。例如: send_currency = USD, USD最小单位为$0.01(一美分),则 send_amount = 100 是$1.00USD。如果send_currency = JPY, JPY最小单位是1日元，则send_amount = 100是100JPY
	 */
	@ApiField("send_amount")
	private Long sendAmount;

	/** 
	 * send_currency, 汇款汇出币种
	 */
	@ApiField("send_currency")
	private String sendCurrency;

	/** 
	 * send_fx_rate, 汇款汇率。汇款代理展示给汇款方的汇率
	 */
	@ApiField("send_fx_rate")
	private RemitExchangeRate sendFxRate;

	/** 
	 * send_purpose, 汇款方填写的汇款目的。enum值包括：
TRAVEL_EXPENSE	
PATENT_FEE
CONSULTING_FEE
SERVICE_FEE
LIVING_EXPENSE
OTHER
	 */
	@ApiField("send_purpose")
	private String sendPurpose;

	/** 
	 * status, 汇款交易状态信息。枚举值包括: 
SUCCESS: 汇款处理成功
FAILED: 汇款处理失败
WAIT_FOR_RECEIVER: 等待收款人确认
PENDING_BANK_SUBMIT: 非银行工作时间，汇款处理等待银行提交
BANK_PROCESSING: 汇款请求银行处理中
	 */
	@ApiField("status")
	private String status;

	/** 
	 * time_created, 转账交易创建时间。格式采用ISO 8601 YYYY-MM-DDThh:mm:ssZ。
	 */
	@ApiField("time_created")
	private String timeCreated;

	/** 
	 * time_failed, 交易完成并且失败的时间。格式采用ISO 8601 YYYY-MM-DDThh:mm:ssZ。
	 */
	@ApiField("time_failed")
	private String timeFailed;

	/** 
	 * time_reciever_confirmed, 收款人确认交易时间。格式采用ISO 8601 YYYY-MM-DDThh:mm:ssZ。
	 */
	@ApiField("time_reciever_confirmed")
	private String timeRecieverConfirmed;

	/** 
	 * time_submit_to_bank, 交易提交给银行时间。格式采用ISO 8601 YYYY-MM-DDThh:mm:ssZ。
	 */
	@ApiField("time_submit_to_bank")
	private String timeSubmitToBank;

	/** 
	 * time_success, 交易完成并且成功的时间。格式采用ISO 8601 YYYY-MM-DDThh:mm:ssZ。
	 */
	@ApiField("time_success")
	private String timeSuccess;

	/** 
	 * 支付宝交易号,用来唯一确认一条汇款记录。
	 */
	@ApiField("trans_id")
	private String transId;

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName( ) {
		return this.bankName;
	}

	public void setBankTransId(String bankTransId) {
		this.bankTransId = bankTransId;
	}
	public String getBankTransId( ) {
		return this.bankTransId;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setNetworkTransId(String networkTransId) {
		this.networkTransId = networkTransId;
	}
	public String getNetworkTransId( ) {
		return this.networkTransId;
	}

	public void setNetworkTransTime(String networkTransTime) {
		this.networkTransTime = networkTransTime;
	}
	public String getNetworkTransTime( ) {
		return this.networkTransTime;
	}

	public void setReceiveAmount(Long receiveAmount) {
		this.receiveAmount = receiveAmount;
	}
	public Long getReceiveAmount( ) {
		return this.receiveAmount;
	}

	public void setReceiveCurrency(String receiveCurrency) {
		this.receiveCurrency = receiveCurrency;
	}
	public String getReceiveCurrency( ) {
		return this.receiveCurrency;
	}

	public void setReceiveFxRate(RemitExchangeRate receiveFxRate) {
		this.receiveFxRate = receiveFxRate;
	}
	public RemitExchangeRate getReceiveFxRate( ) {
		return this.receiveFxRate;
	}

	public void setReceivePurpose(String receivePurpose) {
		this.receivePurpose = receivePurpose;
	}
	public String getReceivePurpose( ) {
		return this.receivePurpose;
	}

	public void setSendAgent(RemitAgent sendAgent) {
		this.sendAgent = sendAgent;
	}
	public RemitAgent getSendAgent( ) {
		return this.sendAgent;
	}

	public void setSendAmount(Long sendAmount) {
		this.sendAmount = sendAmount;
	}
	public Long getSendAmount( ) {
		return this.sendAmount;
	}

	public void setSendCurrency(String sendCurrency) {
		this.sendCurrency = sendCurrency;
	}
	public String getSendCurrency( ) {
		return this.sendCurrency;
	}

	public void setSendFxRate(RemitExchangeRate sendFxRate) {
		this.sendFxRate = sendFxRate;
	}
	public RemitExchangeRate getSendFxRate( ) {
		return this.sendFxRate;
	}

	public void setSendPurpose(String sendPurpose) {
		this.sendPurpose = sendPurpose;
	}
	public String getSendPurpose( ) {
		return this.sendPurpose;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTimeCreated(String timeCreated) {
		this.timeCreated = timeCreated;
	}
	public String getTimeCreated( ) {
		return this.timeCreated;
	}

	public void setTimeFailed(String timeFailed) {
		this.timeFailed = timeFailed;
	}
	public String getTimeFailed( ) {
		return this.timeFailed;
	}

	public void setTimeRecieverConfirmed(String timeRecieverConfirmed) {
		this.timeRecieverConfirmed = timeRecieverConfirmed;
	}
	public String getTimeRecieverConfirmed( ) {
		return this.timeRecieverConfirmed;
	}

	public void setTimeSubmitToBank(String timeSubmitToBank) {
		this.timeSubmitToBank = timeSubmitToBank;
	}
	public String getTimeSubmitToBank( ) {
		return this.timeSubmitToBank;
	}

	public void setTimeSuccess(String timeSuccess) {
		this.timeSuccess = timeSuccess;
	}
	public String getTimeSuccess( ) {
		return this.timeSuccess;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getTransId( ) {
		return this.transId;
	}

}
