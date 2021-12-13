package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款条款查询
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:27:17
 */
public class AlipayBossFncGfsettlePaycontractQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6347847416787855212L;

	/**
	 * 查询条件
	 */
	@ApiField("pay_contract_base_dto")
	private PayContractBaseDTO payContractBaseDto;

	public PayContractBaseDTO getPayContractBaseDto() {
		return this.payContractBaseDto;
	}
	public void setPayContractBaseDto(PayContractBaseDTO payContractBaseDto) {
		this.payContractBaseDto = payContractBaseDto;
	}

}
