package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车助手查询接口
 *
 * @author auto create
 * @since 1.0, 2025-09-03 13:57:37
 */
public class AlipayCommerceTransportParkingAssistantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1621324251643399116L;

	/**
	 * 车牌颜色，如果不填，则默认7位为蓝色，8位为绿色；
枚举值：
蓝:BLUE
绿:GREEN
黄:YELLOW
白:WHITE
黑:BLACK
黄绿色:LIMEGREEN
橄榄色:OLIVINE
未知:UNKNOWN
	 */
	@ApiField("license_plate_color")
	private String licensePlateColor;

	/**
	 * 车牌号
	 */
	@ApiField("license_plate_no")
	private String licensePlateNo;

	public String getLicensePlateColor() {
		return this.licensePlateColor;
	}
	public void setLicensePlateColor(String licensePlateColor) {
		this.licensePlateColor = licensePlateColor;
	}

	public String getLicensePlateNo() {
		return this.licensePlateNo;
	}
	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}

}
