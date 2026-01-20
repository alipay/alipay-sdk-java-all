package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 港股通静态数据查询
 *
 * @author auto create
 * @since 1.0, 2026-01-06 19:21:39
 */
public class AlipayFinanceQuotationQuotetradeopenHkstockconnsymbolBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1411167722588371165L;

	/**
	 * 表示支持港股通的市场类型，沪港通合深港通
	 */
	@ApiListField("conn_types")
	@ApiField("string")
	private List<String> connTypes;

	/**
	 * 分页查询条件
	 */
	@ApiField("page_cond")
	private PageCond pageCond;

	/**
	 * 港股通股票标的
	 */
	@ApiListField("symbols")
	@ApiField("string")
	private List<String> symbols;

	public List<String> getConnTypes() {
		return this.connTypes;
	}
	public void setConnTypes(List<String> connTypes) {
		this.connTypes = connTypes;
	}

	public PageCond getPageCond() {
		return this.pageCond;
	}
	public void setPageCond(PageCond pageCond) {
		this.pageCond = pageCond;
	}

	public List<String> getSymbols() {
		return this.symbols;
	}
	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}

}
