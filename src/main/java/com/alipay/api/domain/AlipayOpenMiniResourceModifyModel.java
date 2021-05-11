package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序运营修改流量位
 *
 * @author auto create
 * @since 1.0, 2021-04-15 21:30:23
 */
public class AlipayOpenMiniResourceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3561143463486653268L;

	/**
	 * 流量位的名称，用于标识区分不用的流量位，最长32个字符，一个中文算两个字符。不传则不更新。同一个小程序下的流量位名称不能重复。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 流量位创建接口返回的流量位id，注意不是流量位来源的id。
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 需要修改的规则列表，不传不则不修改
	 */
	@ApiListField("rule_list")
	@ApiField("mini_resource_rule")
	private List<MiniResourceRule> ruleList;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public List<MiniResourceRule> getRuleList() {
		return this.ruleList;
	}
	public void setRuleList(List<MiniResourceRule> ruleList) {
		this.ruleList = ruleList;
	}

}
