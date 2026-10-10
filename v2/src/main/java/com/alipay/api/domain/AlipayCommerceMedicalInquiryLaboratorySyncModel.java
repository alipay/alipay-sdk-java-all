package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 互联网医院检验数据同步
 *
 * @author auto create
 * @since 1.0, 2026-09-23 18:22:54
 */
public class AlipayCommerceMedicalInquiryLaboratorySyncModel extends AlipayObject {

	private static final long serialVersionUID = 3693236941671768575L;

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
	 * 检验项目分类
	 */
	@ApiField("laboratory_category")
	private String laboratoryCategory;

	/**
	 * 项目说明
	 */
	@ApiField("laboratory_desc")
	private String laboratoryDesc;

	/**
	 * 原始检验项目ID
	 */
	@ApiField("laboratory_id")
	private String laboratoryId;

	/**
	 * 原始检验项目名称
	 */
	@ApiField("laboratory_name")
	private String laboratoryName;

	/**
	 * 是否组套项目
	 */
	@ApiField("package_flag")
	private String packageFlag;

	/**
	 * 组套项目名称
	 */
	@ApiField("package_name")
	private String packageName;

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
	 * 参考范围：4.0-10.0*10^9/L
	 */
	@ApiField("reference_range")
	private String referenceRange;

	/**
	 * 标本类型
	 */
	@ApiField("specimen_type")
	private String specimenType;

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

	public String getLaboratoryCategory() {
		return this.laboratoryCategory;
	}
	public void setLaboratoryCategory(String laboratoryCategory) {
		this.laboratoryCategory = laboratoryCategory;
	}

	public String getLaboratoryDesc() {
		return this.laboratoryDesc;
	}
	public void setLaboratoryDesc(String laboratoryDesc) {
		this.laboratoryDesc = laboratoryDesc;
	}

	public String getLaboratoryId() {
		return this.laboratoryId;
	}
	public void setLaboratoryId(String laboratoryId) {
		this.laboratoryId = laboratoryId;
	}

	public String getLaboratoryName() {
		return this.laboratoryName;
	}
	public void setLaboratoryName(String laboratoryName) {
		this.laboratoryName = laboratoryName;
	}

	public String getPackageFlag() {
		return this.packageFlag;
	}
	public void setPackageFlag(String packageFlag) {
		this.packageFlag = packageFlag;
	}

	public String getPackageName() {
		return this.packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
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

	public String getReferenceRange() {
		return this.referenceRange;
	}
	public void setReferenceRange(String referenceRange) {
		this.referenceRange = referenceRange;
	}

	public String getSpecimenType() {
		return this.specimenType;
	}
	public void setSpecimenType(String specimenType) {
		this.specimenType = specimenType;
	}

}
