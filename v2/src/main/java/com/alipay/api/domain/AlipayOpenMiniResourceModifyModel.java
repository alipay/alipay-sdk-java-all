package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序运营修改流量位
 *
 * @author auto create
 * @since 1.0, 2021-05-24 15:38:21
 */
public class AlipayOpenMiniResourceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5384225145877265587L;

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
	 * 展示列数，可选值为：1、2
	 */
	@ApiField("row_num")
	private Long rowNum;

	/**
	 * 需要修改的规则列表，不传不则不修改
	 */
	@ApiListField("rule_list")
	@ApiField("mini_resource_rule")
	private List<MiniResourceRule> ruleList;

	/**
	 * 商品展示个数，可选值为：0-200的正整数
	 */
	@ApiField("show_num")
	private Long showNum;

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

	public Long getRowNum() {
		return this.rowNum;
	}
	public void setRowNum(Long rowNum) {
		this.rowNum = rowNum;
	}

	public List<MiniResourceRule> getRuleList() {
		return this.ruleList;
	}
	public void setRuleList(List<MiniResourceRule> ruleList) {
		this.ruleList = ruleList;
	}

	public Long getShowNum() {
		return this.showNum;
	}
	public void setShowNum(Long showNum) {
		this.showNum = showNum;
	}

}
