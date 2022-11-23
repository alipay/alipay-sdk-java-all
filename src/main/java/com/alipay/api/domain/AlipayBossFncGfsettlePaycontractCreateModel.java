package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁财务统一结算应付付款条款创建
 *
 * @author auto create
 * @since 1.0, 2022-10-28 11:36:13
 */
public class AlipayBossFncGfsettlePaycontractCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3186769159282711419L;

	/**
	 * 付款条款
	 */
	@ApiField("paycontract")
	private PayContractDTO paycontract;

	public PayContractDTO getPaycontract() {
		return this.paycontract;
	}
	public void setPaycontract(PayContractDTO paycontract) {
		this.paycontract = paycontract;
	}

}
