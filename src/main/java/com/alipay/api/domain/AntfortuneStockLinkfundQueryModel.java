package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询关联场外基金
 *
 * @author auto create
 * @since 1.0, 2022-02-25 22:03:44
 */
public class AntfortuneStockLinkfundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5287269566538344222L;

	/**
	 * 返回限制数，默认为1
	 */
	@ApiField("ret_limit")
	private Long retLimit;

	/**
	 * 股票代码+市场
	 */
	@ApiField("symbol")
	private String symbol;

	public Long getRetLimit() {
		return this.retLimit;
	}
	public void setRetLimit(Long retLimit) {
		this.retLimit = retLimit;
	}

	public String getSymbol() {
		return this.symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
