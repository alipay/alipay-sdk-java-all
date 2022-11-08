package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商学校信息入驻
 *
 * @author auto create
 * @since 1.0, 2022-07-13 19:22:13
 */
public class AlipayCommerceEducateCampusInstitutionsAddModel extends AlipayObject {

	private static final long serialVersionUID = 4786742384937319417L;

	/**
	 * 事业单位法人证书或办学许可证的图片。入驻学校时，如果流入人工审核，会根据此图片进行辅助验证。
	 */
	@ApiField("card_pict_url")
	private String cardPictUrl;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 入驻的学校名称，必须是完整的学校全称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 学校外标，使用统一社会信用编码
	 */
	@ApiField("inst_std_code")
	private String instStdCode;

	/**
	 * 办学阶段。
枚举值如下：
KINDERGARTEN（幼儿园）
PRIMARY_SCHOOL（小学） 
MIDDLE_SCHOOL（初中） 
HIGH_SCHOOL（高中）
SECONDARY_VOCATIONAL_SCHOOL（中职中专） 
注意：如果学校兼有多种属性，可以连写用英文逗号拆分，如：MIDDLE_SCHOOL,HIGH_SCHOOL 代表兼有初中部和高中部；
	 */
	@ApiField("learning_stage")
	private String learningStage;

	/**
	 * 省份
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 学校性质.枚举值如下：
 1：公立 
2：民办
	 */
	@ApiField("school_property")
	private String schoolProperty;

	public String getCardPictUrl() {
		return this.cardPictUrl;
	}
	public void setCardPictUrl(String cardPictUrl) {
		this.cardPictUrl = cardPictUrl;
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

	public String getInstStdCode() {
		return this.instStdCode;
	}
	public void setInstStdCode(String instStdCode) {
		this.instStdCode = instStdCode;
	}

	public String getLearningStage() {
		return this.learningStage;
	}
	public void setLearningStage(String learningStage) {
		this.learningStage = learningStage;
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

}
