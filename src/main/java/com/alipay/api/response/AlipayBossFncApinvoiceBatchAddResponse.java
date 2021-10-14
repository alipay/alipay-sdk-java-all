package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ApInvoiceBillAmtOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.apinvoice.batch.add response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-14 14:52:12
 */
public class AlipayBossFncApinvoiceBatchAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7222618478777347925L;

	/** 
	 * 批量发票关联账单，返回发票id及对应的账单+分配金额
	 */
	@ApiListField("result_set")
	@ApiField("ap_invoice_bill_amt_open_api_response")
	private List<ApInvoiceBillAmtOpenApiResponse> resultSet;

	public void setResultSet(List<ApInvoiceBillAmtOpenApiResponse> resultSet) {
		this.resultSet = resultSet;
	}
	public List<ApInvoiceBillAmtOpenApiResponse> getResultSet( ) {
		return this.resultSet;
	}

}
