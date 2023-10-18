package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应用内容POI信息同步
 *
 * @author auto create
 * @since 1.0, 2020-06-23 16:26:04
 */
public class AlipayOpenAppAppcontentPoiSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7672114587835689893L;

	/**
	 * 具体地址的描述
	 */
	@ApiField("address")
	private String address;

	/**
	 * 支付宝端内小程序地址
	 */
	@ApiField("alipay_url")
	private String alipayUrl;

	/**
	 * 高德标准的POI ID
	 */
	@ApiField("amap_poi_id")
	private String amapPoiId;

	/**
	 * 应用内容属性
	 */
	@ApiListField("attributes")
	@ApiField("attribute")
	private List<Attribute> attributes;

	/**
	 * 业务来源，如“社区生活”。
商户申请/调试接口过程中，由支付宝侧业务接口人分配确认。
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 业务唯一ID，APPID视角下唯一。支付宝侧会通过biz_source + appId + biz_unique_id作为联合主键，进行相应的创建或者更新操作。
	 */
	@ApiField("biz_unique_id")
	private String bizUniqueId;

	/**
	 * 联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系电话
	 */
	@ApiField("contact_tele")
	private String contactTele;

	/**
	 * 维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * poi的logo/头像
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 具体的地点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 逗号分隔的图片数组，最多5个
	 */
	@ApiListField("photos")
	@ApiField("string")
	private List<String> photos;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlipayUrl() {
		return this.alipayUrl;
	}
	public void setAlipayUrl(String alipayUrl) {
		this.alipayUrl = alipayUrl;
	}

	public String getAmapPoiId() {
		return this.amapPoiId;
	}
	public void setAmapPoiId(String amapPoiId) {
		this.amapPoiId = amapPoiId;
	}

	public List<Attribute> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public String getBizUniqueId() {
		return this.bizUniqueId;
	}
	public void setBizUniqueId(String bizUniqueId) {
		this.bizUniqueId = bizUniqueId;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTele() {
		return this.contactTele;
	}
	public void setContactTele(String contactTele) {
		this.contactTele = contactTele;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
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

	public List<String> getPhotos() {
		return this.photos;
	}
	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}

}
