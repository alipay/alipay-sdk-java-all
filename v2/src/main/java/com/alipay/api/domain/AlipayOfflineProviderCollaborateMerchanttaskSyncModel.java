package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户同步信息openAPI
 *
 * @author auto create
 * @since 1.0, 2026-03-26 16:27:14
 */
public class AlipayOfflineProviderCollaborateMerchanttaskSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2549256357333339276L;

	/**
	 * leads变更原因
	 */
	@ApiField("leads_change_reason")
	private String leadsChangeReason;

	/**
	 * 商家leads状态变更时间
	 */
	@ApiField("leads_status_change_date")
	private String leadsStatusChangeDate;

	/**
	 * 商家leads状态
	 */
	@ApiField("merchant_leads_status")
	private String merchantLeadsStatus;

	/**
	 * 外部商户ID
	 */
	@ApiField("out_merchant_id")
	private String outMerchantId;

	/**
	 * 任务单号leads_id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getLeadsChangeReason() {
		return this.leadsChangeReason;
	}
	public void setLeadsChangeReason(String leadsChangeReason) {
		this.leadsChangeReason = leadsChangeReason;
	}

	public String getLeadsStatusChangeDate() {
		return this.leadsStatusChangeDate;
	}
	public void setLeadsStatusChangeDate(String leadsStatusChangeDate) {
		this.leadsStatusChangeDate = leadsStatusChangeDate;
	}

	public String getMerchantLeadsStatus() {
		return this.merchantLeadsStatus;
	}
	public void setMerchantLeadsStatus(String merchantLeadsStatus) {
		this.merchantLeadsStatus = merchantLeadsStatus;
	}

	public String getOutMerchantId() {
		return this.outMerchantId;
	}
	public void setOutMerchantId(String outMerchantId) {
		this.outMerchantId = outMerchantId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
