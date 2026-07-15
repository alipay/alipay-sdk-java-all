package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-13 16:10:47
 */
public class SurgicalHistory extends AlipayObject {

	private static final long serialVersionUID = 5619245696421445872L;

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
