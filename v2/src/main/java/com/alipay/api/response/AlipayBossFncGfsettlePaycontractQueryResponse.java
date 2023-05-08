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
 * @since 1.0, 2023-05-05 06:27:02
 */
public class AlipayBossFncGfsettlePaycontractQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7833397545934846668L;

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
