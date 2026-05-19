package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成短信的投放短链
 *
 * @author auto create
 * @since 1.0, 2026-04-27 10:36:22
 */
public class AlipayCommerceMedicalSmsShorturlGetModel extends AlipayObject {

	private static final long serialVersionUID = 8639144592972526996L;

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
	 * 门诊报告
	 */
	@ApiField("sub_scene")
	private String subScene;

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

	public String getSubScene() {
		return this.subScene;
	}
	public void setSubScene(String subScene) {
		this.subScene = subScene;
	}

}
