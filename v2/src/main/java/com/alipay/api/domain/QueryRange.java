package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请求模式是end + count，即以end时间节点为起点，向历史查询count个数据
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:27:46
 */
public class QueryRange extends AlipayObject {

	private static final long serialVersionUID = 6396742598822268351L;

	/**
	 * 查询范围的结束时间戳
	 */
	@ApiField("end")
	private String end;

	/**
	 * 是否包含结束时间点，true表示包含，false表示不包含
	 */
	@ApiField("include_end")
	private Boolean includeEnd;

	/**
	 * 是否包含起始时间点，true表示包含，false表示不包含
	 */
	@ApiField("include_start")
	private Boolean includeStart;

	/**
	 * 查询范围的起始时间戳
	 */
	@ApiField("start")
	private String start;

	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
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

	public String getStart() {
		return this.start;
	}
	public void setStart(String start) {
		this.start = start;
	}

}
