package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问题现象分类查询接口
 *
 * @author auto create
 * @since 1.0, 2020-04-09 20:55:30
 */
public class AlipayCommerceFixTaskproblemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2744318832779652851L;

	/**
	 * 非必须，仅用在部分行业，请与业务对接同学沟通后确定是否使用。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 非必须，只在iot场景下使用。机型的itemId。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 问题类型的一级分类。
如何获取:与业务对接同学确认
	 */
	@ApiField("problem_level_1")
	private String problemLevel1;

	/**
	 * 问题类型的二级分类。
如何获取:根据一级分类的查询结果。
	 */
	@ApiField("problem_level_2")
	private String problemLevel2;

	/**
	 * 生态协同单的业务类型。
枚举值:IoTMTN:IoT维保场景;jfMTN:生活缴费;C2B:C2B;riskControl:行业风险任务。
	 */
	@ApiField("rule_scene")
	private String ruleScene;

	/**
	 * 用来标识接口返回的是提报端，还是处理端使用的问题分类列表。
枚举值:SUBMIT:维保提报端;DEAL:维保处理端
	 */
	@ApiField("scope")
	private String scope;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getProblemLevel1() {
		return this.problemLevel1;
	}
	public void setProblemLevel1(String problemLevel1) {
		this.problemLevel1 = problemLevel1;
	}

	public String getProblemLevel2() {
		return this.problemLevel2;
	}
	public void setProblemLevel2(String problemLevel2) {
		this.problemLevel2 = problemLevel2;
	}

	public String getRuleScene() {
		return this.ruleScene;
	}
	public void setRuleScene(String ruleScene) {
		this.ruleScene = ruleScene;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

}
