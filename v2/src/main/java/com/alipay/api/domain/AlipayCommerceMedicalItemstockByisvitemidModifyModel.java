package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量同步疫苗商品库存
 *
 * @author auto create
 * @since 1.0, 2025-09-25 13:40:51
 */
public class AlipayCommerceMedicalItemstockByisvitemidModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8578843743735324626L;

	/**
	 * 清空库存商品id集合
	 */
	@ApiListField("clear_isv_item_id_list")
	@ApiField("string")
	private List<String> clearIsvItemIdList;

	/**
	 * OMS厂商门店编码, 录入门店时填写的值, 厂商自行维护
	 */
	@ApiField("isv_store_code")
	private String isvStoreCode;

	/**
	 * 商品信息
	 */
	@ApiListField("item_stock_list")
	@ApiField("item_stock_update_by_isv_item_id_param")
	private List<ItemStockUpdateByIsvItemIdParam> itemStockList;

	public List<String> getClearIsvItemIdList() {
		return this.clearIsvItemIdList;
	}
	public void setClearIsvItemIdList(List<String> clearIsvItemIdList) {
		this.clearIsvItemIdList = clearIsvItemIdList;
	}

	public String getIsvStoreCode() {
		return this.isvStoreCode;
	}
	public void setIsvStoreCode(String isvStoreCode) {
		this.isvStoreCode = isvStoreCode;
	}

	public List<ItemStockUpdateByIsvItemIdParam> getItemStockList() {
		return this.itemStockList;
	}
	public void setItemStockList(List<ItemStockUpdateByIsvItemIdParam> itemStockList) {
		this.itemStockList = itemStockList;
	}

}
