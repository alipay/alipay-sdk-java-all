package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesTheThirteen;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.treeapitwelve.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-23 18:29:11
 */
public class AlipayDataDataserviceTreeapitwelveRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6526349819169731879L;

	/** 
	 * 测试数据
	 */
	@ApiField("res_ref")
	private RainyComplexTypesTheThirteen resRef;

	public void setResRef(RainyComplexTypesTheThirteen resRef) {
		this.resRef = resRef;
	}
	public RainyComplexTypesTheThirteen getResRef( ) {
		return this.resRef;
	}

}
