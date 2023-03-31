package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作业结果回传数据拓展字段
 *
 * @author auto create
 * @since 1.0, 2021-11-16 13:51:43
 */
public class OperationResultExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7817617931367615415L;

	/**
	 * 激活时间
	 */
	@ApiField("activation_time")
	private String activationTime;

	/**
	 * 设备号
	 */
	@ApiField("device_no")
	private String deviceNo;

	public String getActivationTime() {
		return this.activationTime;
	}
	public void setActivationTime(String activationTime) {
		this.activationTime = activationTime;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

}
