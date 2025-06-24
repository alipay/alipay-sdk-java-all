package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量更新商品
 *
 * @author auto create
 * @since 1.0, 2025-04-21 11:43:04
 */
public class AlipayCommerceMedicalItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4184685545926983267L;

	/**
	 * 商品信息
	 */
	@ApiListField("item_list")
	@ApiField("item_update_info_param")
	private List<ItemUpdateInfoParam> itemList;

	/**
	 * OMS厂商门店编码, 厂商自行维护
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<ItemUpdateInfoParam> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ItemUpdateInfoParam> itemList) {
		this.itemList = itemList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
