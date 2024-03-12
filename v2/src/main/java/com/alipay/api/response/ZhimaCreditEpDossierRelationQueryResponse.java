package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RelationNodeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:49
 */
public class ZhimaCreditEpDossierRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8165324331682181964L;

	/** 
	 * 关联关系列表
	 */
	@ApiListField("relation_node_list")
	@ApiField("relation_node_info")
	private List<RelationNodeInfo> relationNodeList;

	public void setRelationNodeList(List<RelationNodeInfo> relationNodeList) {
		this.relationNodeList = relationNodeList;
	}
	public List<RelationNodeInfo> getRelationNodeList( ) {
		return this.relationNodeList;
	}

}
