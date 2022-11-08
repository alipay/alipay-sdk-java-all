package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址修改
 *
 * @author auto create
 * @since 1.0, 2022-08-17 18:48:42
 */
public class AlipayCommerceEcEnterpriseAddressModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2678345669299973352L;

	/**
	 * 共同账户id和enterprise_id二选一
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 详细地址最长50个字符
	 */
	@ApiField("address")
	private String address;

	/**
	 * 地址id
	 */
	@ApiField("address_id")
	private String addressId;

	/**
	 * 协议号，如果填共同账户id，则该字段必填
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 市(国家统一行政规划编码)
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 小区/楼宇
	 */
	@ApiField("community")
	private String community;

	/**
	 * 企业id和account_id二选一
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

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
	 * 备注
	 */
	@ApiField("mark")
	private String mark;

	/**
	 * 高德地图poi
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 状态(生效/失效)
NORMAL
INVALID
	 */
	@ApiField("status")
	private String status;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCommunity() {
		return this.community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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

	public String getMark() {
		return this.mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
