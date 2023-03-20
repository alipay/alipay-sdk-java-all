package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExClientRateVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.allclientrate.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:00:20
 */
public class AlipayAccountExrateAllclientrateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1878675822145467616L;

	/** 
	 * 汇率信息列表
	 */
	@ApiListField("client_rate_list")
	@ApiField("ex_client_rate_v_o")
	private List<ExClientRateVO> clientRateList;

	public void setClientRateList(List<ExClientRateVO> clientRateList) {
		this.clientRateList = clientRateList;
	}
	public List<ExClientRateVO> getClientRateList( ) {
		return this.clientRateList;
	}

}
