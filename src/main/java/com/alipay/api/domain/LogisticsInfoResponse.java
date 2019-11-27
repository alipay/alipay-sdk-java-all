package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单物流信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class LogisticsInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 4636642158975782589L;

	/**
	 * 收货地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 联系人名字
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private LogisticsExtInfo extInfo;

	/**
	 * 纬度，火星坐标
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，火星坐标
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 联系电话
	 */
	@ApiField("mobile")
	private String mobile;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public LogisticsExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(LogisticsExtInfo extInfo) {
		this.extInfo = extInfo;
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

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
