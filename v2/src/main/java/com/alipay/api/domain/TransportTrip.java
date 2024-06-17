package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交通行程
 *
 * @author auto create
 * @since 1.0, 2023-09-11 20:24:55
 */
public class TransportTrip extends AlipayObject {

	private static final long serialVersionUID = 3557831784419362137L;

	/**
	 * 运营方向，与线路表方向相同
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 行程到达时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 行程出发时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
