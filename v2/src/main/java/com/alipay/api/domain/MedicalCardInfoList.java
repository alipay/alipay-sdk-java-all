package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保电子凭证或电子社保卡列表
 *
 * @author auto create
 * @since 1.0, 2024-12-12 15:58:25
 */
public class MedicalCardInfoList extends AlipayObject {

	private static final long serialVersionUID = 5399817259848946511L;

	/**
	 * 亲属医保电子凭证卡Id（即ec_auth_code）
	 */
	@ApiField("family_medical_card_id")
	private String familyMedicalCardId;

	/**
	 * 亲属的医保电子凭证渠道用户Id。当传入的证件信息对应的用户于当前登录用户在支付宝渠道存在亲情账户绑定关系时返回
	 */
	@ApiField("family_user_id")
	private String familyUserId;

	/**
	 * 参保地列表
	 */
	@ApiField("insured_cities")
	private MedicalInsuredCityList insuredCities;

	/**
	 * 医保电子凭证参保状态
	 */
	@ApiField("insured_status")
	private String insuredStatus;

	/**
	 * 医保电子凭证授权码(机构卡Id)
	 */
	@ApiField("medical_card_id")
	private String medicalCardId;

	/**
	 * 绑卡激活状态
	 */
	@ApiField("status")
	private String status;

	public String getFamilyMedicalCardId() {
		return this.familyMedicalCardId;
	}
	public void setFamilyMedicalCardId(String familyMedicalCardId) {
		this.familyMedicalCardId = familyMedicalCardId;
	}

	public String getFamilyUserId() {
		return this.familyUserId;
	}
	public void setFamilyUserId(String familyUserId) {
		this.familyUserId = familyUserId;
	}

	public MedicalInsuredCityList getInsuredCities() {
		return this.insuredCities;
	}
	public void setInsuredCities(MedicalInsuredCityList insuredCities) {
		this.insuredCities = insuredCities;
	}

	public String getInsuredStatus() {
		return this.insuredStatus;
	}
	public void setInsuredStatus(String insuredStatus) {
		this.insuredStatus = insuredStatus;
	}

	public String getMedicalCardId() {
		return this.medicalCardId;
	}
	public void setMedicalCardId(String medicalCardId) {
		this.medicalCardId = medicalCardId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
