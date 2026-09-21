package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 判断门店内指定upc的商品是否存在
 *
 * @author auto create
 * @since 1.0, 2026-09-14 15:12:56
 */
public class AlipayCommerceMedicalItemUpcexistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7645365579657322565L;

	/**
	 * item状态过滤条件（0上架，1下架 ，2冻结），为null时不按该字段过滤
	 */
	@ApiField("item_status")
	private Long itemStatus;

	/**
	 * sku状态过滤条件（0上架，1售罄），为null时不按该字段过滤
	 */
	@ApiField("sku_status")
	private Long skuStatus;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * null
	 */
	@ApiListField("upc_list")
	@ApiField("string")
	private List<String> upcList;

	public Long getItemStatus() {
		return this.itemStatus;
	}
	public void setItemStatus(Long itemStatus) {
		this.itemStatus = itemStatus;
	}

	public Long getSkuStatus() {
		return this.skuStatus;
	}
	public void setSkuStatus(Long skuStatus) {
		this.skuStatus = skuStatus;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public List<String> getUpcList() {
		return this.upcList;
	}
	public void setUpcList(List<String> upcList) {
		this.upcList = upcList;
	}

}
