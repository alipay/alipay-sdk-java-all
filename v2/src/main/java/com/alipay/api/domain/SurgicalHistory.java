package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-02 17:22:45
 */
public class SurgicalHistory extends AlipayObject {

	private static final long serialVersionUID = 3296821463433158193L;

	/**
	 * 手术日期
	 */
	@ApiField("surgery_date")
	private String surgeryDate;

	/**
	 * 手术名称
	 */
	@ApiField("surgery_name")
	private String surgeryName;

	public String getSurgeryDate() {
		return this.surgeryDate;
	}
	public void setSurgeryDate(String surgeryDate) {
		this.surgeryDate = surgeryDate;
	}

	public String getSurgeryName() {
		return this.surgeryName;
	}
	public void setSurgeryName(String surgeryName) {
		this.surgeryName = surgeryName;
	}

}
