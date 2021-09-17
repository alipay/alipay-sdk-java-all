package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一结算应付融合账单查询
 *
 * @author auto create
 * @since 1.0, 2021-08-05 14:53:03
 */
public class AlipayBossFncGfsettleprodApsummarybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3682872219599581132L;

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
