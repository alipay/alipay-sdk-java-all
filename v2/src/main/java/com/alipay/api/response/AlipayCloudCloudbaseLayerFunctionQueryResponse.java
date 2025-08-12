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
 * @since 1.0, 2025-08-04 11:08:30
 */
public class AlipayCloudCloudbaseLayerFunctionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1348514396919912475L;

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
