package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款规则
 *
 * @author auto create
 * @since 1.0, 2024-01-25 10:32:23
 */
public class RefundRule extends AlipayObject {

	private static final long serialVersionUID = 2763161993866694597L;

	/**
	 * 时间戳，规则生效截止时间
yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 限时取消细节
CAN_REFUND时候有该结构
	 */
	@ApiListField("refund_rule_details")
	@ApiField("refund_rule_detail")
	private List<RefundRuleDetail> refundRuleDetails;

	/**
	 * 退款规则id
	 */
	@ApiField("refund_rule_id")
	private String refundRuleId;

	/**
	 * 取消类型
	 */
	@ApiField("refund_rule_type")
	private String refundRuleType;

	/**
	 * 时间戳，规则生效起始时间
yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<RefundRuleDetail> getRefundRuleDetails() {
		return this.refundRuleDetails;
	}
	public void setRefundRuleDetails(List<RefundRuleDetail> refundRuleDetails) {
		this.refundRuleDetails = refundRuleDetails;
	}

	public String getRefundRuleId() {
		return this.refundRuleId;
	}
	public void setRefundRuleId(String refundRuleId) {
		this.refundRuleId = refundRuleId;
	}

	public String getRefundRuleType() {
		return this.refundRuleType;
	}
	public void setRefundRuleType(String refundRuleType) {
		this.refundRuleType = refundRuleType;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
