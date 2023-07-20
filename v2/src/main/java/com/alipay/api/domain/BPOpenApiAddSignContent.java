package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 加签内容
 *
 * @author auto create
 * @since 1.0, 2022-03-14 13:53:50
 */
public class BPOpenApiAddSignContent extends AlipayObject {

	private static final long serialVersionUID = 2752876934944538589L;

	/**
	 * 自定义的条件跳转。JSON格式
	 */
	@ApiListField("additional_lines")
	@ApiField("string")
	private List<String> additionalLines;

	/**
	 * 任务处理人的域账号列表
	 */
	@ApiField("assignee")
	private String assignee;

	/**
	 * 自定义操作
	 */
	@ApiField("deal_actions")
	private String dealActions;

	/**
	 * 任务处理链接。如果不填，则使用流程平台默认地址
	 */
	@ApiField("deal_url")
	private String dealUrl;

	/**
	 * 详情查看地址。如果不填写，则使用流程平台默认详情地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 处理节点展示名称
	 */
	@ApiField("display_name")
	private String displayName;

	public List<String> getAdditionalLines() {
		return this.additionalLines;
	}
	public void setAdditionalLines(List<String> additionalLines) {
		this.additionalLines = additionalLines;
	}

	public String getAssignee() {
		return this.assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getDealActions() {
		return this.dealActions;
	}
	public void setDealActions(String dealActions) {
		this.dealActions = dealActions;
	}

	public String getDealUrl() {
		return this.dealUrl;
	}
	public void setDealUrl(String dealUrl) {
		this.dealUrl = dealUrl;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
