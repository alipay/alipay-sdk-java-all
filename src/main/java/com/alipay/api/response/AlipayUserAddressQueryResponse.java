package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.address.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-18 12:10:22
 */
public class AlipayUserAddressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7171641844666368446L;

	/** 
	 * 地址详情
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 收货地址地址码。可能对应市级，也可能对应区级
	 */
	@ApiField("address_code")
	private String addressCode;

	/** 
	 * 收货地址区名
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 收货地址城市名
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 收货地址经纬度
	 */
	@ApiField("coordinate")
	private String coordinate;

	/** 
	 * 是否默认收货地址。T：是，F：否。
	 */
	@ApiField("default_user_address")
	private String defaultUserAddress;

	/** 
	 * 收货人姓名
	 */
	@ApiField("fullname")
	private String fullname;

	/** 
	 * 收货人手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 收货地址省名
	 */
	@ApiField("prov")
	private String prov;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	public String getAddressCode( ) {
		return this.addressCode;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea( ) {
		return this.area;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}
	public String getCoordinate( ) {
		return this.coordinate;
	}

	public void setDefaultUserAddress(String defaultUserAddress) {
		this.defaultUserAddress = defaultUserAddress;
	}
	public String getDefaultUserAddress( ) {
		return this.defaultUserAddress;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getFullname( ) {
		return this.fullname;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}
	public String getProv( ) {
		return this.prov;
	}

}
