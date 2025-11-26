package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-20 19:12:42
 */
public class MerchantSpuQueryResult extends AlipayObject {

	private static final long serialVersionUID = 6395613168133323745L;

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
	 * null
	 */
	@ApiListField("skus")
	@ApiField("rent_sku_info")
	private List<RentSkuInfo> skus;

	/**
	 * 上传结果状态。返回SPU_NOT_EXSIT和 CSPU_NOT_EXSIT不存在时
	 */
	@ApiField("status")
	private String status;

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
