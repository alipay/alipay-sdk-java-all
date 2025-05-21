package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出租车司机车辆信息同步接口
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:05:15
 */
public class AlipayCommerceTransportTaxiDrivercarinfoSendModel extends AlipayObject {

	private static final long serialVersionUID = 1318352518121368616L;

	/**
	 * 出租车司机车辆信息列表
	 */
	@ApiListField("driver_car_info_list")
	@ApiField("driver_car_info")
	private List<DriverCarInfo> driverCarInfoList;

	/**
	 * 请求时间
	 */
	@ApiField("request_time")
	private String requestTime;

	public List<DriverCarInfo> getDriverCarInfoList() {
		return this.driverCarInfoList;
	}
	public void setDriverCarInfoList(List<DriverCarInfo> driverCarInfoList) {
		this.driverCarInfoList = driverCarInfoList;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

}
