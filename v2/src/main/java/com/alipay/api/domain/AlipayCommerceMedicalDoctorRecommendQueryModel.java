package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生推荐
 *
 * @author auto create
 * @since 1.0, 2026-01-28 18:57:56
 */
public class AlipayCommerceMedicalDoctorRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3178765537324283975L;

	/**
	 * 渠道编码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 国家标准编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区域编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 排除的好大夫doctorid
	 */
	@ApiListField("exclude_doctor_id")
	@ApiField("string")
	private List<String> excludeDoctorId;

	/**
	 * 实验组名称
	 */
	@ApiField("experiment_name")
	private String experimentName;

	/**
	 * 好大夫标准二级科室名称
	 */
	@ApiField("hdf_department_name")
	private String hdfDepartmentName;

	/**
	 * 好大夫疾病名称
	 */
	@ApiField("hdf_disease_name")
	private String hdfDiseaseName;

	/**
	 * 好大夫医生标签id列表
	 */
	@ApiListField("hdf_tag_code")
	@ApiField("string")
	private List<String> hdfTagCode;

	/**
	 * 推荐医生数量
	 */
	@ApiField("limit")
	private Long limit;

	/**
	 * 是否补充病例信息
	 */
	@ApiField("need_case")
	private Boolean needCase;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 是否接受手术治疗
	 */
	@ApiField("operation")
	private Boolean operation;

	/**
	 * 患者年龄，单位为天，如10岁，可以传3650。
	 */
	@ApiField("patient_age")
	private Long patientAge;

	/**
	 * 患者性别
	 */
	@ApiField("patient_sex")
	private String patientSex;

	/**
	 * 患者是否怀孕
	 */
	@ApiField("pregnant_receive")
	private Boolean pregnantReceive;

	/**
	 * 价格范围单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 国家标准编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 医生职称列表
	 */
	@ApiListField("title")
	@ApiField("string")
	private List<String> title;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public List<String> getExcludeDoctorId() {
		return this.excludeDoctorId;
	}
	public void setExcludeDoctorId(List<String> excludeDoctorId) {
		this.excludeDoctorId = excludeDoctorId;
	}

	public String getExperimentName() {
		return this.experimentName;
	}
	public void setExperimentName(String experimentName) {
		this.experimentName = experimentName;
	}

	public String getHdfDepartmentName() {
		return this.hdfDepartmentName;
	}
	public void setHdfDepartmentName(String hdfDepartmentName) {
		this.hdfDepartmentName = hdfDepartmentName;
	}

	public String getHdfDiseaseName() {
		return this.hdfDiseaseName;
	}
	public void setHdfDiseaseName(String hdfDiseaseName) {
		this.hdfDiseaseName = hdfDiseaseName;
	}

	public List<String> getHdfTagCode() {
		return this.hdfTagCode;
	}
	public void setHdfTagCode(List<String> hdfTagCode) {
		this.hdfTagCode = hdfTagCode;
	}

	public Long getLimit() {
		return this.limit;
	}
	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Boolean getNeedCase() {
		return this.needCase;
	}
	public void setNeedCase(Boolean needCase) {
		this.needCase = needCase;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Boolean getOperation() {
		return this.operation;
	}
	public void setOperation(Boolean operation) {
		this.operation = operation;
	}

	public Long getPatientAge() {
		return this.patientAge;
	}
	public void setPatientAge(Long patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientSex() {
		return this.patientSex;
	}
	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public Boolean getPregnantReceive() {
		return this.pregnantReceive;
	}
	public void setPregnantReceive(Boolean pregnantReceive) {
		this.pregnantReceive = pregnantReceive;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public List<String> getTitle() {
		return this.title;
	}
	public void setTitle(List<String> title) {
		this.title = title;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
