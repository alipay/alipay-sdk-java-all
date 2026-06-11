package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分时图查询接口
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:25:33
 */
public class AlipayEngineeringInfrastructureStockRealtimeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6569315918275752791L;

	/**
	 * 查询天数
	 */
	@ApiField("day")
	private Long day;

	/**
	 * 非必传。用于增量查询，表示需要
的最早的分时点时间。
当start小于最近day天的分时点的
最小时间时，start无效，返回最
近day天的分时点。
当start大禹最近day天的分时点的
最大时间时，返回分时点列表为
空。
	 */
	@ApiField("start")
	private String start;

	/**
	 * 标的代码
	 */
	@ApiField("symbol")
	private String symbol;

	public Long getDay() {
		return this.day;
	}
	public void setDay(Long day) {
		this.day = day;
	}

	public String getStart() {
		return this.start;
	}
	public void setStart(String start) {
		this.start = start;
	}

	public String getSymbol() {
		return this.symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
