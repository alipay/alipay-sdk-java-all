package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约识别结果
 *
 * @author auto create
 * @since 1.0, 2019-12-20 17:58:55
 */
public class ContractConsultResultVO extends AlipayObject {

	private static final long serialVersionUID = 7247454245473485684L;

	/**
	 * 合同号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 是否需要审批
	 */
	@ApiField("need_approval")
	private Boolean needApproval;

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Boolean getNeedApproval() {
		return this.needApproval;
	}
	public void setNeedApproval(Boolean needApproval) {
		this.needApproval = needApproval;
	}

}
