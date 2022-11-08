package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺增加收单账号
 *
 * @author auto create
 * @since 1.0, 2022-08-26 14:15:15
 */
public class AntMerchantExpandShopReceiptaccountSaveModel extends AlipayObject {

	private static final long serialVersionUID = 5486833955163595789L;

	/**
	 * 是否承诺收单账号信息准确。具体承诺信息可查看 <a href="https://gw.alipayobjects.com/os/bmw-prod/922bafa8-a712-4f79-aa32-6f08d7359a5c.docx">门店信息承诺函</a>。
Y 是
N 否
	 */
	@ApiField("promise")
	private String promise;

	/**
	 * 收单账号
	 */
	@ApiField("receipt_account_id")
	private String receiptAccountId;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getPromise() {
		return this.promise;
	}
	public void setPromise(String promise) {
		this.promise = promise;
	}

	public String getReceiptAccountId() {
		return this.receiptAccountId;
	}
	public void setReceiptAccountId(String receiptAccountId) {
		this.receiptAccountId = receiptAccountId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
