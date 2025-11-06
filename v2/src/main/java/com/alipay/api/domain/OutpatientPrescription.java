package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class OutpatientPrescription extends AlipayObject {

	private static final long serialVersionUID = 5692848657172928966L;

	/**
	 * 数据唯一标识，用于去重
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 开方时间
	 */
	@ApiField("date")
	private String date;

	/**
	 * 就诊科室
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 就诊医院
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 临床诊断
	 */
	@ApiField("result")
	private String result;

	/**
	 * 中医
	 */
	@ApiField("traditional_chinese_medicine")
	private TraditionalChineseMedicine traditionalChineseMedicine;

	/**
	 * 处方类型（中医，西医）
	 */
	@ApiField("type")
	private String type;

	/**
	 * 西医
	 */
	@ApiField("western_medicine")
	private WesternMedicine westernMedicine;

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public TraditionalChineseMedicine getTraditionalChineseMedicine() {
		return this.traditionalChineseMedicine;
	}
	public void setTraditionalChineseMedicine(TraditionalChineseMedicine traditionalChineseMedicine) {
		this.traditionalChineseMedicine = traditionalChineseMedicine;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public WesternMedicine getWesternMedicine() {
		return this.westernMedicine;
	}
	public void setWesternMedicine(WesternMedicine westernMedicine) {
		this.westernMedicine = westernMedicine;
	}

}
