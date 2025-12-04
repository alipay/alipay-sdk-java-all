package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生推荐
 *
 * @author auto create
 * @since 1.0, 2025-10-15 14:40:02
 */
public class AlipayCommerceMedicalDoctorRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1245277719268276119L;

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
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
