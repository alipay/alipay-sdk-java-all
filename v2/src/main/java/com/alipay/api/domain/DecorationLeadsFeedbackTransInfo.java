package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户成交信息
 *
 * @author auto create
 * @since 1.0, 2025-11-14 15:56:03
 */
public class DecorationLeadsFeedbackTransInfo extends AlipayObject {

	private static final long serialVersionUID = 6396333672216857289L;

	/**
	 * 与客户签订的合同编号，便于后续追踪
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 实际成交的时间
	 */
	@ApiField("deal_time")
	private Date dealTime;

	/**
	 * 当前成交状态
	 */
	@ApiField("status")
	private String status;

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public Date getDealTime() {
		return this.dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
