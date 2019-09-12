package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.page.sign response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-05 13:45:44
 */
public class AlipayPcreditHuabeiAuthPageSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1565461411114794199L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号。只有签约成功时才会返回。后续涉及到用户已冻结额度的操作，都需要传入该协议号。请妥善保存，并在系统内建立好如下关联关系：(商户自有用户id, 支付宝用户alipay_user_id, 花呗先享协议号)
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
	 * 花呗先享签约场景
	 */
	@ApiField("auth_scene")
	private String authScene;

	/** 
	 * 用户在商户网站的登录账号，用于在签约页面展示，如果为空，则不展示。由商户传入，最终返回给商户。返回结果会做内容脱敏。
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/** 
	 * 签约过程中期望进行冻结的金额，单位为元，精确到小数点后两位
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/** 
	 * 花呗先享协议实际签约时间，格式为yyyy-MM-dd HH:mm:ss。(只有签约成功才会返回)
	 */
	@ApiField("gmt_sign")
	private Date gmtSign;

	/** 
	 * 业务成功时间
	 */
	@ApiField("gmt_trans")
	private Date gmtTrans;

	/** 
	 * 商户本次操作的请求流水号，用于标识请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。由商户传入，最终返回给商户。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 外部签约号，由商户提供，花呗先享协议中标识用户的唯一签约号（确保在商户系统中唯一）。由商户传入，最终返回给商户。
	 */
	@ApiField("out_sign_no")
	private String outSignNo;

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
	 * 业务操作状态，Y表示成功结束；N表示失败结束；I表示进行中。
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

	public void setAuthScene(String authScene) {
		this.authScene = authScene;
	}
	public String getAuthScene( ) {
		return this.authScene;
	}

	public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}
	public String getExternalLogonId( ) {
		return this.externalLogonId;
	}

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

	public void setGmtSign(Date gmtSign) {
		this.gmtSign = gmtSign;
	}
	public Date getGmtSign( ) {
		return this.gmtSign;
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

	public void setOutSignNo(String outSignNo) {
		this.outSignNo = outSignNo;
	}
	public String getOutSignNo( ) {
		return this.outSignNo;
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
