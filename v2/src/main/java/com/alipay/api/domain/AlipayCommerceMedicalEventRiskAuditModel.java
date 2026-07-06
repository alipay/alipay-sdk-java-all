package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗风控送审
 *
 * @author auto create
 * @since 1.0, 2026-04-24 11:27:45
 */
public class AlipayCommerceMedicalEventRiskAuditModel extends AlipayObject {

	private static final long serialVersionUID = 7757587431929338775L;

	/**
	 * 上游工单号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 业务方请求id，业务方要保证唯一，用于幂等性校验
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 分配给业务方的事件code 
	 */
	@ApiField("risk_event_code")
	private String riskEventCode;

	/**
	 * 请求参数
参照【蚂蚁文档
NextGuard总线接入文档
】params

	 */
	@ApiField("risk_params")
	private String riskParams;

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRiskEventCode() {
		return this.riskEventCode;
	}
	public void setRiskEventCode(String riskEventCode) {
		this.riskEventCode = riskEventCode;
	}

	public String getRiskParams() {
		return this.riskParams;
	}
	public void setRiskParams(String riskParams) {
		this.riskParams = riskParams;
	}

}
