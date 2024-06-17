package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阶段付款计划模型
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:59:50
 */
public class StagePayPlanVO extends AlipayObject {

	private static final long serialVersionUID = 5752494896193534675L;

	/**
	 * 阶段付款计划阶段编号，标识当前计划处于第几阶段
	 */
	@ApiField("stage_no")
	private Long stageNo;

	/**
	 * 阶段付款计划详情列表
	 */
	@ApiField("stage_pay_plan_infos")
	private StagePayPlanInfoVO stagePayPlanInfos;

	public Long getStageNo() {
		return this.stageNo;
	}
	public void setStageNo(Long stageNo) {
		this.stageNo = stageNo;
	}

	public StagePayPlanInfoVO getStagePayPlanInfos() {
		return this.stagePayPlanInfos;
	}
	public void setStagePayPlanInfos(StagePayPlanInfoVO stagePayPlanInfos) {
		this.stagePayPlanInfos = stagePayPlanInfos;
	}

}
