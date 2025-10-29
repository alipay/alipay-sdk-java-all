package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量修改商品信息ById
 *
 * @author auto create
 * @since 1.0, 2025-05-20 16:54:19
 */
public class AlipayCommerceMedicalItemByidModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7491819279267166314L;

	/**
	 * 商品信息
	 */
	@ApiListField("item_list")
	@ApiField("item_update_by_id_param")
	private List<ItemUpdateByIdParam> itemList;

	/**
	 * OMS厂商门店编码, 厂商自行维护
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<ItemUpdateByIdParam> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ItemUpdateByIdParam> itemList) {
		this.itemList = itemList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
