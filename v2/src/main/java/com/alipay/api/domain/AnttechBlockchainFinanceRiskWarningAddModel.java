package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风控预警信息提交
 *
 * @author auto create
 * @since 1.0, 2022-07-27 16:37:19
 */
public class AnttechBlockchainFinanceRiskWarningAddModel extends AlipayObject {

	private static final long serialVersionUID = 1714496755125394912L;

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
