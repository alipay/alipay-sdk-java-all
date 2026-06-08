package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CustomerQueryResponseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfcustomer.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-05 10:27:53
 */
public class AnttechOceanbaseObglobalSfcustomerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7273797452426557486L;

	/** 
	 * null
	 */
	@ApiListField("result")
	@ApiField("customer_query_response_d_t_o")
	private List<CustomerQueryResponseDTO> result;

	public void setResult(List<CustomerQueryResponseDTO> result) {
		this.result = result;
	}
	public List<CustomerQueryResponseDTO> getResult( ) {
		return this.result;
	}

}
