package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付咨询条款信息
 *
 * @author auto create
 * @since 1.0, 2022-10-18 20:16:30
 */
public class CreditPayClauseVO extends AlipayObject {

	private static final long serialVersionUID = 3344868764364356859L;

	/**
	 * 合同密钥
	 */
	@ApiField("contract_key")
	private String contractKey;

	/**
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 合同url
	 */
	@ApiField("contract_url")
	private String contractUrl;

	public String getContractKey() {
		return this.contractKey;
	}
	public void setContractKey(String contractKey) {
		this.contractKey = contractKey;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractUrl() {
		return this.contractUrl;
	}
	public void setContractUrl(String contractUrl) {
		this.contractUrl = contractUrl;
	}

}
