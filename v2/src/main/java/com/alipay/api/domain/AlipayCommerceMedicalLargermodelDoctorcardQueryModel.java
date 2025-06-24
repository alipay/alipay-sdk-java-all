package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 就医助理导诊医生卡片查询接口
 *
 * @author auto create
 * @since 1.0, 2024-07-26 11:35:14
 */
public class AlipayCommerceMedicalLargermodelDoctorcardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2523874167298438994L;

	/**
	 * 科室id，在卡片extInfo中返回给扁鹊，带入到这个接口即可
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 医院id即orgId
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

}
