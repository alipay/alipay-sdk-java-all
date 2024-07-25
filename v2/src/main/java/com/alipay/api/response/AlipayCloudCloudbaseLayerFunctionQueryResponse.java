package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FuntionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.layer.function.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-27 15:12:05
 */
public class AlipayCloudCloudbaseLayerFunctionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8419143327121813297L;

	/** 
	 * 函数列表
	 */
	@ApiListField("functions")
	@ApiField("funtion_info")
	private List<FuntionInfo> functions;

	public void setFunctions(List<FuntionInfo> functions) {
		this.functions = functions;
	}
	public List<FuntionInfo> getFunctions( ) {
		return this.functions;
	}

}
