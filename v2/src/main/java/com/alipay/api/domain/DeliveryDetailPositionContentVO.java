package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户投放展位内容
 *
 * @author auto create
 * @since 1.0, 2024-06-11 17:51:32
 */
public class DeliveryDetailPositionContentVO extends AlipayObject {

	private static final long serialVersionUID = 5699478444532838517L;

	/**
	 * 疲劳度信息：展位&创意疲劳度、策略组疲劳度、内容疲劳度
	 */
	@ApiField("fatigue_model")
	private DeliveryFatigueInfo fatigueModel;

	/**
	 * 埋点信息
	 */
	@ApiField("scm_model")
	private String scmModel;

	/**
	 * 卡片数据
	 */
	@ApiField("view_model")
	private String viewModel;

	public DeliveryFatigueInfo getFatigueModel() {
		return this.fatigueModel;
	}
	public void setFatigueModel(DeliveryFatigueInfo fatigueModel) {
		this.fatigueModel = fatigueModel;
	}

	public String getScmModel() {
		return this.scmModel;
	}
	public void setScmModel(String scmModel) {
		this.scmModel = scmModel;
	}

	public String getViewModel() {
		return this.viewModel;
	}
	public void setViewModel(String viewModel) {
		this.viewModel = viewModel;
	}

}
