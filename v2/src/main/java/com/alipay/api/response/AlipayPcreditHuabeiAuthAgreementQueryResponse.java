package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 14:39:17
 */
public class AlipayPcreditHuabeiAuthAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8642294726216582315L;

	/** 
	 * 协议名称
	 */
	@ApiField("agreement_name")
	private String agreementName;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员协议号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 协议状态。Y表示状态有效，N表示状态失效
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 支付宝用户userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 花芝轻会员签约场景，商户和支付宝签约时确定，商户接入时需要咨询技术支持。
	 */
	@ApiField("auth_scene")
	private String authScene;

	/** 
	 * 用户在商户网站的登录账号
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/** 
	 * 签约时间。如果是在签状态，返回签约时间。
	 */
	@ApiField("gmt_sign")
	private Date gmtSign;

	/** 
	 * 花芝轻会员协议解约时间。如果是解约状态，才返回该字段。
	 */
	@ApiField("gmt_unsign")
	private Date gmtUnsign;

	/** 
	 * 支付宝用户userId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 外部业务类型，用于区分本次业务交互在商户侧具体的业务类别，提供给商家进行特定逻辑的处理
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/** 
	 * 外部签约号，由商户提供，花芝轻会员协议中标识用户的唯一签约号（确保在商户系统中唯一）。由商户签约时传入，最终返回给商户。
	 */
	@ApiField("out_sign_no")
	private String outSignNo;

	/** 
	 * 用户在本花芝轻会员协议中，剩余的总冻结额度（资金池总余额），数值能实时准确，可以用于核对。两位小数，单位元。
	 */
	@ApiField("rest_freeze_amount")
	private String restFreezeAmount;

	public void setAgreementName(String agreementName) {
		this.agreementName = agreementName;
	}
	public String getAgreementName( ) {
		return this.agreementName;
	}

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

	public void setGmtSign(Date gmtSign) {
		this.gmtSign = gmtSign;
	}
	public Date getGmtSign( ) {
		return this.gmtSign;
	}

	public void setGmtUnsign(Date gmtUnsign) {
		this.gmtUnsign = gmtUnsign;
	}
	public Date getGmtUnsign( ) {
		return this.gmtUnsign;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}
	public String getOutBizType( ) {
		return this.outBizType;
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

}
