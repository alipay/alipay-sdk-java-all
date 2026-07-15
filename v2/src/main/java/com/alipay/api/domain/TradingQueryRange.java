package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请求时间范围
 *
 * @author auto create
 * @since 1.0, 2026-07-01 11:57:57
 */
public class TradingQueryRange extends AlipayObject {

	private static final long serialVersionUID = 8297714344167797521L;

	/**
	 * 结束时间的时间戳，单位为毫秒
	 */
	@ApiField("end")
	private Long end;

	/**
	 * 是否包含结束时间
	 */
	@ApiField("include_end")
	private Boolean includeEnd;

	/**
	 * 是否包含开始时间
	 */
	@ApiField("include_start")
	private Boolean includeStart;

	/**
	 * 查询开始时间的时间戳，单位为毫秒
	 */
	@ApiField("start")
	private Long start;

	public Long getEnd() {
		return this.end;
	}
	public void setEnd(Long end) {
		this.end = end;
	}

	public Boolean getIncludeEnd() {
		return this.includeEnd;
	}
	public void setIncludeEnd(Boolean includeEnd) {
		this.includeEnd = includeEnd;
	}

	public Boolean getIncludeStart() {
		return this.includeStart;
	}
	public void setIncludeStart(Boolean includeStart) {
		this.includeStart = includeStart;
	}

	public Long getStart() {
		return this.start;
	}
	public void setStart(Long start) {
		this.start = start;
	}

}
