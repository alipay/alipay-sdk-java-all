package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupportFunction;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.function.query response.
 * 
 * @author auto create
 * @since 1.0, 2015-12-15 11:19:03
 */
public class AlipayCommerceCityfacilitatorFunctionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7312481892818178651L;

	/** 
	 * 支持的功能列表
	 */
	@ApiListField("functions")
	@ApiField("support_function")
	private List<SupportFunction> functions;

	public void setFunctions(List<SupportFunction> functions) {
		this.functions = functions;
	}
	public List<SupportFunction> getFunctions( ) {
		return this.functions;
	}

}
