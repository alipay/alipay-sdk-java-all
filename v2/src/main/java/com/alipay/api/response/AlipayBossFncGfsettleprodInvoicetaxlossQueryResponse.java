package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceRevAmountDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.invoicetaxloss.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:05:45
 */
public class AlipayBossFncGfsettleprodInvoicetaxlossQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3273856195744314574L;

	/** 
	 * 发票信息
	 */
	@ApiListField("result_set")
	@ApiField("invoice_rev_amount_d_t_o")
	private List<InvoiceRevAmountDTO> resultSet;

	public void setResultSet(List<InvoiceRevAmountDTO> resultSet) {
		this.resultSet = resultSet;
	}
	public List<InvoiceRevAmountDTO> getResultSet( ) {
		return this.resultSet;
	}

}
