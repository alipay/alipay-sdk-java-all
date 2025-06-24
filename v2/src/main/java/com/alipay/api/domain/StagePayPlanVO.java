package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阶段付款计划模型
 *
 * @author auto create
 * @since 1.0, 2024-09-14 19:54:17
 */
public class StagePayPlanVO extends AlipayObject {

	private static final long serialVersionUID = 3358246363963215542L;

	/**
	 * 阶段付款计划阶段编号，标识当前计划处于第几阶段
	 */
	@ApiField("stage_no")
	private Long stageNo;

	/**
	 * 阶段付款计划详情列表
	 */
	@ApiListField("stage_pay_plan_infos")
	@ApiField("stage_pay_plan_info_v_o")
	private List<StagePayPlanInfoVO> stagePayPlanInfos;

	public Long getStageNo() {
		return this.stageNo;
	}
	public void setStageNo(Long stageNo) {
		this.stageNo = stageNo;
	}

	public List<StagePayPlanInfoVO> getStagePayPlanInfos() {
		return this.stagePayPlanInfos;
	}
	public void setStagePayPlanInfos(List<StagePayPlanInfoVO> stagePayPlanInfos) {
		this.stagePayPlanInfos = stagePayPlanInfos;
	}

}
