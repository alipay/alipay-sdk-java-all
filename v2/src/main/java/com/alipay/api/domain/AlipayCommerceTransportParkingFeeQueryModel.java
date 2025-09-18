package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车费查询
 *
 * @author auto create
 * @since 1.0, 2025-08-21 10:22:36
 */
public class AlipayCommerceTransportParkingFeeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8546345477413771315L;

	/**
	 * 查询的车牌号
	 */
	@ApiField("license_plate_no")
	private String licensePlateNo;

	/**
	 * 查询渠道值
	 */
	@ApiField("request_channel")
	private String requestChannel;

	public String getLicensePlateNo() {
		return this.licensePlateNo;
	}
	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}

	public String getRequestChannel() {
		return this.requestChannel;
	}
	public void setRequestChannel(String requestChannel) {
		this.requestChannel = requestChannel;
	}

}
