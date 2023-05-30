package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员收货地址信息（alipay.user.info.share使用）
 *
 * @author auto create
 * @since 1.0, 2021-01-29 09:59:46
 */
public class AlipayUserDeliverAddress extends AlipayObject {

	private static final long serialVersionUID = 7229273124443669972L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区域编码
	 */
	@ApiField("address_code")
	private String addressCode;

	/**
	 * 是否默认收货地址
	 */
	@ApiField("default_deliver_address")
	private String defaultDeliverAddress;

	/**
	 * 区/县
	 */
	@ApiField("deliver_area")
	private String deliverArea;

	/**
	 * 市
	 */
	@ApiField("deliver_city")
	private String deliverCity;

	/**
	 * 收货人全名
	 */
	@ApiField("deliver_fullname")
	private String deliverFullname;

	/**
	 * 收货地址的联系人移动电话
	 */
	@ApiField("deliver_mobile")
	private String deliverMobile;

	/**
	 * 收货地址的联系人固定电话
	 */
	@ApiField("deliver_phone")
	private String deliverPhone;

	/**
	 * 省
	 */
	@ApiField("deliver_province")
	private String deliverProvince;

	/**
	 * 邮编
	 */
	@ApiField("zip")
	private String zip;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressCode() {
		return this.addressCode;
	}
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	public String getDefaultDeliverAddress() {
		return this.defaultDeliverAddress;
	}
	public void setDefaultDeliverAddress(String defaultDeliverAddress) {
		this.defaultDeliverAddress = defaultDeliverAddress;
	}

	public String getDeliverArea() {
		return this.deliverArea;
	}
	public void setDeliverArea(String deliverArea) {
		this.deliverArea = deliverArea;
	}

	public String getDeliverCity() {
		return this.deliverCity;
	}
	public void setDeliverCity(String deliverCity) {
		this.deliverCity = deliverCity;
	}

	public String getDeliverFullname() {
		return this.deliverFullname;
	}
	public void setDeliverFullname(String deliverFullname) {
		this.deliverFullname = deliverFullname;
	}

	public String getDeliverMobile() {
		return this.deliverMobile;
	}
	public void setDeliverMobile(String deliverMobile) {
		this.deliverMobile = deliverMobile;
	}

	public String getDeliverPhone() {
		return this.deliverPhone;
	}
	public void setDeliverPhone(String deliverPhone) {
		this.deliverPhone = deliverPhone;
	}

	public String getDeliverProvince() {
		return this.deliverProvince;
	}
	public void setDeliverProvince(String deliverProvince) {
		this.deliverProvince = deliverProvince;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
