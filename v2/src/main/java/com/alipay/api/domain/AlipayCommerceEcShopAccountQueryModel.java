package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业码门店账号信息查询
 *
 * @author auto create
 * @since 1.0, 2025-11-07 11:57:40
 */
public class AlipayCommerceEcShopAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8487391545948957636L;

	/**
	 * null
	 */
	@ApiListField("trade_no_list")
	@ApiField("string")
	private List<String> tradeNoList;

	public List<String> getTradeNoList() {
		return this.tradeNoList;
	}
	public void setTradeNoList(List<String> tradeNoList) {
		this.tradeNoList = tradeNoList;
	}

}
