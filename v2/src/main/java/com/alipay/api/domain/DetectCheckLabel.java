package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险检测一级标签明细
 *
 * @author auto create
 * @since 1.0, 2022-11-22 14:50:48
 */
public class DetectCheckLabel extends AlipayObject {

	private static final long serialVersionUID = 2162778948433476675L;

	/**
	 * 分类信息： porn：色情，  terrorism：暴恐， politic：涉政， ad：广告， adlaw：广告法， contraband：违禁， abuse：谩骂， flood：灌水， negtive：涉价值观， other：其他
	 */
	@ApiField("label")
	private String label;

	/**
	 * 一级标签分值
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 子分类信息，可能包含多个
	 */
	@ApiListField("sub_check_labels")
	@ApiField("sub_check_label")
	private List<SubCheckLabel> subCheckLabels;

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

	public List<SubCheckLabel> getSubCheckLabels() {
		return this.subCheckLabels;
	}
	public void setSubCheckLabels(List<SubCheckLabel> subCheckLabels) {
		this.subCheckLabels = subCheckLabels;
	}

}
