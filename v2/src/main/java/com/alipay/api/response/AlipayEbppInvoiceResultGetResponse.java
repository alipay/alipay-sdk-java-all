package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntInvoiceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.result.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:34:49
 */
public class AlipayEbppInvoiceResultGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2265688236334349926L;

	/** 
	 * 发票详细信息
开票返回结果数据列表。
根据platform_tid查询时，可返回多条开票结果数据。
根据apply_id查询时，返回数组中只会有一条数据
	 */
	@ApiListField("invoice_result_list")
	@ApiField("ant_invoice_result")
	private List<AntInvoiceResult> invoiceResultList;

	public void setInvoiceResultList(List<AntInvoiceResult> invoiceResultList) {
		this.invoiceResultList = invoiceResultList;
	}
	public List<AntInvoiceResult> getInvoiceResultList( ) {
		return this.invoiceResultList;
	}

}
