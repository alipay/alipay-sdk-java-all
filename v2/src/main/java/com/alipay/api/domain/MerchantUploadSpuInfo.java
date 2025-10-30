package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁行业商品库商户上传SPU信息结构体
 *
 * @author auto create
 * @since 1.0, 2025-10-22 10:59:42
 */
public class MerchantUploadSpuInfo extends AlipayObject {

	private static final long serialVersionUID = 3567872128389148613L;

	/**
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商家侧商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商家侧商品名
	 */
	@ApiField("out_item_name")
	private String outItemName;

	/**
	 * sku数组,out_sku_id和销售规格kv对
	 */
	@ApiListField("skus")
	@ApiField("rent_sku_info")
	private List<RentSkuInfo> skus;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutItemName() {
		return this.outItemName;
	}
	public void setOutItemName(String outItemName) {
		this.outItemName = outItemName;
	}

	public List<RentSkuInfo> getSkus() {
		return this.skus;
	}
	public void setSkus(List<RentSkuInfo> skus) {
		this.skus = skus;
	}

}
