package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一结算应付融合账单查询
 *
 * @author auto create
 * @since 1.0, 2026-01-26 11:17:34
 */
public class AlipayBossFncGfsettleprodApsummarybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1154578436895594117L;

	/**
	 * 查询
	 */
	@ApiField("ap_summary_bill_view_query_order")
	private ApSummaryBillViewQueryOrder apSummaryBillViewQueryOrder;

	public ApSummaryBillViewQueryOrder getApSummaryBillViewQueryOrder() {
		return this.apSummaryBillViewQueryOrder;
	}
	public void setApSummaryBillViewQueryOrder(ApSummaryBillViewQueryOrder apSummaryBillViewQueryOrder) {
		this.apSummaryBillViewQueryOrder = apSummaryBillViewQueryOrder;
	}

}
