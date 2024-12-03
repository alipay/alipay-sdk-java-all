package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分账单返回
 *
 * @author auto create
 * @since 1.0, 2023-10-09 10:08:22
 */
public class SettleOrderResponse extends AlipayObject {

	private static final long serialVersionUID = 7584332375881369316L;

	/**
	 * 扣款单ID
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 分账明细
	 */
	@ApiListField("settle_detail_response_list")
	@ApiField("settle_detail_response")
	private List<SettleDetailResponse> settleDetailResponseList;

	/**
	 * 分账失败原因
	 */
	@ApiField("settle_fail_reason")
	private String settleFailReason;

	/**
	 * 分账失败次数
	 */
	@ApiField("settle_fail_times")
	private Long settleFailTimes;

	/**
	 * 分账单ID
	 */
	@ApiField("settle_order_id")
	private String settleOrderId;

	/**
	 * 分账状态
	 */
	@ApiField("settle_status")
	private String settleStatus;

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}

	public List<SettleDetailResponse> getSettleDetailResponseList() {
		return this.settleDetailResponseList;
	}
	public void setSettleDetailResponseList(List<SettleDetailResponse> settleDetailResponseList) {
		this.settleDetailResponseList = settleDetailResponseList;
	}

	public String getSettleFailReason() {
		return this.settleFailReason;
	}
	public void setSettleFailReason(String settleFailReason) {
		this.settleFailReason = settleFailReason;
	}

	public Long getSettleFailTimes() {
		return this.settleFailTimes;
	}
	public void setSettleFailTimes(Long settleFailTimes) {
		this.settleFailTimes = settleFailTimes;
	}

	public String getSettleOrderId() {
		return this.settleOrderId;
	}
	public void setSettleOrderId(String settleOrderId) {
		this.settleOrderId = settleOrderId;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

}
