package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业签约信息
 *
 * @author auto create
 * @since 1.0, 2022-07-14 18:57:21
 */
public class EnterpriseAgreementDTO extends AlipayObject {

	private static final long serialVersionUID = 7791651777362229799L;

	/**
	 * 协议id
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 签约时间
	 */
	@ApiField("sign_date")
	private String signDate;

	/**
	 * 签约状态（UNSIGNED：未签约，SIGNED：已签约，TERMINATED：已解约）
	 */
	@ApiField("sign_status")
	private String signStatus;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getSignDate() {
		return this.signDate;
	}
	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

}
