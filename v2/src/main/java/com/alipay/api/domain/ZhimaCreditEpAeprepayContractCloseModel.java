package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信AE提前收款服务合约关闭
 *
 * @author auto create
 * @since 1.0, 2023-08-03 17:59:09
 */
public class ZhimaCreditEpAeprepayContractCloseModel extends AlipayObject {

	private static final long serialVersionUID = 5444912499557114967L;

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
