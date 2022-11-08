package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizTreeNodeWithNoRecursive;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.frastress.querybiztree.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-25 17:46:38
 */
public class AlipayBossBaseFrastressQuerybiztreeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4615392643251933864L;

	/** 
	 * BizTreeNode
	 */
	@ApiListField("biz_tree_node_result")
	@ApiField("biz_tree_node_with_no_recursive")
	private List<BizTreeNodeWithNoRecursive> bizTreeNodeResult;

	/** 
	 * 节点id
	 */
	@ApiField("node_id")
	private String nodeId;

	/** 
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/** 
	 * 树id
	 */
	@ApiField("tree_id")
	private String treeId;

	public void setBizTreeNodeResult(List<BizTreeNodeWithNoRecursive> bizTreeNodeResult) {
		this.bizTreeNodeResult = bizTreeNodeResult;
	}
	public List<BizTreeNodeWithNoRecursive> getBizTreeNodeResult( ) {
		return this.bizTreeNodeResult;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getNodeId( ) {
		return this.nodeId;
	}

	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}
	public String getTntInstId( ) {
		return this.tntInstId;
	}

	public void setTreeId(String treeId) {
		this.treeId = treeId;
	}
	public String getTreeId( ) {
		return this.treeId;
	}

}
