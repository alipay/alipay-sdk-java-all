package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻约定合约查询接口
 *
 * @author auto create
 * @since 1.0, 2021-05-17 10:39:38
 */
public class ZhimaMerchantContractCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4618351656236486318L;

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

	/**
	 * 应约者类型:ZHIMA_ROLE:芝麻用户 ALIPAY_ROLE:支付宝用户 TAOBAO_ROLE:淘宝用户
	 */
	@ApiField("sign_principal_type")
	private String signPrincipalType;

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

	public String getSignPrincipalType() {
		return this.signPrincipalType;
	}
	public void setSignPrincipalType(String signPrincipalType) {
		this.signPrincipalType = signPrincipalType;
	}

}
