package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打款验证申请
 *
 * @author auto create
 * @since 1.0, 2021-02-25 16:26:23
 */
public class MybankPaymentTradeDepositVerifyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3238389352129685562L;

	/**
	 * 待认证银行卡户名
	 */
	@ApiField("bank_card_name")
	private String bankCardName;

	/**
	 * 待认证银行卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 人行联行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 打款认证结果通知地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 统一社会信用代码，按场景约定是否必填
	 */
	@ApiField("credit_code")
	private String creditCode;

	/**
	 * 法定代表人证件号，按场景约定是否必填
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/**
	 * 法定代表人证件类型，按场景约定是否必填

01 - 身份证号码
02 - 护照
03 - 港澳居民身份证
04 - 台湾同胞回乡证
	 */
	@ApiField("legal_person_cert_type")
	private String legalPersonCertType;

	/**
	 * 法定代表人姓名，按场景约定是否必填
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 成员机构会员ID
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 手机号码
用于接收打款验证通知短信
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 请求流水号，表示外部一次请求，幂等字段
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 业务场景编码，如需要由网商分配
	 */
	@ApiField("scene")
	private String scene;

	public String getBankCardName() {
		return this.bankCardName;
	}
	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getCreditCode() {
		return this.creditCode;
	}
	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getLegalPersonCertNo() {
		return this.legalPersonCertNo;
	}
	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}

	public String getLegalPersonCertType() {
		return this.legalPersonCertType;
	}
	public void setLegalPersonCertType(String legalPersonCertType) {
		this.legalPersonCertType = legalPersonCertType;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
