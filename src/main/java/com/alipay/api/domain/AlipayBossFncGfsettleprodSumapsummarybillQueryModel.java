package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统计AP应付账单金额
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:26:06
 */
public class AlipayBossFncGfsettleprodSumapsummarybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8552183261635237938L;

	/**
	 * AP融合账单查询请求
	 */
	@ApiField("ap_summary_bill_view_query_orde")
	private ApSummaryBillViewQueryOrder apSummaryBillViewQueryOrde;

	public ApSummaryBillViewQueryOrder getApSummaryBillViewQueryOrde() {
		return this.apSummaryBillViewQueryOrde;
	}
	public void setApSummaryBillViewQueryOrde(ApSummaryBillViewQueryOrder apSummaryBillViewQueryOrde) {
		this.apSummaryBillViewQueryOrde = apSummaryBillViewQueryOrde;
	}

}
