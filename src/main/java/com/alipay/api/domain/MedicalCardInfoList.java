package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保电子凭证或电子社保卡列表
 *
 * @author auto create
 * @since 1.0, 2021-06-21 16:25:00
 */
public class MedicalCardInfoList extends AlipayObject {

	private static final long serialVersionUID = 8759964231633373181L;

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
	 * 持卡人与当前UID账户关系
	 */
	@ApiField("relation_type")
	private String relationType;

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

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
