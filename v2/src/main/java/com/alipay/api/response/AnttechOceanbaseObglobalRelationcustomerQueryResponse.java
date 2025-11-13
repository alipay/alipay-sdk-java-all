package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CustomerLeadsRelationResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.relationcustomer.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-12 15:47:41
 */
public class AnttechOceanbaseObglobalRelationcustomerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4346421281346738443L;

	/** 
	 * null
	 */
	@ApiListField("result")
	@ApiField("customer_leads_relation_response")
	private List<CustomerLeadsRelationResponse> result;

	public void setResult(List<CustomerLeadsRelationResponse> result) {
		this.result = result;
	}
	public List<CustomerLeadsRelationResponse> getResult( ) {
		return this.result;
	}

}
