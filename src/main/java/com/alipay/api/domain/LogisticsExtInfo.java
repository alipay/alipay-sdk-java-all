package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑到家订单物流信息的扩展信息
 *
 * @author auto create
 * @since 1.0, 2016-02-02 15:36:07
 */
public class LogisticsExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3567281473583123652L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 结束服务时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 开始服务时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
