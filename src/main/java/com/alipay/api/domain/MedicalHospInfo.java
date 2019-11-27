package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗平台输出医院数据模型
 *
 * @author auto create
 * @since 1.0, 2017-09-22 18:22:31
 */
public class MedicalHospInfo extends AlipayObject {

	private static final long serialVersionUID = 2394946366415148851L;

	/**
	 * 所在省份编码，详见国标
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 业务状态 
publish: 发布 revoke:撤销
biz_type 为 update 时才可以撤销
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 数据同步类型
init:数据初始化 update:数据更新
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 所在城市编码 详见国标
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 服务热线
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 同步周期
格式 yyyyMMdd
	 */
	@ApiField("cycle")
	private String cycle;

	/**
	 * 热门科室
多科室以半角逗号或空
格分割
	 */
	@ApiField("dept_info")
	private String deptInfo;

	/**
	 * 医院等级
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 医院地址
	 */
	@ApiField("hos_address")
	private String hosAddress;

	/**
	 * 平台唯一编号
	 */
	@ApiField("hos_code")
	private String hosCode;

	/**
	 * 医院全名称
	 */
	@ApiField("hos_name")
	private String hosName;

	/**
	 * 是否支持医保 
Y:支持
N:不支持(默认)
	 */
	@ApiField("is_insurance")
	private String isInsurance;

	/**
	 * 医院地址转换的坐标纬 度，精确 5~6 位小数 点
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 跳转至支付宝钱包挂号
就诊医院主页
高德自行拼装 native 跳转形式，如: alipays://platformap i/startapp?appId=600 00141&url={link_url} &callback=amapuri%3A %2F%2Famap%3FsourceA pplication%3Dalipay& sourceId=amap&source Name=%E9%AB%98%E5%BE %B7%E5%9C%B0%E5%9B%B E
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 医院 logo 地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 医院地址转换的坐标经 度，精确 5~6 位小数 点
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 医院类型: 
platform:平台级
main:主院 
branch:分院 (默认)
	 */
	@ApiField("region")
	private String region;

	/**
	 * 医院简称
	 */
	@ApiField("short_name")
	private String shortName;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getCycle() {
		return this.cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getDeptInfo() {
		return this.deptInfo;
	}
	public void setDeptInfo(String deptInfo) {
		this.deptInfo = deptInfo;
	}

	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getHosAddress() {
		return this.hosAddress;
	}
	public void setHosAddress(String hosAddress) {
		this.hosAddress = hosAddress;
	}

	public String getHosCode() {
		return this.hosCode;
	}
	public void setHosCode(String hosCode) {
		this.hosCode = hosCode;
	}

	public String getHosName() {
		return this.hosName;
	}
	public void setHosName(String hosName) {
		this.hosName = hosName;
	}

	public String getIsInsurance() {
		return this.isInsurance;
	}
	public void setIsInsurance(String isInsurance) {
		this.isInsurance = isInsurance;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
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

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
