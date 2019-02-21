package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宣讲会新增与刷新接口
 *
 * @author auto create
 * @since 1.0, 2017-08-03 10:59:23
 */
public class AlipayEcoEduCampusJobtalkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6681664725387665498L;

	/**
	 * 公司在合作方的唯一标识id
	 */
	@ApiField("campany_source")
	private String campanySource;

	/**
	 * 工作城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 工作城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 宣讲会公司法律名称（唯一）
	 */
	@ApiField("company_lawname")
	private String companyLawname;

	/**
	 * 宣讲会公司全称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 备用字段，json格式
	 */
	@ApiField("content_var")
	private String contentVar;

	/**
	 * 工作城市地区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 工作地点纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 企业logo的url
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 工作地点经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 工作省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 工作省份code
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 街道
	 */
	@ApiField("street")
	private String street;

	/**
	 * 宣讲会举办地点
	 */
	@ApiField("talk_address")
	private String talkAddress;

	/**
	 * 宣讲会正文，过滤要求：表格，字体字号，符号，图片，链接
	 */
	@ApiField("talk_content")
	private String talkContent;

	/**
	 * 宣讲会结束时间(毫秒数)
	 */
	@ApiField("talk_endtime")
	private String talkEndtime;

	/**
	 * 宣讲会举办时间(毫秒数)
	 */
	@ApiField("talk_holdtime")
	private String talkHoldtime;

	/**
	 * 宣讲会举办学校code
	 */
	@ApiField("talk_school_code")
	private String talkSchoolCode;

	/**
	 * 宣讲会举办学校
	 */
	@ApiField("talk_school_name")
	private String talkSchoolName;

	/**
	 * 宣讲会来源方id
	 */
	@ApiField("talk_source_code")
	private String talkSourceCode;

	/**
	 * 宣讲会在合作方的ID
	 */
	@ApiField("talk_source_id")
	private String talkSourceId;

	/**
	 * 宣讲会标题
	 */
	@ApiField("talk_title")
	private String talkTitle;

	/**
	 * 宣讲会类型
1=宣讲会
2=空中宣讲会
3=双选会
	 */
	@ApiField("talk_type")
	private Long talkType;

	/**
	 * 宣讲会信息来源
	 */
	@ApiField("talksource_source")
	private String talksourceSource;

	/**
	 * 企业官网
	 */
	@ApiField("web_url")
	private String webUrl;

	public String getCampanySource() {
		return this.campanySource;
	}
	public void setCampanySource(String campanySource) {
		this.campanySource = campanySource;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCompanyLawname() {
		return this.companyLawname;
	}
	public void setCompanyLawname(String companyLawname) {
		this.companyLawname = companyLawname;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContentVar() {
		return this.contentVar;
	}
	public void setContentVar(String contentVar) {
		this.contentVar = contentVar;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getStreet() {
		return this.street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	public String getTalkAddress() {
		return this.talkAddress;
	}
	public void setTalkAddress(String talkAddress) {
		this.talkAddress = talkAddress;
	}

	public String getTalkContent() {
		return this.talkContent;
	}
	public void setTalkContent(String talkContent) {
		this.talkContent = talkContent;
	}

	public String getTalkEndtime() {
		return this.talkEndtime;
	}
	public void setTalkEndtime(String talkEndtime) {
		this.talkEndtime = talkEndtime;
	}

	public String getTalkHoldtime() {
		return this.talkHoldtime;
	}
	public void setTalkHoldtime(String talkHoldtime) {
		this.talkHoldtime = talkHoldtime;
	}

	public String getTalkSchoolCode() {
		return this.talkSchoolCode;
	}
	public void setTalkSchoolCode(String talkSchoolCode) {
		this.talkSchoolCode = talkSchoolCode;
	}

	public String getTalkSchoolName() {
		return this.talkSchoolName;
	}
	public void setTalkSchoolName(String talkSchoolName) {
		this.talkSchoolName = talkSchoolName;
	}

	public String getTalkSourceCode() {
		return this.talkSourceCode;
	}
	public void setTalkSourceCode(String talkSourceCode) {
		this.talkSourceCode = talkSourceCode;
	}

	public String getTalkSourceId() {
		return this.talkSourceId;
	}
	public void setTalkSourceId(String talkSourceId) {
		this.talkSourceId = talkSourceId;
	}

	public String getTalkTitle() {
		return this.talkTitle;
	}
	public void setTalkTitle(String talkTitle) {
		this.talkTitle = talkTitle;
	}

	public Long getTalkType() {
		return this.talkType;
	}
	public void setTalkType(Long talkType) {
		this.talkType = talkType;
	}

	public String getTalksourceSource() {
		return this.talksourceSource;
	}
	public void setTalksourceSource(String talksourceSource) {
		this.talksourceSource = talksourceSource;
	}

	public String getWebUrl() {
		return this.webUrl;
	}
	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

}
