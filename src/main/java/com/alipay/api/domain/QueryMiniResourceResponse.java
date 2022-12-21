package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询流量位结果
 *
 * @author auto create
 * @since 1.0, 2021-04-13 17:16:51
 */
public class QueryMiniResourceResponse extends AlipayObject {

	private static final long serialVersionUID = 2688671841779112528L;

	/**
	 * 端
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 流量位模式 CPS
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 流量位名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 流量位id
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 广告展示列数
	 */
	@ApiField("row_num")
	private String rowNum;

	/**
	 * 流量位规则列表
	 */
	@ApiListField("rule_list")
	@ApiField("mini_resource_rule")
	private List<MiniResourceRule> ruleList;

	/**
	 * 广告展示个数
	 */
	@ApiField("show_num")
	private String showNum;

	/**
	 * 流量位类型 INFORMATION: 信息流
	 */
	@ApiField("type")
	private String type;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

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

	public String getRowNum() {
		return this.rowNum;
	}
	public void setRowNum(String rowNum) {
		this.rowNum = rowNum;
	}

	public List<MiniResourceRule> getRuleList() {
		return this.ruleList;
	}
	public void setRuleList(List<MiniResourceRule> ruleList) {
		this.ruleList = ruleList;
	}

	public String getShowNum() {
		return this.showNum;
	}
	public void setShowNum(String showNum) {
		this.showNum = showNum;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
