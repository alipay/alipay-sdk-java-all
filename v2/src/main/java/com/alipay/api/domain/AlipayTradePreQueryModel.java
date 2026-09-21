package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易前置查询接口
 *
 * @author auto create
 * @since 1.0, 2026-09-21 10:27:45
 */
public class AlipayTradePreQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6442853778232183365L;

	/**
	 * 卖家登录id
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

}
