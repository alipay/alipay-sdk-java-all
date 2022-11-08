package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.identitypay.organization.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-11 17:10:56
 */
public class AlipayFundIdentitypayOrganizationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1137363798544139985L;

	/** 
	 * 物业相关信息
	 */
	@ApiField("business_params")
	private String businessParams;

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
	 * 已签约-NORMAL、未签约-CLOSED
	 */
	@ApiField("status")
	private String status;

	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}
	public String getBusinessParams( ) {
		return this.businessParams;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setMemberCount(Long memberCount) {
		this.memberCount = memberCount;
	}
	public Long getMemberCount( ) {
		return this.memberCount;
	}

	public void setOutOrgAddress(String outOrgAddress) {
		this.outOrgAddress = outOrgAddress;
	}
	public String getOutOrgAddress( ) {
		return this.outOrgAddress;
	}

	public void setOutOrgArea(String outOrgArea) {
		this.outOrgArea = outOrgArea;
	}
	public String getOutOrgArea( ) {
		return this.outOrgArea;
	}

	public void setOutOrgCity(String outOrgCity) {
		this.outOrgCity = outOrgCity;
	}
	public String getOutOrgCity( ) {
		return this.outOrgCity;
	}

	public void setOutOrgName(String outOrgName) {
		this.outOrgName = outOrgName;
	}
	public String getOutOrgName( ) {
		return this.outOrgName;
	}

	public void setOutOrgProvince(String outOrgProvince) {
		this.outOrgProvince = outOrgProvince;
	}
	public String getOutOrgProvince( ) {
		return this.outOrgProvince;
	}

	public void setOutOrgStreet(String outOrgStreet) {
		this.outOrgStreet = outOrgStreet;
	}
	public String getOutOrgStreet( ) {
		return this.outOrgStreet;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
