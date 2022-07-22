package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询AR汇总账单信息
 *
 * @author auto create
 * @since 1.0, 2021-12-10 11:49:50
 */
public class AlipayBossFncArsummarybillSummarybillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5376962977426877967L;

	/**
	 * 账单查询请求
	 */
	@ApiField("summary_bill_view_query_order")
	private SummaryBillViewQueryOrder summaryBillViewQueryOrder;

	public SummaryBillViewQueryOrder getSummaryBillViewQueryOrder() {
		return this.summaryBillViewQueryOrder;
	}
	public void setSummaryBillViewQueryOrder(SummaryBillViewQueryOrder summaryBillViewQueryOrder) {
		this.summaryBillViewQueryOrder = summaryBillViewQueryOrder;
	}

}
