package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除商品
 *
 * @author auto create
 * @since 1.0, 2025-02-13 20:10:27
 */
public class AlipayCommerceMedicalItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8788862577713137669L;

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
