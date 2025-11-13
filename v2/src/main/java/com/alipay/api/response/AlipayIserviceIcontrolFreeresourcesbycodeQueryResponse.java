package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AvailableResourceModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.icontrol.freeresourcesbycode.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-04 10:47:41
 */
public class AlipayIserviceIcontrolFreeresourcesbycodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3529888152185798511L;

	/** 
	 * 返回的结果
	 */
	@ApiListField("resources")
	@ApiField("available_resource_model")
	private List<AvailableResourceModel> resources;

	public void setResources(List<AvailableResourceModel> resources) {
		this.resources = resources;
	}
	public List<AvailableResourceModel> getResources( ) {
		return this.resources;
	}

}
