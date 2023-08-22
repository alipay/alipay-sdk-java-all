package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BillInvoiceResponseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.billinvoice.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:17:54
 */
public class AlipayBossFncGfsettleprodBillinvoiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7745689519928991199L;

	/** 
	 * 结果集
	 */
	@ApiListField("result_set")
	@ApiField("bill_invoice_response_d_t_o")
	private List<BillInvoiceResponseDTO> resultSet;

	public void setResultSet(List<BillInvoiceResponseDTO> resultSet) {
		this.resultSet = resultSet;
	}
	public List<BillInvoiceResponseDTO> getResultSet( ) {
		return this.resultSet;
	}

}
