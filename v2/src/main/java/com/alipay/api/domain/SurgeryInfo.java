package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手术信息
 *
 * @author auto create
 * @since 1.0, 2025-12-15 13:37:41
 */
public class SurgeryInfo extends AlipayObject {

	private static final long serialVersionUID = 4444875685727295764L;

	/**
	 * 麻醉方式
	 */
	@ApiField("surgery_anesthesia")
	private String surgeryAnesthesia;

	/**
	 * 手术日期
	 */
	@ApiField("surgery_date")
	private String surgeryDate;

	/**
	 * 手术过程描述
	 */
	@ApiField("surgery_desc")
	private String surgeryDesc;

	/**
	 * 手术医师
	 */
	@ApiField("surgery_doctor")
	private String surgeryDoctor;

	/**
	 * 手术名称
	 */
	@ApiField("surgery_name")
	private String surgeryName;

	public String getSurgeryAnesthesia() {
		return this.surgeryAnesthesia;
	}
	public void setSurgeryAnesthesia(String surgeryAnesthesia) {
		this.surgeryAnesthesia = surgeryAnesthesia;
	}

	public String getSurgeryDate() {
		return this.surgeryDate;
	}
	public void setSurgeryDate(String surgeryDate) {
		this.surgeryDate = surgeryDate;
	}

	public String getSurgeryDesc() {
		return this.surgeryDesc;
	}
	public void setSurgeryDesc(String surgeryDesc) {
		this.surgeryDesc = surgeryDesc;
	}

	public String getSurgeryDoctor() {
		return this.surgeryDoctor;
	}
	public void setSurgeryDoctor(String surgeryDoctor) {
		this.surgeryDoctor = surgeryDoctor;
	}

	public String getSurgeryName() {
		return this.surgeryName;
	}
	public void setSurgeryName(String surgeryName) {
		this.surgeryName = surgeryName;
	}

}
