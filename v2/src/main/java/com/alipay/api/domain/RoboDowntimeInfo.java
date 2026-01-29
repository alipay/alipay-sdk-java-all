package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-27 10:57:42
 */
public class RoboDowntimeInfo extends AlipayObject {

	private static final long serialVersionUID = 3432231952548899259L;

	/**
	 * 停运结束时间
	 */
	@ApiField("end")
	private String end;

	/**
	 * 停运开始时间
	 */
	@ApiField("start")
	private String start;

	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public String getStart() {
		return this.start;
	}
	public void setStart(String start) {
		this.start = start;
	}

}
