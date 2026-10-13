package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 互医检查检验数据同步
 *
 * @author auto create
 * @since 1.0, 2026-09-23 18:17:41
 */
public class AlipayCommerceMedicalInquiryExaminationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4898669923976362849L;

	/**
	 * 数据状态
	 */
	@ApiField("data_status")
	private String dataStatus;

	/**
	 * 数据版本号
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 设备名称/分类
	 */
	@ApiField("equipment_type")
	private String equipmentType;

	/**
	 * 检查项目分类
	 */
	@ApiField("examination_category")
	private String examinationCategory;

	/**
	 * 项目说明
	 */
	@ApiField("examination_desc")
	private String examinationDesc;

	/**
	 * 原始检查项目ID
	 */
	@ApiField("examination_id")
	private String examinationId;

	/**
	 * 原始检查项目名称
	 */
	@ApiField("examination_name")
	private String examinationName;

	/**
	 * 检查部位
	 */
	@ApiField("examination_site")
	private String examinationSite;

	/**
	 * 原始医院ID
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 原始医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 来源平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 注意事项
	 */
	@ApiField("precautions")
	private String precautions;

	/**
	 * 检查项目名称
	 */
	@ApiField("standard_examination_name")
	private String standardExaminationName;

	public String getDataStatus() {
		return this.dataStatus;
	}
	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getEquipmentType() {
		return this.equipmentType;
	}
	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getExaminationCategory() {
		return this.examinationCategory;
	}
	public void setExaminationCategory(String examinationCategory) {
		this.examinationCategory = examinationCategory;
	}

	public String getExaminationDesc() {
		return this.examinationDesc;
	}
	public void setExaminationDesc(String examinationDesc) {
		this.examinationDesc = examinationDesc;
	}

	public String getExaminationId() {
		return this.examinationId;
	}
	public void setExaminationId(String examinationId) {
		this.examinationId = examinationId;
	}

	public String getExaminationName() {
		return this.examinationName;
	}
	public void setExaminationName(String examinationName) {
		this.examinationName = examinationName;
	}

	public String getExaminationSite() {
		return this.examinationSite;
	}
	public void setExaminationSite(String examinationSite) {
		this.examinationSite = examinationSite;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPrecautions() {
		return this.precautions;
	}
	public void setPrecautions(String precautions) {
		this.precautions = precautions;
	}

	public String getStandardExaminationName() {
		return this.standardExaminationName;
	}
	public void setStandardExaminationName(String standardExaminationName) {
		this.standardExaminationName = standardExaminationName;
	}

}
