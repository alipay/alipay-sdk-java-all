package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量删除商品信息ById
 *
 * @author auto create
 * @since 1.0, 2025-05-20 16:54:36
 */
public class AlipayCommerceMedicalItemByidDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2723886667726872938L;

	/**
	 * 支付宝内部商品编码ID
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	/**
	 * OMS厂商门店编码, 厂商自行维护
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<String> getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
