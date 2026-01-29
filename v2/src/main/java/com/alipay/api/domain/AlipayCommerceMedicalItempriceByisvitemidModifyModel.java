package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量更新疫苗商品价格
 *
 * @author auto create
 * @since 1.0, 2025-09-26 14:24:47
 */
public class AlipayCommerceMedicalItempriceByisvitemidModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2432672611369676755L;

	/**
	 * OMS厂商门店编码, 厂商自行维护
	 */
	@ApiField("isv_store_code")
	private String isvStoreCode;

	/**
	 * 商品信息
	 */
	@ApiListField("item_price_list")
	@ApiField("item_price_update_by_isv_item_id_param")
	private List<ItemPriceUpdateByIsvItemIdParam> itemPriceList;

	public String getIsvStoreCode() {
		return this.isvStoreCode;
	}
	public void setIsvStoreCode(String isvStoreCode) {
		this.isvStoreCode = isvStoreCode;
	}

	public List<ItemPriceUpdateByIsvItemIdParam> getItemPriceList() {
		return this.itemPriceList;
	}
	public void setItemPriceList(List<ItemPriceUpdateByIsvItemIdParam> itemPriceList) {
		this.itemPriceList = itemPriceList;
	}

}
