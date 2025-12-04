package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.family.share.zmgo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:41:20
 */
public class AlipayUserFamilyShareZmgoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4618728476716216191L;

	/** 
	 * 协议名称
	 */
	@ApiField("agreement_name")
	private String agreementName;

	/** 
	 * 20214904014941044556
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 协议状态。Y表示状态有效
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

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
	 * 到期时间
	 */
	@ApiField("gmt_expire")
	private String gmtExpire;

	/** 
	 * 签约时间。如果是在签状态，返回签约时间。
	 */
	@ApiField("gmt_sign")
	private String gmtSign;

	/** 
	 * 花芝轻会员协议解约时间。如果是解约状态，才返回该字段。
	 */
	@ApiField("gmt_unsign")
	private String gmtUnsign;

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

	/** 
	 * 签约用户的业务账号ID
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/** 
	 * 签约者脱敏姓名
	 */
	@ApiField("sign_user_name")
	private String signUserName;

	/** 
	 * 签约人业务账号类型
	 */
	@ApiField("sign_user_type")
	private String signUserType;

	/** 
	 * 芝麻GO模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 用户在本花芝轻会员协议中，总冻结额度
	 */
	@ApiField("total_freeze_amount")
	private String totalFreezeAmount;

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

	public void setGmtExpire(String gmtExpire) {
		this.gmtExpire = gmtExpire;
	}
	public String getGmtExpire( ) {
		return this.gmtExpire;
	}

	public void setGmtSign(String gmtSign) {
		this.gmtSign = gmtSign;
	}
	public String getGmtSign( ) {
		return this.gmtSign;
	}

	public void setGmtUnsign(String gmtUnsign) {
		this.gmtUnsign = gmtUnsign;
	}
	public String getGmtUnsign( ) {
		return this.gmtUnsign;
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

	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}
	public String getSignUserId( ) {
		return this.signUserId;
	}

	public void setSignUserName(String signUserName) {
		this.signUserName = signUserName;
	}
	public String getSignUserName( ) {
		return this.signUserName;
	}

	public void setSignUserType(String signUserType) {
		this.signUserType = signUserType;
	}
	public String getSignUserType( ) {
		return this.signUserType;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setTotalFreezeAmount(String totalFreezeAmount) {
		this.totalFreezeAmount = totalFreezeAmount;
	}
	public String getTotalFreezeAmount( ) {
		return this.totalFreezeAmount;
	}

}
