package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阶段付款计划模型
 *
 * @author auto create
 * @since 1.0, 2025-08-26 10:26:21
 */
public class StagePayPlanDTO extends AlipayObject {

	private static final long serialVersionUID = 6764775275434883939L;

	/**
	 * 阶段付款计划阶段编号，标识当前计划处于第几阶段，起始值为1，多阶段需保证阶段编号递增
	 */
	@ApiField("stage_no")
	private Long stageNo;

	/**
	 * 阶段付款计划详情列表
	 */
	@ApiListField("stage_pay_plan_infos")
	@ApiField("stage_pay_plan_info_d_t_o")
	private List<StagePayPlanInfoDTO> stagePayPlanInfos;

	public Long getStageNo() {
		return this.stageNo;
	}
	public void setStageNo(Long stageNo) {
		this.stageNo = stageNo;
	}

	public List<StagePayPlanInfoDTO> getStagePayPlanInfos() {
		return this.stagePayPlanInfos;
	}
	public void setStagePayPlanInfos(List<StagePayPlanInfoDTO> stagePayPlanInfos) {
		this.stagePayPlanInfos = stagePayPlanInfos;
	}

}
