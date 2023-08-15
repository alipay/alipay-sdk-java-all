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
 * @since 1.0, 2023-05-31 22:11:38
 */
public class AlipayIserviceCcmFunctionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5244328936354585178L;

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
