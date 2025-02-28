package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 负荷信息节点
 *
 * @author auto create
 * @since 1.0, 2024-12-02 10:48:24
 */
public class LoadInfoNode extends AlipayObject {

	private static final long serialVersionUID = 4167939463822686117L;

	/**
	 * 节点结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 负荷信息，单位 kw
	 */
	@ApiField("load")
	private String load;

	/**
	 * 节点开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getLoad() {
		return this.load;
	}
	public void setLoad(String load) {
		this.load = load;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
