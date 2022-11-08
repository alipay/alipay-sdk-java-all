package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户默认收货地址信息
 *
 * @author auto create
 * @since 1.0, 2022-09-09 21:12:09
 */
public class DefaultDeliverAddress extends AlipayObject {

	private static final long serialVersionUID = 2694575197577412386L;

	/**
	 * 地址详情
	 */
	@ApiField("address")
	private String address;

	/**
	 * 地区名
	 */
	@ApiField("area")
	private String area;

	/**
	 * 城市名
	 */
	@ApiField("city")
	private String city;

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
	 * 省名
	 */
	@ApiField("prov")
	private String prov;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getFullname() {
		return this.fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getProv() {
		return this.prov;
	}
	public void setProv(String prov) {
		this.prov = prov;
	}

}
