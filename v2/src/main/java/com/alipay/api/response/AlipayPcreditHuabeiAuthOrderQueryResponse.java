package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:11:53
 */
public class AlipayPcreditHuabeiAuthOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8881322964723498491L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 支付宝用户userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 支付宝侧花呗冻结解冻操作单据id
	 */
	@ApiField("auth_opt_id")
	private String authOptId;

	/** 
	 * 业务操作完成时间
	 */
	@ApiField("gmt_trans")
	private Date gmtTrans;

	/** 
	 * 支付宝用户userId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商户业务订单的简单描述，如商品名称等，长度不超过100个字母或50个汉字
	 */
	@ApiField("order_title")
	private String orderTitle;

	/** 
	 * 商户本次操作的请求流水号
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
	 * 冻结或者解冻金额
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/** 
	 * 业务操作状态，Y表示成功结束；N表示失败结束；I表示进行中。
	 */
	@ApiField("trans_status")
	private String transStatus;

	/** 
	 * 操作类型，FREEZE表示冻结操作；UNFREEZE表示解冻操作；PAY表示支付操作；SETTLE表示结算操作
	 */
	@ApiField("trans_type")
	private String transType;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
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

	public void setGmtTrans(Date gmtTrans) {
		this.gmtTrans = gmtTrans;
	}
	public Date getGmtTrans( ) {
		return this.gmtTrans;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}
	public String getOrderTitle( ) {
		return this.orderTitle;
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

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}
	public String getTransAmount( ) {
		return this.transAmount;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}
	public String getTransStatus( ) {
		return this.transStatus;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getTransType( ) {
		return this.transType;
	}

}
