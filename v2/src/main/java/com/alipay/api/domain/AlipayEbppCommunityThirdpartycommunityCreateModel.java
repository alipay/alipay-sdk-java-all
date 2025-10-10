package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物业缴费生态模式小区信息同步
 *
 * @author auto create
 * @since 1.0, 2025-01-13 10:14:18
 */
public class AlipayEbppCommunityThirdpartycommunityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5561926773939244111L;

	/**
	 * 小区地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 小区地址备注
	 */
	@ApiField("address_memo")
	private String addressMemo;

	/**
	 * 小区别名,后续检索时候可以使用上
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 市级行政编码
	 */
	@ApiField("city")
	private String city;

	/**
	 * 社区行政编码
	 */
	@ApiField("community_adcode")
	private String communityAdcode;

	/**
	 * 社区中文名
	 */
	@ApiField("community_adcode_name")
	private String communityAdcodeName;

	/**
	 * 同步的物业公司信息
	 */
	@ApiField("community_property_company")
	private CommunityPropertyCompany communityPropertyCompany;

	/**
	 * 社区服务信息
	 */
	@ApiListField("community_service")
	@ApiField("community_service")
	private List<CommunityService> communityService;

	/**
	 * 区县行政编码
	 */
	@ApiField("county")
	private String county;

	/**
	 * 小区所在城市的城市名。
	 */
	@ApiField("county_name")
	private String countyName;

	/**
	 * 小区热线电话
	 */
	@ApiField("hot_line")
	private String hotLine;

	/**
	 * 服务热线每日服务结束时间。精度分钟
	 */
	@ApiField("hot_line_end")
	private String hotLineEnd;

	/**
	 * 服务热线每日服务开始时间。精度：分钟
	 */
	@ApiField("hot_line_start")
	private String hotLineStart;

	/**
	 * 小区经纬度，单位为度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 小区经度，单位为度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 用户访问物业缴费查看的小区名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务商对于当前传入小区记录在内部的唯一编号
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 省级行政编码
	 */
	@ApiField("province")
	private String province;

	/**
	 * 街道编码
	 */
	@ApiField("street_adcode")
	private String streetAdcode;

	/**
	 * 街道中文
	 */
	@ApiField("street_adcode_name")
	private String streetAdcodeName;

	/**
	 * 物业社区支持类型
	 */
	@ApiField("support_type")
	private String supportType;

	/**
	 * 户号验证方式。后续用户绑定小区户号时执行的校验方式
	 */
	@ApiField("verify_type")
	private String verifyType;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressMemo() {
		return this.addressMemo;
	}
	public void setAddressMemo(String addressMemo) {
		this.addressMemo = addressMemo;
	}

	public String getAlias() {
		return this.alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCommunityAdcode() {
		return this.communityAdcode;
	}
	public void setCommunityAdcode(String communityAdcode) {
		this.communityAdcode = communityAdcode;
	}

	public String getCommunityAdcodeName() {
		return this.communityAdcodeName;
	}
	public void setCommunityAdcodeName(String communityAdcodeName) {
		this.communityAdcodeName = communityAdcodeName;
	}

	public CommunityPropertyCompany getCommunityPropertyCompany() {
		return this.communityPropertyCompany;
	}
	public void setCommunityPropertyCompany(CommunityPropertyCompany communityPropertyCompany) {
		this.communityPropertyCompany = communityPropertyCompany;
	}

	public List<CommunityService> getCommunityService() {
		return this.communityService;
	}
	public void setCommunityService(List<CommunityService> communityService) {
		this.communityService = communityService;
	}

	public String getCounty() {
		return this.county;
	}
	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountyName() {
		return this.countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getHotLine() {
		return this.hotLine;
	}
	public void setHotLine(String hotLine) {
		this.hotLine = hotLine;
	}

	public String getHotLineEnd() {
		return this.hotLineEnd;
	}
	public void setHotLineEnd(String hotLineEnd) {
		this.hotLineEnd = hotLineEnd;
	}

	public String getHotLineStart() {
		return this.hotLineStart;
	}
	public void setHotLineStart(String hotLineStart) {
		this.hotLineStart = hotLineStart;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getStreetAdcode() {
		return this.streetAdcode;
	}
	public void setStreetAdcode(String streetAdcode) {
		this.streetAdcode = streetAdcode;
	}

	public String getStreetAdcodeName() {
		return this.streetAdcodeName;
	}
	public void setStreetAdcodeName(String streetAdcodeName) {
		this.streetAdcodeName = streetAdcodeName;
	}

	public String getSupportType() {
		return this.supportType;
	}
	public void setSupportType(String supportType) {
		this.supportType = supportType;
	}

	public String getVerifyType() {
		return this.verifyType;
	}
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

}
