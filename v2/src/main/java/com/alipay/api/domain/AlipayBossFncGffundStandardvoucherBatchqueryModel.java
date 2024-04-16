package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标准资金流水凭证批量查询
 *
 * @author auto create
 * @since 1.0, 2021-10-13 10:32:13
 */
public class AlipayBossFncGffundStandardvoucherBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2344612848223955341L;

	/**
	 * 标准流水查询请求体
	 */
	@ApiField("standard_voucher_multiple_condition_query_request")
	private StandardVoucherMultipleConditionQueryRequest standardVoucherMultipleConditionQueryRequest;

	public StandardVoucherMultipleConditionQueryRequest getStandardVoucherMultipleConditionQueryRequest() {
		return this.standardVoucherMultipleConditionQueryRequest;
	}
	public void setStandardVoucherMultipleConditionQueryRequest(StandardVoucherMultipleConditionQueryRequest standardVoucherMultipleConditionQueryRequest) {
		this.standardVoucherMultipleConditionQueryRequest = standardVoucherMultipleConditionQueryRequest;
	}

}
