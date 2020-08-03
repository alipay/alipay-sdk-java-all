package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法务中台签约者信息
 *
 * @author auto create
 * @since 1.0, 2019-12-26 14:30:13
 */
public class AntlawSignOperator extends AlipayObject {

	private static final long serialVersionUID = 3648393848527876552L;

	/**
	 * 证件类型，包括IDENTIFY（身份证号），USCC（统一社会信用码）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 签约人证件号，个人为身份证号，企业为统一社会信用编码
	 */
	@ApiField("operator_cert_no")
	private String operatorCertNo;

	/**
	 * 签约机构或签约个人名称
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 签约人为个人时，需要提供签约人的支付宝uid
	 */
	@ApiField("operator_uid")
	private String operatorUid;

	/**
	 * 签约人类型，个人（PERSON ）还是企业（ENTERPRISE）
	 */
	@ApiField("sign_operator_type")
	private String signOperatorType;

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getOperatorCertNo() {
		return this.operatorCertNo;
	}
	public void setOperatorCertNo(String operatorCertNo) {
		this.operatorCertNo = operatorCertNo;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorUid() {
		return this.operatorUid;
	}
	public void setOperatorUid(String operatorUid) {
		this.operatorUid = operatorUid;
	}

	public String getSignOperatorType() {
		return this.signOperatorType;
	}
	public void setSignOperatorType(String signOperatorType) {
		this.signOperatorType = signOperatorType;
	}

}
