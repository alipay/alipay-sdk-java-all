package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FunctionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.layer.function.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-16 15:02:07
 */
public class AlipayCloudCloudbaseLayerFunctionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6775864181273937915L;

	/** 
	 * 函数列表
	 */
	@ApiListField("functions")
	@ApiField("function_info")
	private List<FunctionInfo> functions;

	public void setFunctions(List<FunctionInfo> functions) {
		this.functions = functions;
	}
	public List<FunctionInfo> getFunctions( ) {
		return this.functions;
	}

}
