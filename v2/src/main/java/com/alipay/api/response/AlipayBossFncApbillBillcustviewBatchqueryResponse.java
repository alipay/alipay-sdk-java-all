package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ApMonthlyBillCustOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.apbill.billcustview.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:00
 */
public class AlipayBossFncApbillBillcustviewBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2313115118743334645L;

	/** 
	 * 应付月账单客户视图
	 */
	@ApiListField("result_set")
	@ApiField("ap_monthly_bill_cust_open_api_response")
	private List<ApMonthlyBillCustOpenApiResponse> resultSet;

	public void setResultSet(List<ApMonthlyBillCustOpenApiResponse> resultSet) {
		this.resultSet = resultSet;
	}
	public List<ApMonthlyBillCustOpenApiResponse> getResultSet( ) {
		return this.resultSet;
	}

}
