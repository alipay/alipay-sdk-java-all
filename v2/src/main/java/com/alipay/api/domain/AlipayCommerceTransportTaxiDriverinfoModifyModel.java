package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 司机信息变更接口
 *
 * @author auto create
 * @since 1.0, 2023-05-05 14:58:05
 */
public class AlipayCommerceTransportTaxiDriverinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1248697122437383626L;

	/**
	 * 流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 司机和车辆信息
	 */
	@ApiField("driver_car_info")
	private DriverCarInfo driverCarInfo;

	/**
	 * 司机open_id
	 */
	@ApiField("driver_open_id")
	private String driverOpenId;

	/**
	 * 司机uid
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

	/**
	 * 请求时间
	 */
	@ApiField("request_time")
	private String requestTime;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public DriverCarInfo getDriverCarInfo() {
		return this.driverCarInfo;
	}
	public void setDriverCarInfo(DriverCarInfo driverCarInfo) {
		this.driverCarInfo = driverCarInfo;
	}

	public String getDriverOpenId() {
		return this.driverOpenId;
	}
	public void setDriverOpenId(String driverOpenId) {
		this.driverOpenId = driverOpenId;
	}

	public String getDriverUserId() {
		return this.driverUserId;
	}
	public void setDriverUserId(String driverUserId) {
		this.driverUserId = driverUserId;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

}
