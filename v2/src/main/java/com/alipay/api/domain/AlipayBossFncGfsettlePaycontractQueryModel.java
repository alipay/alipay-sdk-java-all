package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款条款查询
 *
 * @author auto create
 * @since 1.0, 2022-10-28 11:42:44
 */
public class AlipayBossFncGfsettlePaycontractQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1825645435656136991L;

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
