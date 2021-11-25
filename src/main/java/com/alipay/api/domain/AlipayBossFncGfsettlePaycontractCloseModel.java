package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一结算付款条款失效
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:27:35
 */
public class AlipayBossFncGfsettlePaycontractCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3847233392247926151L;

	/**
	 * 付款条款基础信息
	 */
	@ApiField("paycontractbasedto")
	private PayContractBaseDTO paycontractbasedto;

	public PayContractBaseDTO getPaycontractbasedto() {
		return this.paycontractbasedto;
	}
	public void setPaycontractbasedto(PayContractBaseDTO paycontractbasedto) {
		this.paycontractbasedto = paycontractbasedto;
	}

}
