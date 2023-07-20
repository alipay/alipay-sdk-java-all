package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 隐私合规检测结果
 *
 * @author auto create
 * @since 1.0, 2023-06-29 15:54:14
 */
public class ApmobileAppPermissionReportSummaryDTO extends AlipayObject {

	private static final long serialVersionUID = 8274246594898656656L;

	/**
	 * 检测评估数量
	 */
	@ApiField("detect_item_evaluate_num")
	private Long detectItemEvaluateNum;

	/**
	 * 检测未通过数量
	 */
	@ApiField("detect_item_fail_num")
	private Long detectItemFailNum;

	/**
	 * 检测通过数量
	 */
	@ApiField("detect_item_pass_num")
	private Long detectItemPassNum;

	/**
	 * 端权限检测报告检测项结果实体
	 */
	@ApiListField("detect_item_problem_dtos")
	@ApiField("apmobile_detect_item_problem_d_t_o")
	private List<ApmobileDetectItemProblemDTO> detectItemProblemDtos;

	/**
	 * 检测项数量
	 */
	@ApiField("detect_item_sum")
	private Long detectItemSum;

	/**
	 * 检测项大类问题总数
	 */
	@ApiField("detect_item_type_problem_sum")
	private Long detectItemTypeProblemSum;

	/**
	 * 检测项大类总数
	 */
	@ApiField("detect_item_type_sum")
	private Long detectItemTypeSum;

	/**
	 * task_id
	 */
	@ApiField("task_id")
	private String taskId;

	public Long getDetectItemEvaluateNum() {
		return this.detectItemEvaluateNum;
	}
	public void setDetectItemEvaluateNum(Long detectItemEvaluateNum) {
		this.detectItemEvaluateNum = detectItemEvaluateNum;
	}

	public Long getDetectItemFailNum() {
		return this.detectItemFailNum;
	}
	public void setDetectItemFailNum(Long detectItemFailNum) {
		this.detectItemFailNum = detectItemFailNum;
	}

	public Long getDetectItemPassNum() {
		return this.detectItemPassNum;
	}
	public void setDetectItemPassNum(Long detectItemPassNum) {
		this.detectItemPassNum = detectItemPassNum;
	}

	public List<ApmobileDetectItemProblemDTO> getDetectItemProblemDtos() {
		return this.detectItemProblemDtos;
	}
	public void setDetectItemProblemDtos(List<ApmobileDetectItemProblemDTO> detectItemProblemDtos) {
		this.detectItemProblemDtos = detectItemProblemDtos;
	}

	public Long getDetectItemSum() {
		return this.detectItemSum;
	}
	public void setDetectItemSum(Long detectItemSum) {
		this.detectItemSum = detectItemSum;
	}

	public Long getDetectItemTypeProblemSum() {
		return this.detectItemTypeProblemSum;
	}
	public void setDetectItemTypeProblemSum(Long detectItemTypeProblemSum) {
		this.detectItemTypeProblemSum = detectItemTypeProblemSum;
	}

	public Long getDetectItemTypeSum() {
		return this.detectItemTypeSum;
	}
	public void setDetectItemTypeSum(Long detectItemTypeSum) {
		this.detectItemTypeSum = detectItemTypeSum;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
