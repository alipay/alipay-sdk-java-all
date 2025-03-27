package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多阶段租金计费规则
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:46
 */
public class DynamicRentBillingRuleMultiStageDTO extends AlipayObject {

	private static final long serialVersionUID = 7584443243899756589L;

	/**
	 * 计费上限(单位元),最多2位小数
	 */
	@ApiField("billing_cap")
	private String billingCap;

	/**
	 * 每阶段租金配置信息
	 */
	@ApiListField("stage_amount_config_list")
	@ApiField("multi_stage_amount_config_d_t_o")
	private List<MultiStageAmountConfigDTO> stageAmountConfigList;

	public String getBillingCap() {
		return this.billingCap;
	}
	public void setBillingCap(String billingCap) {
		this.billingCap = billingCap;
	}

	public List<MultiStageAmountConfigDTO> getStageAmountConfigList() {
		return this.stageAmountConfigList;
	}
	public void setStageAmountConfigList(List<MultiStageAmountConfigDTO> stageAmountConfigList) {
		this.stageAmountConfigList = stageAmountConfigList;
	}

}
