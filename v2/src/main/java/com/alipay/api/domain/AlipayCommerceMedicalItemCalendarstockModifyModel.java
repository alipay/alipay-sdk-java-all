package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量修改商品日历库存
 *
 * @author auto create
 * @since 1.0, 2026-04-13 19:47:45
 */
public class AlipayCommerceMedicalItemCalendarstockModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3119755941572833148L;

	/**
	 * null
	 */
	@ApiListField("sku_stock_list")
	@ApiField("sku_stock_info")
	private List<SkuStockInfo> skuStockList;

	/**
	 * OMS厂商门店编码, 录入门店时填写的值, 厂商自行维护
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<SkuStockInfo> getSkuStockList() {
		return this.skuStockList;
	}
	public void setSkuStockList(List<SkuStockInfo> skuStockList) {
		this.skuStockList = skuStockList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
