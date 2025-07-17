package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiOrganizationNodeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.organizationqueryall.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:26:42
 */
public class AlipayIserviceIsresourceOrganizationqueryallQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3286681625239929619L;

	/** 
	 * 查询返回的组织节点
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
