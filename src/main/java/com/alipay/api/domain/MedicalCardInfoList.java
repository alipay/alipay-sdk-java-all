package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保电子凭证或电子社保卡列表
 *
 * @author auto create
 * @since 1.0, 2021-09-24 00:27:38
 */
public class MedicalCardInfoList extends AlipayObject {

	private static final long serialVersionUID = 8469389737654496421L;

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
