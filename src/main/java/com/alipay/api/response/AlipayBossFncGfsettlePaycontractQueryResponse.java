package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PayContractItemApplyDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettle.paycontract.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-28 14:27:17
 */
public class AlipayBossFncGfsettlePaycontractQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6117779848936399517L;

	/** 
	 * 付款条款
	 */
	@ApiListField("result_set")
	@ApiField("pay_contract_item_apply_d_t_o")
	private List<PayContractItemApplyDTO> resultSet;

	public void setResultSet(List<PayContractItemApplyDTO> resultSet) {
		this.resultSet = resultSet;
	}
	public List<PayContractItemApplyDTO> getResultSet( ) {
		return this.resultSet;
	}

}
