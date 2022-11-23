package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.order.freeze response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-21 22:11:34
 */
public class AlipayFundAuthOrderFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2583394459515473198L;

	/** 
	 * 本次操作冻结的金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝的资金授权订单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 本次冻结操作中信用冻结金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("credit_amount")
	private String creditAmount;

	/** 
	 * 本次冻结操作中自有资金冻结金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("fund_amount")
	private String fundAmount;

	/** 
	 * 资金授权成功时间
格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_trans")
	private Date gmtTrans;

	/** 
	 * 支付宝的资金操作流水号
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户的授权资金订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户本次资金操作的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 付款方支付宝账号（Email或手机号）
	 */
	@ApiField("payer_logon_id")
	private String payerLogonId;

	/** 
	 * 支付宝openId，用户（userId）在应用（appId）下的唯一用户标识。
	 */
	@ApiField("payer_open_id")
	private String payerOpenId;

	/** 
	 * 付款方支付宝用户号
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/** 
	 * 预授权类型，目前支持 CREDIT_AUTH(信用预授权);
商户可根据该标识来判断该笔预授权的类型，当返回值为"CREDIT_AUTH"表明该笔预授权为信用预授权，没有真实冻结资金；当返回值为空或者不为"CREDIT_AUTH"则表明该笔预授权为普通资金预授权，会冻结用户资金。
	 */
	@ApiField("pre_auth_type")
	private String preAuthType;

	/** 
	 * 资金预授权明细的状态
目前支持：  
INIT：初始
SUCCESS: 成功
CLOSED：关闭
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 标价币种,  amount 对应的币种单位。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	public String getAuthNo( ) {
		return this.authNo;
	}

	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getCreditAmount( ) {
		return this.creditAmount;
	}

	public void setFundAmount(String fundAmount) {
		this.fundAmount = fundAmount;
	}
	public String getFundAmount( ) {
		return this.fundAmount;
	}

	public void setGmtTrans(Date gmtTrans) {
		this.gmtTrans = gmtTrans;
	}
	public Date getGmtTrans( ) {
		return this.gmtTrans;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getOperationId( ) {
		return this.operationId;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setPayerLogonId(String payerLogonId) {
		this.payerLogonId = payerLogonId;
	}
	public String getPayerLogonId( ) {
		return this.payerLogonId;
	}

	public void setPayerOpenId(String payerOpenId) {
		this.payerOpenId = payerOpenId;
	}
	public String getPayerOpenId( ) {
		return this.payerOpenId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	public String getPayerUserId( ) {
		return this.payerUserId;
	}

	public void setPreAuthType(String preAuthType) {
		this.preAuthType = preAuthType;
	}
	public String getPreAuthType( ) {
		return this.preAuthType;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}
	public String getTransCurrency( ) {
		return this.transCurrency;
	}

}
