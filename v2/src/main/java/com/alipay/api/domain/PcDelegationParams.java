package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * AI付代买委托信息
 *
 * @author auto create
 * @since 1.0, 2026-06-24 20:07:56
 */
public class PcDelegationParams extends AlipayObject {

	private static final long serialVersionUID = 2339432343211983154L;

	/**
	 * 对AI付代买委托意图做描述
	 */
	@ApiField("delegation_desc")
	private String delegationDesc;

	/**
	 * 委托任务场景
	 */
	@ApiField("delegation_scene")
	private String delegationScene;

	/**
	 * 描述代买委托
	 */
	@ApiField("delegation_tag")
	private String delegationTag;

	/**
	 * 外部商户AI付代买委托id，用于委托申请成功后区分不同的委托任务
	 */
	@ApiField("external_delegation_id")
	private String externalDelegationId;

	/**
	 * null
	 */
	@ApiListField("external_tradeno_list")
	@ApiField("string")
	private List<String> externalTradenoList;

	/**
	 * AI付代买委托总限额，币种为人民币，单位为元
	 */
	@ApiField("max_total_amount")
	private String maxTotalAmount;

	/**
	 * 委托扣款次数限制
	 */
	@ApiField("times_limit")
	private String timesLimit;

	/**
	 * AI付代买委托结束时间，默认会处理成 2026-01-30 00:00:00
	 */
	@ApiField("validity_end_time")
	private String validityEndTime;

	/**
	 * AI付代买委托任务起始时间，默认会处理成  2026-01-30 00:00:00
	 */
	@ApiField("validity_start_time")
	private String validityStartTime;

	public String getDelegationDesc() {
		return this.delegationDesc;
	}
	public void setDelegationDesc(String delegationDesc) {
		this.delegationDesc = delegationDesc;
	}

	public String getDelegationScene() {
		return this.delegationScene;
	}
	public void setDelegationScene(String delegationScene) {
		this.delegationScene = delegationScene;
	}

	public String getDelegationTag() {
		return this.delegationTag;
	}
	public void setDelegationTag(String delegationTag) {
		this.delegationTag = delegationTag;
	}

	public String getExternalDelegationId() {
		return this.externalDelegationId;
	}
	public void setExternalDelegationId(String externalDelegationId) {
		this.externalDelegationId = externalDelegationId;
	}

	public List<String> getExternalTradenoList() {
		return this.externalTradenoList;
	}
	public void setExternalTradenoList(List<String> externalTradenoList) {
		this.externalTradenoList = externalTradenoList;
	}

	public String getMaxTotalAmount() {
		return this.maxTotalAmount;
	}
	public void setMaxTotalAmount(String maxTotalAmount) {
		this.maxTotalAmount = maxTotalAmount;
	}

	public String getTimesLimit() {
		return this.timesLimit;
	}
	public void setTimesLimit(String timesLimit) {
		this.timesLimit = timesLimit;
	}

	public String getValidityEndTime() {
		return this.validityEndTime;
	}
	public void setValidityEndTime(String validityEndTime) {
		this.validityEndTime = validityEndTime;
	}

	public String getValidityStartTime() {
		return this.validityStartTime;
	}
	public void setValidityStartTime(String validityStartTime) {
		this.validityStartTime = validityStartTime;
	}

}
