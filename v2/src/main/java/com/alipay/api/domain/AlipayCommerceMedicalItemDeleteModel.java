package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除商品
 *
 * @author auto create
 * @since 1.0, 2026-07-13 15:32:30
 */
public class AlipayCommerceMedicalItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1382785825321945913L;

	/**
	 * OMS厂商商品编码, 厂商自行维护
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * OMS厂商门店编码, 厂商自行维护
	 */
	@ApiField("store_code")
	private String storeCode;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
