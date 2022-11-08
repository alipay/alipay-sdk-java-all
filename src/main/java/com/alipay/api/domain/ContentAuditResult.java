package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 解语花风险内容结果
 *
 * @author auto create
 * @since 1.0, 2022-08-26 11:07:32
 */
public class ContentAuditResult extends AlipayObject {

	private static final long serialVersionUID = 5321672576927327381L;

	/**
	 * 全量素材风险信息列表
	 */
	@ApiListField("content_risk_info_list")
	@ApiField("content_risk_info")
	private List<ContentRiskInfo> contentRiskInfoList;

	/**
	 * 工单维度机审结果，枚举值。
当返回结果为空或空串时，代表机审中，尚未机审结束。
当审核失败时为ROBOT_FAIL；当工单审核成功并且命中驳回规则时为ROBOT_REVIEW_REJECT；当工单审核成功但没有命中驳回规则时为ROBOT_PASS；当状态为审核通过时，风险列表中仍然可能存在风险信息。
ROBOT_PASS：机审通过
ROBOT_REVIEW_REJECT：机审驳回
ROBOT_FAIL：机审失败
	 */
	@ApiField("robot_status")
	private String robotStatus;

	/**
	 * 审核的规则数
	 */
	@ApiField("rule_counts")
	private Long ruleCounts;

	public List<ContentRiskInfo> getContentRiskInfoList() {
		return this.contentRiskInfoList;
	}
	public void setContentRiskInfoList(List<ContentRiskInfo> contentRiskInfoList) {
		this.contentRiskInfoList = contentRiskInfoList;
	}

	public String getRobotStatus() {
		return this.robotStatus;
	}
	public void setRobotStatus(String robotStatus) {
		this.robotStatus = robotStatus;
	}

	public Long getRuleCounts() {
		return this.ruleCounts;
	}
	public void setRuleCounts(Long ruleCounts) {
		this.ruleCounts = ruleCounts;
	}

}
