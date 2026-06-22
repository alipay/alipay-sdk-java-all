package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成短信的投放短链
 *
 * @author auto create
 * @since 1.0, 2026-05-26 17:50:03
 */
public class AlipayCommerceMedicalSmsShorturlGetModel extends AlipayObject {

	private static final long serialVersionUID = 1191399788579599943L;

	/**
	 * 如果身份类型是IDENTITY_CARD，这个必填
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 手机号
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 手机号
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 传入的手机号，如果有以这个手机号为主，如果用户没有绑定这个手机号还是取登陆时间最近的手机号
	 */
	@ApiField("input_phone")
	private String inputPhone;

	/**
	 * 真实姓名，如果身份类型是IDENTITY_CARD，这个必填
	 */
	@ApiField("name")
	private String name;

	/**
	 * 链接拼接参数，具体可以参考系分文档
	 */
	@ApiField("param_info")
	private String paramInfo;

	/**
	 * 可联系技术获取分配值
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 通用场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 渠道
	 */
	@ApiField("source")
	private String source;

	/**
	 * 门诊报告
	 */
	@ApiField("sub_scene")
	private String subScene;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getInputPhone() {
		return this.inputPhone;
	}
	public void setInputPhone(String inputPhone) {
		this.inputPhone = inputPhone;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParamInfo() {
		return this.paramInfo;
	}
	public void setParamInfo(String paramInfo) {
		this.paramInfo = paramInfo;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubScene() {
		return this.subScene;
	}
	public void setSubScene(String subScene) {
		this.subScene = subScene;
	}

}
