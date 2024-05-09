package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险识别标签内容
 *
 * @author auto create
 * @since 1.0, 2023-10-25 19:42:32
 */
public class RiskCheckLabel extends AlipayObject {

	private static final long serialVersionUID = 1414539163166486124L;

	/**
	 * 子分类信息
	 */
	@ApiListField("check_sub_labels")
	@ApiField("check_sub_label")
	private List<CheckSubLabel> checkSubLabels;

	/**
	 * 分类信息： porn：色情， terrorism：暴恐， politic：涉政， ad：广告， adlaw：广告法， contraband：违禁， abuse：谩骂， flood：灌水， negtive：涉价值观， other：其他，最新一级标签列表请于蚂蚁内容安全客户经理沟通获取
	 */
	@ApiField("label")
	private String label;

	/**
	 * 一级标签分值
	 */
	@ApiField("rate")
	private String rate;

	public List<CheckSubLabel> getCheckSubLabels() {
		return this.checkSubLabels;
	}
	public void setCheckSubLabels(List<CheckSubLabel> checkSubLabels) {
		this.checkSubLabels = checkSubLabels;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

}
