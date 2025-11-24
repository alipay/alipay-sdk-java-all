package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量创建商品
 *
 * @author auto create
 * @since 1.0, 2025-04-21 10:42:28
 */
public class AlipayCommerceMedicalItemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7772596848187647885L;

	/**
	 * 商品信息
	 */
	@ApiListField("item_list")
	@ApiField("item_create_info_param")
	private List<ItemCreateInfoParam> itemList;

	/**
	 * OMS厂商门店编码, 录入门店时填写的值, 厂商自行维护
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<ItemCreateInfoParam> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ItemCreateInfoParam> itemList) {
		this.itemList = itemList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
