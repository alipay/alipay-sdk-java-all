package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpCertNoCustomerInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.customerbyepcertno.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 10:27:52
 */
public class AnttechOceanbaseObglobalCustomerbyepcertnoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3774245251581143335L;

	/** 
	 * null
	 */
	@ApiListField("result")
	@ApiField("ep_cert_no_customer_info_d_t_o")
	private List<EpCertNoCustomerInfoDTO> result;

	public void setResult(List<EpCertNoCustomerInfoDTO> result) {
		this.result = result;
	}
	public List<EpCertNoCustomerInfoDTO> getResult( ) {
		return this.result;
	}

}
