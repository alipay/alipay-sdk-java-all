package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道信息
 *
 * @author auto create
 * @since 1.0, 2026-10-21 19:04:59
 */
public class LandingChannelInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5125121533928318578L;

	/**
	 * 订单已保存的场景标识，供约定业务识别具体业务场景；不擅自将其等同于交易渠道枚举。仅限特定合作场景使用，非约定接入方请勿误用。
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 订单已保存的来源场景上下文，用于约定业务获取店转归因所需信息；本次示例采用 Base64 编码，内容协议由业务约定。仅限特定合作场景使用，非约定接入方请勿误用。
	 */
	@ApiField("source_scenario_context")
	private String sourceScenarioContext;

	/**
	 * 订单已保存的来源场景类型，用于约定业务识别店员推广等成交场景。仅限特定合作场景使用，非约定接入方请勿误用。
	 */
	@ApiField("source_scenario_type")
	private String sourceScenarioType;

	/**
	 * 是否来自闪租频道，标记为联营，值为Y/N
	 */
	@ApiField("union_rent_tag")
	private String unionRentTag;

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSourceScenarioContext() {
		return this.sourceScenarioContext;
	}
	public void setSourceScenarioContext(String sourceScenarioContext) {
		this.sourceScenarioContext = sourceScenarioContext;
	}

	public String getSourceScenarioType() {
		return this.sourceScenarioType;
	}
	public void setSourceScenarioType(String sourceScenarioType) {
		this.sourceScenarioType = sourceScenarioType;
	}

	public String getUnionRentTag() {
		return this.unionRentTag;
	}
	public void setUnionRentTag(String unionRentTag) {
		this.unionRentTag = unionRentTag;
	}

}
