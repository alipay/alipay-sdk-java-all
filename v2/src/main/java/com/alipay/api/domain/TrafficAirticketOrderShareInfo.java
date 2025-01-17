package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行机票订单数据同步-共享航班信息
 *
 * @author auto create
 * @since 1.0, 2024-09-26 20:34:18
 */
public class TrafficAirticketOrderShareInfo extends AlipayObject {

	private static final long serialVersionUID = 1745142662331527111L;

	/**
	 * 主飞（实际承运）航司二字码
	 */
	@ApiField("ac_code")
	private String acCode;

	/**
	 * 主飞（实际承运）航司名称
	 */
	@ApiField("ac_name")
	private String acName;

	/**
	 * 主飞（实际承运）航班号
	 */
	@ApiField("flight_no")
	private String flightNo;

	public String getAcCode() {
		return this.acCode;
	}
	public void setAcCode(String acCode) {
		this.acCode = acCode;
	}

	public String getAcName() {
		return this.acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}

	public String getFlightNo() {
		return this.flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

}
