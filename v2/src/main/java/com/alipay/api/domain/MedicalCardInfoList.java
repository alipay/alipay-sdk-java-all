package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保电子凭证或电子社保卡列表
 *
 * @author auto create
 * @since 1.0, 2021-10-08 10:20:47
 */
public class MedicalCardInfoList extends AlipayObject {

	private static final long serialVersionUID = 3137869751543811227L;

	/**
	 * 参保地列表
	 */
	@ApiField("insured_cities")
	private MedicalInsuredCityList insuredCities;

	/**
	 * 参保状态
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
