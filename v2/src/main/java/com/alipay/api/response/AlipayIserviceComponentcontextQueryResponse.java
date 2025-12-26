package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ComponentContextResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.componentcontext.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-29 15:32:08
 */
public class AlipayIserviceComponentcontextQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3279713143556271385L;

	/** 
	 * 复杂类型，参见具体字段描述
	 */
	@ApiListField("component_context_response")
	@ApiField("component_context_response")
	private List<ComponentContextResponse> componentContextResponse;

	public void setComponentContextResponse(List<ComponentContextResponse> componentContextResponse) {
		this.componentContextResponse = componentContextResponse;
	}
	public List<ComponentContextResponse> getComponentContextResponse( ) {
		return this.componentContextResponse;
	}

}
