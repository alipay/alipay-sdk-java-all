package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiOutputInvoiceVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.preview response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-16 15:38:28
 */
public class AlipayBossFncOutputinvoicePreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 6886828391654564319L;

	/** 
	 * 返回结果
	 */
	@ApiListField("result_set")
	@ApiField("open_api_output_invoice_v_o")
	private List<OpenApiOutputInvoiceVO> resultSet;

	public void setResultSet(List<OpenApiOutputInvoiceVO> resultSet) {
		this.resultSet = resultSet;
	}
	public List<OpenApiOutputInvoiceVO> getResultSet( ) {
		return this.resultSet;
	}

}
