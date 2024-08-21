package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiUserResourceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.urquerybyclvuids.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:00
 */
public class AlipayIserviceIsresourceUrquerybyclvuidsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5737445572363218596L;

	/** 
	 * 小二资源
	 */
	@ApiListField("biz_data")
	@ApiField("open_api_user_resource_info")
	private List<OpenApiUserResourceInfo> bizData;

	public void setBizData(List<OpenApiUserResourceInfo> bizData) {
		this.bizData = bizData;
	}
	public List<OpenApiUserResourceInfo> getBizData( ) {
		return this.bizData;
	}

}
