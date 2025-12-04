package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcTradeIdentityAccountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.shop.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-17 17:12:42
 */
public class AlipayCommerceEcShopAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6432438838869585132L;

	/** 
	 * null
	 */
	@ApiListField("trade_identity_list")
	@ApiField("ec_trade_identity_account_info")
	private List<EcTradeIdentityAccountInfo> tradeIdentityList;

	public void setTradeIdentityList(List<EcTradeIdentityAccountInfo> tradeIdentityList) {
		this.tradeIdentityList = tradeIdentityList;
	}
	public List<EcTradeIdentityAccountInfo> getTradeIdentityList( ) {
		return this.tradeIdentityList;
	}

}
