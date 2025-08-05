package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 股票分时行情价格查询
 *
 * @author auto create
 * @since 1.0, 2025-04-16 11:41:40
 */
public class AlipayFinanceQuotationQuotetradeopenTrendBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7139198417542148711L;

	/**
	 * 查询最近{day}天的分时数据
	 */
	@ApiField("day")
	private String day;

	/**
	 * 非必传，用于增量查询，最早的分时点时间
	 */
	@ApiField("start")
	private String start;

	/**
	 * 股票唯一编码，拼接规则：股票代码.股票市场
	 */
	@ApiListField("symbols")
	@ApiField("string")
	private List<String> symbols;

	public String getDay() {
		return this.day;
	}
	public void setDay(String day) {
		this.day = day;
	}

	public String getStart() {
		return this.start;
	}
	public void setStart(String start) {
		this.start = start;
	}

	public List<String> getSymbols() {
		return this.symbols;
	}
	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}

}
