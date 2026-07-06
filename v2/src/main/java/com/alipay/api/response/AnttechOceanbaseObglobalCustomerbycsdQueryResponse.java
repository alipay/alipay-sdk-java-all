package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CustomerWithPlatformUsersResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.customerbycsd.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-23 14:42:57
 */
public class AnttechOceanbaseObglobalCustomerbycsdQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8219519348197288274L;

	/** 
	 * null
	 */
	@ApiListField("result")
	@ApiField("customer_with_platform_users_resp")
	private List<CustomerWithPlatformUsersResp> result;

	public void setResult(List<CustomerWithPlatformUsersResp> result) {
		this.result = result;
	}
	public List<CustomerWithPlatformUsersResp> getResult( ) {
		return this.result;
	}

}
