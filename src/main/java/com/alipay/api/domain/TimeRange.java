package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 时间区间
 *
 * @author auto create
 * @since 1.0, 2020-03-30 15:24:36
 */
public class TimeRange extends AlipayObject {

	private static final long serialVersionUID = 2859436494796373456L;

	/**
	 * 开始时间
	 */
	@ApiField("begin")
	private String begin;

	/**
	 * 结束时间
	 */
	@ApiField("end")
	private String end;

	public String getBegin() {
		return this.begin;
	}
	public void setBegin(String begin) {
		this.begin = begin;
	}

	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

}
