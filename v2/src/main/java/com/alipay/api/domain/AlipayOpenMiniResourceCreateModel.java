package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序运营创建流量位
 *
 * @author auto create
 * @since 1.0, 2021-04-25 16:51:56
 */
public class AlipayOpenMiniResourceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6577421961382815148L;

	/**
	 * 流量位的计费模式，目前可选择值为：CPS、CPC，根据自己的业务模式选择合适的计费模式。
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 流量位的名称，同一个小程序下最多创建50(含)个流量位，并且同一个小程序下的流量位名称不能重复。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 展示列数，可选值为：1、2
	 */
	@ApiField("row_num")
	private Long rowNum;

	/**
	 * 流量位规则列表，一个流量位最多关联5个规则
	 */
	@ApiListField("rule_list")
	@ApiField("mini_resource_rule")
	private List<MiniResourceRule> ruleList;

	/**
	 * 商品展示个数，可选值为：0-200的正整数
	 */
	@ApiField("show_num")
	private Long showNum;

	/**
	 * 流量位展示类型。
INFORMATION 信息流；
	 */
	@ApiField("type")
	private String type;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
