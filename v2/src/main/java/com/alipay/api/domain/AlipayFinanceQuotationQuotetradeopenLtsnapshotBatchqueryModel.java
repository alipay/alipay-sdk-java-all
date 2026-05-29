package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * L2快照查询
 *
 * @author auto create
 * @since 1.0, 2026-04-08 17:52:44
 */
public class AlipayFinanceQuotationQuotetradeopenLtsnapshotBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4154429651769687443L;

	/**
	 * null
	 */
	@ApiListField("symbols")
	@ApiField("string")
	private List<String> symbols;

	public List<String> getSymbols() {
		return this.symbols;
	}
	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}

}
