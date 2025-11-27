package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-26 17:22:41
 */
public class SurgicalHistory extends AlipayObject {

	private static final long serialVersionUID = 8279784913834955232L;

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
