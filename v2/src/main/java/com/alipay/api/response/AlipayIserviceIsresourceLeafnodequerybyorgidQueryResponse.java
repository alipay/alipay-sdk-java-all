package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiOrganizationNodeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.leafnodequerybyorgid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:56:55
 */
public class AlipayIserviceIsresourceLeafnodequerybyorgidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1459722928443244623L;

	/** 
	 * 返回的组织节点列表
	 */
	@ApiListField("biz_data")
	@ApiField("open_api_organization_node_info")
	private List<OpenApiOrganizationNodeInfo> bizData;

	public void setBizData(List<OpenApiOrganizationNodeInfo> bizData) {
		this.bizData = bizData;
	}
	public List<OpenApiOrganizationNodeInfo> getBizData( ) {
		return this.bizData;
	}

}
