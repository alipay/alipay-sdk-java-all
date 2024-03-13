package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付参与者业务参数模型
 *
 * @author auto create
 * @since 1.0, 2024-03-11 16:54:14
 */
public class ScenePayParticipantBizParamDTO extends AlipayObject {

	private static final long serialVersionUID = 6246829657278248357L;

	/**
	 * 由各业务场景定义，具体参考场景解决方案接入文档
	 */
	@ApiField("authorization_id")
	private String authorizationId;

	/**
	 * 配合外部身份证件类型
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 外部签约号
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 外部身份证件类型
	 */
	@ApiField("external_cert_type")
	private String externalCertType;

	/**
	 * 外部卡号
	 */
	@ApiField("out_card_no")
	private String outCardNo;

	/**
	 * 申请用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAuthorizationId() {
		return this.authorizationId;
	}
	public void setAuthorizationId(String authorizationId) {
		this.authorizationId = authorizationId;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public String getExternalCertType() {
		return this.externalCertType;
	}
	public void setExternalCertType(String externalCertType) {
		this.externalCertType = externalCertType;
	}

	public String getOutCardNo() {
		return this.outCardNo;
	}
	public void setOutCardNo(String outCardNo) {
		this.outCardNo = outCardNo;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
