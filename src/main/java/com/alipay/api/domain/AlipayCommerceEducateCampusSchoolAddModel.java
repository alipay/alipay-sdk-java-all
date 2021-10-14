package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商学校入驻
 *
 * @author auto create
 * @since 1.0, 2021-10-08 11:02:59
 */
public class AlipayCommerceEducateCampusSchoolAddModel extends AlipayObject {

	private static final long serialVersionUID = 7152462791492924322L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 入驻学校名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 支付宝收款账号
	 */
	@ApiField("inst_pid")
	private String instPid;

	/**
	 * 社会信用编码或教育部标识码
	 */
	@ApiField("inst_std_code")
	private String instStdCode;

	/**
	 * 维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 办学阶段。枚举值如下：0:幼儿园 1:小学 2:初中 3:高中 4:大学 5:中职中专 6:培训机构 7:高职高专 8:成人教育、函授等 注意：如果学校兼有多种属性，可以连写用英文逗号拆分，2,3：代表兼有初中部高中部；
	 */
	@ApiField("learning_stage")
	private String learningStage;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 省份code
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 学校性质.枚举值如下： 1：公立 2：民办
	 */
	@ApiField("school_property")
	private String schoolProperty;

	/**
	 * 是否测试数据，枚举值：1 是 ，0 否
	 */
	@ApiField("test_mode")
	private Long testMode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstPid() {
		return this.instPid;
	}
	public void setInstPid(String instPid) {
		this.instPid = instPid;
	}

	public String getInstStdCode() {
		return this.instStdCode;
	}
	public void setInstStdCode(String instStdCode) {
		this.instStdCode = instStdCode;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLearningStage() {
		return this.learningStage;
	}
	public void setLearningStage(String learningStage) {
		this.learningStage = learningStage;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getSchoolProperty() {
		return this.schoolProperty;
	}
	public void setSchoolProperty(String schoolProperty) {
		this.schoolProperty = schoolProperty;
	}

	public Long getTestMode() {
		return this.testMode;
	}
	public void setTestMode(Long testMode) {
		this.testMode = testMode;
	}

}
