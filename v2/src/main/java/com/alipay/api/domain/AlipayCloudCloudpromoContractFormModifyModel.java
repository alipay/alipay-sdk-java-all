package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C2C租房智能体合同更新
 *
 * @author auto create
 * @since 1.0, 2024-10-23 19:47:56
 */
public class AlipayCloudCloudpromoContractFormModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4322338291227411975L;

	/**
	 * 智能体主体id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 合同数据
	 */
	@ApiField("data")
	private RentContractViewVO data;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 三方小程序id
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public RentContractViewVO getData() {
		return this.data;
	}
	public void setData(RentContractViewVO data) {
		this.data = data;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
