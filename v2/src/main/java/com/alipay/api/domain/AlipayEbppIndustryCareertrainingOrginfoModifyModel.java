package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改职业培训机构信息
 *
 * @author auto create
 * @since 1.0, 2025-08-26 13:52:36
 */
public class AlipayEbppIndustryCareertrainingOrginfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2868567931283176276L;

	/**
	 * 机构地址\考评组织地点
	 */
	@ApiField("address")
	private String address;

	/**
	 * 机构简介\考评组织描述。
type=rating_org必填

	 */
	@ApiField("description")
	private String description;

	/**
	 * 机构主页链接，小程序链接
	 */
	@ApiField("index_link")
	private String indexLink;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 必须是调用alipay.marketing.image.enhance.upload(营销图片优化上传接口)(upload_scene= ITEM_BRAND_LOGO_IMAGE) 接口上传返回的营销图片链接
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 机构名称\评价组织名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系电话
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 机构类型
	 */
	@ApiField("type")
	private String type;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getIndexLink() {
		return this.indexLink;
	}
	public void setIndexLink(String indexLink) {
		this.indexLink = indexLink;
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

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
