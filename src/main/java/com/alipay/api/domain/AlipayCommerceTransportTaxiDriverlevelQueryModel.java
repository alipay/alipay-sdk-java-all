package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询司机等级
 *
 * @author auto create
 * @since 1.0, 2021-06-21 13:58:55
 */
public class AlipayCommerceTransportTaxiDriverlevelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3734577913662321995L;

	/**
	 * 固定值“JUDI”
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 司机姓名
	 */
	@ApiField("driver_name")
	private String driverName;

	/**
	 * 司机手机号
	 */
	@ApiField("driver_phone")
	private String driverPhone;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDriverName() {
		return this.driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverPhone() {
		return this.driverPhone;
	}
	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

}
