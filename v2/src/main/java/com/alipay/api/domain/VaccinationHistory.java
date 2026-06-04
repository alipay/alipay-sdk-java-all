package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-03 15:51:52
 */
public class VaccinationHistory extends AlipayObject {

	private static final long serialVersionUID = 5398932573745935789L;

	/**
	 * 疫苗名称
	 */
	@ApiField("vaccines_name")
	private String vaccinesName;

	/**
	 * 接种日期
	 */
	@ApiField("vaccines_time")
	private String vaccinesTime;

	public String getVaccinesName() {
		return this.vaccinesName;
	}
	public void setVaccinesName(String vaccinesName) {
		this.vaccinesName = vaccinesName;
	}

	public String getVaccinesTime() {
		return this.vaccinesTime;
	}
	public void setVaccinesTime(String vaccinesTime) {
		this.vaccinesTime = vaccinesTime;
	}

}
