package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业码门店账号信息查询
 *
 * @author auto create
 * @since 1.0, 2025-12-26 13:58:27
 */
public class AlipayCommerceEcShopAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2759742497715835318L;

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
