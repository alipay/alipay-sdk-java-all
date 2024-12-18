package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Money;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:55:43
 */
public class AlipayOverseasTransferBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7851287387942789993L;

	/** 
	 * 账户余额列表
	 */
	@ApiListField("balances")
	@ApiField("money")
	private List<Money> balances;

	/** 
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	public void setBalances(List<Money> balances) {
		this.balances = balances;
	}
	public List<Money> getBalances( ) {
		return this.balances;
	}

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

}
