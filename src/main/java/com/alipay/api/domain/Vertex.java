package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业云图--点表的数据结构
 *
 * @author auto create
 * @since 1.0, 2017-09-19 13:15:27
 */
public class Vertex extends AlipayObject {

	private static final long serialVersionUID = 2637753962335582449L;

	/**
	 * 节点证件名称。企业的为企业名称，个人的为个人名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 节点证件号码：节点为企业时输出，为个人时不输出。目前全部为工商注册号。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。节点为企业时可能有该字段。
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 企业地址，节点为企业时可能有该字段
	 */
	@ApiField("dom")
	private String dom;

	/**
	 * 企业的状态
	 */
	@ApiField("ent_status")
	private String entStatus;

	/**
	 * 企业类型
	 */
	@ApiField("ent_type")
	private String entType;

	/**
	 * 点id，该点的唯一标志。格式为企业名称（如浙江蚂蚁小微金融服务集团股份有限公司）
 或 营业注册号#法人名称（如30000000082655#周鹏）
	 */
	@ApiField("id")
	private String id;

	/**
	 * 是否在关注名单内。true-在关注名单内；false-不在关注名单内。
	 */
	@ApiField("in_black_list")
	private String inBlackList;

	/**
	 * 注册资本。节点为企业时返回。
	 */
	@ApiField("reg_cap")
	private String regCap;

	/**
	 * 币种，节点为企业时有该字段
	 */
	@ApiField("reg_cap_cur")
	private String regCapCur;

	/**
	 * 企业登记机关
	 */
	@ApiField("reg_org")
	private String regOrg;

	/**
	 * 关联层级： 0 被查询企业 1 一层关联 2 二层关联 3 三层关联
	 */
	@ApiField("relation_level")
	private String relationLevel;

	/**
	 * 节点的风险指数：0~1之间，指数越高风险越高
	 */
	@ApiField("risk_index")
	private String riskIndex;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getDom() {
		return this.dom;
	}
	public void setDom(String dom) {
		this.dom = dom;
	}

	public String getEntStatus() {
		return this.entStatus;
	}
	public void setEntStatus(String entStatus) {
		this.entStatus = entStatus;
	}

	public String getEntType() {
		return this.entType;
	}
	public void setEntType(String entType) {
		this.entType = entType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInBlackList() {
		return this.inBlackList;
	}
	public void setInBlackList(String inBlackList) {
		this.inBlackList = inBlackList;
	}

	public String getRegCap() {
		return this.regCap;
	}
	public void setRegCap(String regCap) {
		this.regCap = regCap;
	}

	public String getRegCapCur() {
		return this.regCapCur;
	}
	public void setRegCapCur(String regCapCur) {
		this.regCapCur = regCapCur;
	}

	public String getRegOrg() {
		return this.regOrg;
	}
	public void setRegOrg(String regOrg) {
		this.regOrg = regOrg;
	}

	public String getRelationLevel() {
		return this.relationLevel;
	}
	public void setRelationLevel(String relationLevel) {
		this.relationLevel = relationLevel;
	}

	public String getRiskIndex() {
		return this.riskIndex;
	}
	public void setRiskIndex(String riskIndex) {
		this.riskIndex = riskIndex;
	}

}
