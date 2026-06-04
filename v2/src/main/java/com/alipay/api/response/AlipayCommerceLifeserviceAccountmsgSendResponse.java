package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.accountmsg.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 14:42:50
 */
public class AlipayCommerceLifeserviceAccountmsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2313699163921868633L;

	/** 
	 * null
	 */
	@ApiListField("settle_account_id_list")
	@ApiField("string")
	private List<String> settleAccountIdList;

	public void setSettleAccountIdList(List<String> settleAccountIdList) {
		this.settleAccountIdList = settleAccountIdList;
	}
	public List<String> getSettleAccountIdList( ) {
		return this.settleAccountIdList;
	}

}
