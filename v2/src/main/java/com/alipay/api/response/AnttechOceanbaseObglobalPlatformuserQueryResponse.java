package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PlatformUserQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.platformuser.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 14:26:05
 */
public class AnttechOceanbaseObglobalPlatformuserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5212236815448815727L;

	/** 
	 * null
	 */
	@ApiListField("result")
	@ApiField("platform_user_query_response")
	private List<PlatformUserQueryResponse> result;

	public void setResult(List<PlatformUserQueryResponse> result) {
		this.result = result;
	}
	public List<PlatformUserQueryResponse> getResult( ) {
		return this.result;
	}

}
