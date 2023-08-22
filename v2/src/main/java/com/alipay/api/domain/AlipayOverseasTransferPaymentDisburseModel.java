package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量汇款
 *
 * @author auto create
 * @since 1.0, 2021-08-09 15:05:44
 */
public class AlipayOverseasTransferPaymentDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 5216831579854677288L;

	/**
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 发端机构
	 */
	@ApiField("payer_agent_id")
	private String payerAgentId;

	/**
	 * 批量请求接口，目前仅支持单笔能力
	 */
	@ApiField("transactions")
	private String transactions;

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

	public String getPayerAgentId() {
		return this.payerAgentId;
	}
	public void setPayerAgentId(String payerAgentId) {
		this.payerAgentId = payerAgentId;
	}

	public String getTransactions() {
		return this.transactions;
	}
	public void setTransactions(String transactions) {
		this.transactions = transactions;
	}

}
