package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联关系信息模型
 *
 * @author auto create
 * @since 1.0, 2024-05-10 11:51:34
 */
public class RelationNodeInfo extends AlipayObject {

	private static final long serialVersionUID = 6633191644699793113L;

	/**
	 * 股权穿透持股比：当关联关系类型为 ubo 时，该值代表最终受益人到被查公司各路径的股权穿透持股比
	 */
	@ApiField("equity_penetration_ratio")
	private String equityPenetrationRatio;

	/**
	 * 当前节点的层数
	 */
	@ApiField("layer")
	private Long layer;

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
	 * 持股比例：当关联关系类型为 ubo 时，该值为最终受益人相对于被查公司的受益持股比例（基于银发235号文、164号文的定义计算所得）
	 */
	@ApiField("ultimate_ratio")
	private String ultimateRatio;

	public String getEquityPenetrationRatio() {
		return this.equityPenetrationRatio;
	}
	public void setEquityPenetrationRatio(String equityPenetrationRatio) {
		this.equityPenetrationRatio = equityPenetrationRatio;
	}

	public Long getLayer() {
		return this.layer;
	}
	public void setLayer(Long layer) {
		this.layer = layer;
	}

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
