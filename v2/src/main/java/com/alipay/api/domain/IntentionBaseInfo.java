package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 意图基础信息
 *
 * @author auto create
 * @since 1.0, 2025-05-22 17:53:35
 */
public class IntentionBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2563573246223392393L;

	/**
	 * 意图信息中的动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 意图信息中的行业
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 意图信息中的场景
	 */
	@ApiField("scene")
	private String scene;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
