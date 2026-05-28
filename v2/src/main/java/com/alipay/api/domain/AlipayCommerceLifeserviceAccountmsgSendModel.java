package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 子户开户消息发送
 *
 * @author auto create
 * @since 1.0, 2026-05-28 14:37:58
 */
public class AlipayCommerceLifeserviceAccountmsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 1196271615951725166L;

	/**
	 * null
	 */
	@ApiListField("settle_account_id_list")
	@ApiField("string")
	private List<String> settleAccountIdList;

	public List<String> getSettleAccountIdList() {
		return this.settleAccountIdList;
	}
	public void setSettleAccountIdList(List<String> settleAccountIdList) {
		this.settleAccountIdList = settleAccountIdList;
	}

}
