package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款前向商户确认退款的活动信息
 *
 * @author auto create
 * @since 1.0, 2023-03-01 11:13:33
 */
public class RefundConfirmCommitActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 8475942529448889661L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 退款前向商户确认退款结果列表
	 */
	@ApiListField("refund_confirm_commit_result_list")
	@ApiField("refund_confirm_commit_result")
	private List<RefundConfirmCommitResult> refundConfirmCommitResultList;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List<RefundConfirmCommitResult> getRefundConfirmCommitResultList() {
		return this.refundConfirmCommitResultList;
	}
	public void setRefundConfirmCommitResultList(List<RefundConfirmCommitResult> refundConfirmCommitResultList) {
		this.refundConfirmCommitResultList = refundConfirmCommitResultList;
	}

}
