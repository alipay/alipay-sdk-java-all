package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户订单核销码核销
 *
 * @author auto create
 * @since 1.0, 2019-01-31 16:19:01
 */
public class KoubeiMallScanpurchaseUserverifyVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7256449592546579288L;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 核销码
	 */
	@ApiField("verify_code")
	private String verifyCode;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
