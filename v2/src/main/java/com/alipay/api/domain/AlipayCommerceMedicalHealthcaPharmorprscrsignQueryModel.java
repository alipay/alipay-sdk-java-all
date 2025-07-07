package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询签约结果
 *
 * @author auto create
 * @since 1.0, 2025-05-06 16:10:41
 */
public class AlipayCommerceMedicalHealthcaPharmorprscrsignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6612768881456419263L;

	/**
	 * 历史请求唯一标识（取原先调用接口的requestId：1、创建二维码；2、处方PDF加签）
	 */
	@ApiField("history_request_id")
	private String historyRequestId;

	/**
	 * 签署合同ID
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	/**
	 * 查询类型
	 */
	@ApiField("type")
	private String type;

	public String getHistoryRequestId() {
		return this.historyRequestId;
	}
	public void setHistoryRequestId(String historyRequestId) {
		this.historyRequestId = historyRequestId;
	}

	public String getSignFlowId() {
		return this.signFlowId;
	}
	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
