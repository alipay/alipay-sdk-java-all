package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 计财对外账单受理数据同步
 *
 * @author auto create
 * @since 1.0, 2023-11-24 09:58:57
 */
public class AnttechOceanbaseBillAcceptanceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5857248927146976895L;

	/**
	 * 计财账单受理请求入参，支持批量list写入，strategyIdentity需要和OB计财系统约定，idempotentKey作为幂等键，保证不会重复，重复幂等会被拒绝，额外的扩展信息properties通过json的方式传入
	 */
	@ApiListField("obf_bill_acceptance_request")
	@ApiField("obf_bill_acceptance_request")
	private List<ObfBillAcceptanceRequest> obfBillAcceptanceRequest;

	public List<ObfBillAcceptanceRequest> getObfBillAcceptanceRequest() {
		return this.obfBillAcceptanceRequest;
	}
	public void setObfBillAcceptanceRequest(List<ObfBillAcceptanceRequest> obfBillAcceptanceRequest) {
		this.obfBillAcceptanceRequest = obfBillAcceptanceRequest;
	}

}
