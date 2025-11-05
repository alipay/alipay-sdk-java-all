package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务同步
 *
 * @author auto create
 * @since 1.0, 2022-09-21 16:36:55
 */
public class AlipayOpenAppServiceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7692199716712261282L;

	/**
	 * 服务地址
	 */
	@ApiListField("address")
	@ApiField("service_address_simple_v_o")
	private List<ServiceAddressSimpleVO> address;

	/**
	 * 服务属性
	 */
	@ApiField("attributes")
	private ServiceAttributeSimpleVO attributes;

	/**
	 * 外部提供的能够标示这个服务的唯一id，如果spec+biz_id在我们库里面存在，我们会做服务的更新操作
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 服务所属类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 时间戳，平台会基于时间戳做并发控制
	 */
	@ApiField("date_timestamp")
	private Long dateTimestamp;

	/**
	 * 服务粒度
	 */
	@ApiField("granularity_type")
	private String granularityType;

	/**
	 * 服务的logo图片
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 服务区域
	 */
	@ApiListField("region")
	@ApiField("service_region_simple_v_o")
	private List<ServiceRegionSimpleVO> region;

	/**
	 * 同步服务所属的小程序appId
	 */
	@ApiField("service_app_id")
	private String serviceAppId;

	/**
	 * 服务联系人
	 */
	@ApiListField("service_contact")
	@ApiField("service_contact_simple_v_o")
	private List<ServiceContactSimpleVO> serviceContact;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务描述
	 */
	@ApiField("simple_desc")
	private String simpleDesc;

	/**
	 * 服务规格，平台定义，接入时跟平台申请
	 */
	@ApiField("spec_code")
	private String specCode;

	/**
	 * 服务的url
	 */
	@ApiField("url")
	private String url;

	public List<ServiceAddressSimpleVO> getAddress() {
		return this.address;
	}
	public void setAddress(List<ServiceAddressSimpleVO> address) {
		this.address = address;
	}

	public ServiceAttributeSimpleVO getAttributes() {
		return this.attributes;
	}
	public void setAttributes(ServiceAttributeSimpleVO attributes) {
		this.attributes = attributes;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Long getDateTimestamp() {
		return this.dateTimestamp;
	}
	public void setDateTimestamp(Long dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}

	public String getGranularityType() {
		return this.granularityType;
	}
	public void setGranularityType(String granularityType) {
		this.granularityType = granularityType;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public List<ServiceRegionSimpleVO> getRegion() {
		return this.region;
	}
	public void setRegion(List<ServiceRegionSimpleVO> region) {
		this.region = region;
	}

	public String getServiceAppId() {
		return this.serviceAppId;
	}
	public void setServiceAppId(String serviceAppId) {
		this.serviceAppId = serviceAppId;
	}

	public List<ServiceContactSimpleVO> getServiceContact() {
		return this.serviceContact;
	}
	public void setServiceContact(List<ServiceContactSimpleVO> serviceContact) {
		this.serviceContact = serviceContact;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getSimpleDesc() {
		return this.simpleDesc;
	}
	public void setSimpleDesc(String simpleDesc) {
		this.simpleDesc = simpleDesc;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
