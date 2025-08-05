package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行情分时对象详情
 *
 * @author auto create
 * @since 1.0, 2025-04-15 16:39:57
 */
public class ObjTrendDTO extends AlipayObject {

	private static final long serialVersionUID = 8595952155792345587L;

	/**
	 * 个股标识
	 */
	@ApiField("symbol")
	private String symbol;

	/**
	 * 点位详细信息
	 */
	@ApiListField("trend_list")
	@ApiField("trend_d_t_o")
	private List<TrendDTO> trendList;

	public String getSymbol() {
		return this.symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public List<TrendDTO> getTrendList() {
		return this.trendList;
	}
	public void setTrendList(List<TrendDTO> trendList) {
		this.trendList = trendList;
	}

}
