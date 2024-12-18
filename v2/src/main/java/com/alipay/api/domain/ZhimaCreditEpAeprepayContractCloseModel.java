package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信AE提前收款服务合约关闭
 *
 * @author auto create
 * @since 1.0, 2023-08-16 19:14:17
 */
public class ZhimaCreditEpAeprepayContractCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2155379693472581888L;

	/**
	 * AE卖家ID
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
