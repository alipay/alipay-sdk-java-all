package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风控预警信息提交
 *
 * @author auto create
 * @since 1.0, 2024-05-16 17:16:01
 */
public class AnttechBlockchainFinanceRiskWarningAddModel extends AlipayObject {

	private static final long serialVersionUID = 7238499825732225364L;

	/**
	 * 外部风控编号
	 */
	@ApiField("out_risk_id")
	private String outRiskId;

	/**
	 * 风控详情
	 */
	@ApiField("risk_info")
	private String riskInfo;

	public String getOutRiskId() {
		return this.outRiskId;
	}
	public void setOutRiskId(String outRiskId) {
		this.outRiskId = outRiskId;
	}

	public String getRiskInfo() {
		return this.riskInfo;
	}
	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}

}
