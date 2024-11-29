package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExpenseBillQueryItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.orderbill.expense.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-14 14:42:06
 */
public class AlipayOpenMiniOrderbillExpenseBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4385173337237491635L;

	/** 
	 * 费用查询结果
	 */
	@ApiListField("result_list")
	@ApiField("expense_bill_query_item")
	private List<ExpenseBillQueryItem> resultList;

	public void setResultList(List<ExpenseBillQueryItem> resultList) {
		this.resultList = resultList;
	}
	public List<ExpenseBillQueryItem> getResultList( ) {
		return this.resultList;
	}

}
