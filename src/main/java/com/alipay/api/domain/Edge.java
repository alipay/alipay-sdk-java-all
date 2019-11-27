package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业云图边表，用于描述云图两点之间的关系
 *
 * @author auto create
 * @since 1.0, 2017-09-28 10:33:57
 */
public class Edge extends AlipayObject {

	private static final long serialVersionUID = 7855879927516944974L;

	/**
	 * 认缴出资比例：关系类型为“股东”时提供
	 */
	@ApiField("funded_ratio")
	private String fundedRatio;

	/**
	 * 节点i的点id。点id，该点的唯一标志。格式为企业名称（如浙江蚂蚁小微金融服务集团股份有限公司）
 或 营业注册号#法人名称（如30000000082655#周鹏）
	 */
	@ApiField("i_node_id")
	private String iNodeId;

	/**
	 * 该点的唯一标识
	 */
	@ApiField("id")
	private String id;

	/**
	 * 节点j的点id。点id，该点的唯一标志。格式为企业名称（如浙江蚂蚁小微金融服务集团股份有限公司）
 或 营业注册号#法人名称（如30000000082655#周鹏）
	 */
	@ApiField("j_node_id")
	private String jNodeId;

	/**
	 * 强弱程度：关系类型为“社交”时提供。枚举值：1/2/3。 
备注： 1-强,2-中,3-弱
	 */
	@ApiField("level")
	private String level;

	/**
	 * 强弱程度指数：关系类型为“社交”时提供。取值为0-1000，值越高强度越高。
	 */
	@ApiField("level_index")
	private String levelIndex;

	/**
	 * 认缴出资币种
	 */
	@ApiField("reg_cap_cur")
	private String regCapCur;

	/**
	 * 关系类型：以上均为单向关系，代表节点i是节点j的关系的。枚举值:法人/股东/董事/监事/高管/亲人/社交/其他。
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 认缴出资额：关系类型为“股东”时提供
	 */
	@ApiField("sub_conam")
	private String subConam;

	public String getFundedRatio() {
		return this.fundedRatio;
	}
	public void setFundedRatio(String fundedRatio) {
		this.fundedRatio = fundedRatio;
	}

	public String getiNodeId() {
		return this.iNodeId;
	}
	public void setiNodeId(String iNodeId) {
		this.iNodeId = iNodeId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getjNodeId() {
		return this.jNodeId;
	}
	public void setjNodeId(String jNodeId) {
		this.jNodeId = jNodeId;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevelIndex() {
		return this.levelIndex;
	}
	public void setLevelIndex(String levelIndex) {
		this.levelIndex = levelIndex;
	}

	public String getRegCapCur() {
		return this.regCapCur;
	}
	public void setRegCapCur(String regCapCur) {
		this.regCapCur = regCapCur;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getSubConam() {
		return this.subConam;
	}
	public void setSubConam(String subConam) {
		this.subConam = subConam;
	}

}
