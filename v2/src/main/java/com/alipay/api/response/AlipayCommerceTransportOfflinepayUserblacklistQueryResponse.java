package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.userblacklist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-09 16:06:10
 */
public class AlipayCommerceTransportOfflinepayUserblacklistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2627844386725883974L;

	/** 
	 * 黑名单用户ID
	 */
	@ApiListField("black_list")
	@ApiField("string")
	private List<String> blackList;

	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}
	public List<String> getBlackList( ) {
		return this.blackList;
	}

}
