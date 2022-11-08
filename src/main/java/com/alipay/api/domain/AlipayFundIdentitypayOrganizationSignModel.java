package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专享价组织签约接口
 *
 * @author auto create
 * @since 1.0, 2022-04-11 17:04:07
 */
public class AlipayFundIdentitypayOrganizationSignModel extends AlipayObject {

	private static final long serialVersionUID = 8851834117537249796L;

	/**
	 * 签约场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 小区规模
	 */
	@ApiField("member_count")
	private Long memberCount;

	/**
	 * 外部组织所在具体地址
	 */
	@ApiField("out_org_address")
	private String outOrgAddress;

	/**
	 * 外部组织所在区
	 */
	@ApiField("out_org_area")
	private String outOrgArea;

	/**
	 * 外部组织所在市
	 */
	@ApiField("out_org_city")
	private String outOrgCity;

	/**
	 * 外部组织id(全局唯一)
	 */
	@ApiField("out_org_id")
	private String outOrgId;

	/**
	 * 外部组织名称
	 */
	@ApiField("out_org_name")
	private String outOrgName;

	/**
	 * 外部组织所在省
	 */
	@ApiField("out_org_province")
	private String outOrgProvince;

	/**
	 * 外部组织所在街道
	 */
	@ApiField("out_org_street")
	private String outOrgStreet;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 子场景码
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

	public Long getMemberCount() {
		return this.memberCount;
	}
	public void setMemberCount(Long memberCount) {
		this.memberCount = memberCount;
	}

	public String getOutOrgAddress() {
		return this.outOrgAddress;
	}
	public void setOutOrgAddress(String outOrgAddress) {
		this.outOrgAddress = outOrgAddress;
	}

	public String getOutOrgArea() {
		return this.outOrgArea;
	}
	public void setOutOrgArea(String outOrgArea) {
		this.outOrgArea = outOrgArea;
	}

	public String getOutOrgCity() {
		return this.outOrgCity;
	}
	public void setOutOrgCity(String outOrgCity) {
		this.outOrgCity = outOrgCity;
	}

	public String getOutOrgId() {
		return this.outOrgId;
	}
	public void setOutOrgId(String outOrgId) {
		this.outOrgId = outOrgId;
	}

	public String getOutOrgName() {
		return this.outOrgName;
	}
	public void setOutOrgName(String outOrgName) {
		this.outOrgName = outOrgName;
	}

	public String getOutOrgProvince() {
		return this.outOrgProvince;
	}
	public void setOutOrgProvince(String outOrgProvince) {
		this.outOrgProvince = outOrgProvince;
	}

	public String getOutOrgStreet() {
		return this.outOrgStreet;
	}
	public void setOutOrgStreet(String outOrgStreet) {
		this.outOrgStreet = outOrgStreet;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

}
