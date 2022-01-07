package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 入驻蚂蚁开放平台
 *
 * @author auto create
 * @since 1.0, 2018-11-27 19:09:31
 */
public class AlipayOpenOperationPartnerSettleSignModel extends AlipayObject {

	private static final long serialVersionUID = 7235574184938527495L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 入驻渠道Id。
高德 - AMAP
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 公司所在地-城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人手机号码
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 公司所在地-区/县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 公司所在地-省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 业务介绍
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 入驻开放平台的角色列表。
枚举如下：
自研开发者 -- IDENTITY_OPEN_SELF_RESEARCH_DEVELOPER，
系统服务商 -- IDENTITY_OPEN_SYSTEM_SERVICE_PROVIDER，
地推服务商 -- IDENTITY_OPEN_PUSH_SERVICE_PROVIDER
	 */
	@ApiListField("roles")
	@ApiField("string")
	private List<String> roles;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<String> getRoles() {
		return this.roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

}
