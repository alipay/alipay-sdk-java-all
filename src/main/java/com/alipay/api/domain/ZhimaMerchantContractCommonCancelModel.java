package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约取消接口
 *
 * @author auto create
 * @since 1.0, 2020-08-20 10:16:10
 */
public class ZhimaMerchantContractCommonCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2139599368138747364L;

	/**
	 * 合约单号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 应约者id(淘宝id/支付宝user_id)
	 */
	@ApiField("sign_principal_id")
	private String signPrincipalId;

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getSignPrincipalId() {
		return this.signPrincipalId;
	}
	public void setSignPrincipalId(String signPrincipalId) {
		this.signPrincipalId = signPrincipalId;
	}

}
