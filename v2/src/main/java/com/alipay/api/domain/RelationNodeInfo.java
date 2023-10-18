package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联关系信息模型
 *
 * @author auto create
 * @since 1.0, 2023-03-31 14:38:35
 */
public class RelationNodeInfo extends AlipayObject {

	private static final long serialVersionUID = 4835361957822982899L;

	/**
	 * 节点名称，根据不同的关联关系类型，可能为企业名或者人名
	 */
	@ApiField("node_name")
	private String nodeName;

	/**
	 * 节点编号，当product_code=uboQuery时，该字段为空
	 */
	@ApiField("node_no")
	private String nodeNo;

	/**
	 * 节点类型
	 */
	@ApiField("node_type")
	private String nodeType;

	/**
	 * 关联关系类型
	 */
	@ApiField("relation_code")
	private String relationCode;

	/**
	 * 持股比例
	 */
	@ApiField("ultimate_ratio")
	private String ultimateRatio;

	public String getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getNodeNo() {
		return this.nodeNo;
	}
	public void setNodeNo(String nodeNo) {
		this.nodeNo = nodeNo;
	}

	public String getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getRelationCode() {
		return this.relationCode;
	}
	public void setRelationCode(String relationCode) {
		this.relationCode = relationCode;
	}

	public String getUltimateRatio() {
		return this.ultimateRatio;
	}
	public void setUltimateRatio(String ultimateRatio) {
		this.ultimateRatio = ultimateRatio;
	}

}
