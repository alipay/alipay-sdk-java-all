package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConfirmReceivableDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.settle.receivable.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:00
 */
public class AlipayBossFncSettleReceivableConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2178141344155987463L;

	/** 
	 * 应收确认结果列表
	 */
	@ApiListField("result_set")
	@ApiField("confirm_receivable_d_t_o")
	private List<ConfirmReceivableDTO> resultSet;

	public void setResultSet(List<ConfirmReceivableDTO> resultSet) {
		this.resultSet = resultSet;
	}
	public List<ConfirmReceivableDTO> getResultSet( ) {
		return this.resultSet;
	}

}
