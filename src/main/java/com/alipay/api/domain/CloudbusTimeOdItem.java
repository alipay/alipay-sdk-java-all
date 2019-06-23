package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公交云分时查询结果输出列表
 *
 * @author auto create
 * @since 1.0, 2019-05-09 16:43:31
 */
public class CloudbusTimeOdItem extends AlipayObject {

	private static final long serialVersionUID = 5537324536351259662L;

	/**
	 * 公交od
	 */
	@ApiField("bus_od")
	private Long busOd;

	/**
	 * 潜在od
	 */
	@ApiField("od")
	private Long od;

	/**
	 * 时间，精确到小时
	 */
	@ApiField("time")
	private String time;

	public Long getBusOd() {
		return this.busOd;
	}
	public void setBusOd(Long busOd) {
		this.busOd = busOd;
	}

	public Long getOd() {
		return this.od;
	}
	public void setOd(Long od) {
		this.od = od;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
