package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CustomerWithPlatformUsersResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.customerbyowner.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 15:27:41
 */
public class AnttechOceanbaseObglobalCustomerbyownerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6181272195245459882L;

	/** 
	 * null
	 */
	@ApiListField("result")
	@ApiField("customer_with_platform_users_response")
	private List<CustomerWithPlatformUsersResponse> result;

	public void setResult(List<CustomerWithPlatformUsersResponse> result) {
		this.result = result;
	}
	public List<CustomerWithPlatformUsersResponse> getResult( ) {
		return this.result;
	}

}
