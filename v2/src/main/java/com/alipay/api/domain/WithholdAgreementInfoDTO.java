package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金绑卡场景下，用户签约代扣成功后，描述代扣签约信息的数据结构
 *
 * @author auto create
 * @since 1.0, 2022-11-25 13:53:49
 */
public class WithholdAgreementInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5335222667232541297L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。（只有签约成功时才会返回）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 返回脱敏的支付宝账号。
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 用户代扣协议的失效时间，格式为yyyy-MM-dd HH:mm:ss。（只有签约成功才会返回）
	 */
	@ApiField("invalid_time")
	private Date invalidTime;

	/**
	 * 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/**
	 * 当前签约的协议场景。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 支付宝代扣协议的实际签约时间，格式为yyyy-MM-dd HH:mm:ss。(只有签约成功才会返回)
	 */
	@ApiField("sign_time")
	private Date signTime;

	/**
	 * 协议解约时间，状态为WITHHOLD_CANCEL必传
	 */
	@ApiField("unsign_time")
	private Date unsignTime;

	/**
	 * 用户代扣协议的实际生效时间，格式为yyyy-MM-dd HH:mm:ss。（只有签约成功才会返回）
	 */
	@ApiField("valid_time")
	private Date validTime;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public Date getInvalidTime() {
		return this.invalidTime;
	}
	public void setInvalidTime(Date invalidTime) {
		this.invalidTime = invalidTime;
	}

	public String getPersonalProductCode() {
		return this.personalProductCode;
	}
	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public Date getUnsignTime() {
		return this.unsignTime;
	}
	public void setUnsignTime(Date unsignTime) {
		this.unsignTime = unsignTime;
	}

	public Date getValidTime() {
		return this.validTime;
	}
	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}

}
