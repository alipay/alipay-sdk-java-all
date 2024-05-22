package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审核驳回原因
 *
 * @author auto create
 * @since 1.0, 2023-11-29 11:18:38
 */
public class AppxSpuRejectReasonVO extends AlipayObject {

	private static final long serialVersionUID = 6281215871695762194L;

	/**
	 * 备注原因
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 风险项名称
	 */
	@ApiField("risk_name")
	private String riskName;

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRiskName() {
		return this.riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

}
