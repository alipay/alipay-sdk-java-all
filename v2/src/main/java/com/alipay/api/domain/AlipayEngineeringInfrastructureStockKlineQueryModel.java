package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * K线数据查询接口
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:27:46
 */
public class AlipayEngineeringInfrastructureStockKlineQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3479432871496239814L;

	/**
	 * 限制条目、非null 
	 */
	@ApiField("count")
	private String count;

	/**
	 * K线周期类型:
  // 1 分钟
  P_Min1
    // 5 分钟  
    P_Min5
    // 15 分钟
    P_Min15
    // 30 分钟 
    P_Min30
    // 60 分钟  
    P_Min60
    // 日 
    P_Day1
    // 周 
    P_Week1
    // 月 
    P_Month1
	 */
	@ApiField("period")
	private String period;

	/**
	 * 请求模式是end + count，即以end时间节点为起点，向历史查询count个数据
	 */
	@ApiField("query_range")
	private QueryRange queryRange;

	/**
	 * * 复权类型
     * 前复权   =  S_Before
     * 后复权   =  S_After
     * 不复权   =  S_Unsplit
	 */
	@ApiField("split")
	private String split;

	/**
	 * 股票代码
	 */
	@ApiField("symbol")
	private String symbol;

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public QueryRange getQueryRange() {
		return this.queryRange;
	}
	public void setQueryRange(QueryRange queryRange) {
		this.queryRange = queryRange;
	}

	public String getSplit() {
		return this.split;
	}
	public void setSplit(String split) {
		this.split = split;
	}

	public String getSymbol() {
		return this.symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
