package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Function;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.function.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 14:55:36
 */
public class AlipayIserviceCcmFunctionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8199877676251567225L;

	/** 
	 * 功能点列表
	 */
	@ApiListField("functions")
	@ApiField("function")
	private List<Function> functions;

	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}
	public List<Function> getFunctions( ) {
		return this.functions;
	}

}
