package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成短信的投放短链
 *
 * @author auto create
 * @since 1.0, 2025-07-10 14:39:24
 */
public class AlipayCommerceMedicalSmsShorturlGetModel extends AlipayObject {

	private static final long serialVersionUID = 4758316773465296691L;

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
	 * 可联系技术获取分配值
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 扁鹊
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
