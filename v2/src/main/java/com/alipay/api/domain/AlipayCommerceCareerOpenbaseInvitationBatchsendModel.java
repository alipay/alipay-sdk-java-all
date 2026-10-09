package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 定向邀约-批量发送
 *
 * @author auto create
 * @since 1.0, 2026-10-08 09:47:54
 */
public class AlipayCommerceCareerOpenbaseInvitationBatchsendModel extends AlipayObject {

	private static final long serialVersionUID = 5299767537434275513L;

	/**
	 * null
	 */
	@ApiListField("batch_details")
	@ApiField("career_open_base_invitation_detail")
	private List<CareerOpenBaseInvitationDetail> batchDetails;

	/**
	 * 外部批次号，需要保证全局唯一，相同 out_batch_no 重复提交批次会被拒绝。
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	public List<CareerOpenBaseInvitationDetail> getBatchDetails() {
		return this.batchDetails;
	}
	public void setBatchDetails(List<CareerOpenBaseInvitationDetail> batchDetails) {
		this.batchDetails = batchDetails;
	}

	public String getOutBatchNo() {
		return this.outBatchNo;
	}
	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}

}
