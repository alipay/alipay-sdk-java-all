package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.order.freeze response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-30 21:50:00
 */
public class AlipayPcreditHuabeiAuthOrderFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4847446265227884676L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 协议状态。Y表示状态有效，N表示状态失效
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 支付宝侧花呗冻结解冻操作单据id
	 */
	@ApiField("auth_opt_id")
	private String authOptId;

	/** 
	 * 花呗冻结金额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/** 
	 * 冻结成功时间
	 */
	@ApiField("gmt_trans")
	private Date gmtTrans;

	/** 
	 * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 完成本次操作时，用户资金池余额快照。仅作提示用，请勿用于核对，并发情况下数值有可能不准确。两位小数，单位元。
	 */
	@ApiField("rest_freeze_amount")
	private String restFreezeAmount;

	/** 
	 * 商户的支付宝用户id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 业务操作状态，Y表示成功；N表示失败
	 */
	@ApiField("trans_status")
	private String transStatus;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setAuthOptId(String authOptId) {
		this.authOptId = authOptId;
	}
	public String getAuthOptId( ) {
		return this.authOptId;
	}

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

	public void setGmtTrans(Date gmtTrans) {
		this.gmtTrans = gmtTrans;
	}
	public Date getGmtTrans( ) {
		return this.gmtTrans;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRestFreezeAmount(String restFreezeAmount) {
		this.restFreezeAmount = restFreezeAmount;
	}
	public String getRestFreezeAmount( ) {
		return this.restFreezeAmount;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerId( ) {
		return this.sellerId;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}
	public String getTransStatus( ) {
		return this.transStatus;
	}

}
