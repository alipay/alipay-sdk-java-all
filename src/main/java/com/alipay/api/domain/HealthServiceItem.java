package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁健康服务平台的商品模型
 *
 * @author auto create
 * @since 1.0, 2021-03-16 14:22:32
 */
public class HealthServiceItem extends AlipayObject {

	private static final long serialVersionUID = 4757218129296471845L;

	/**
	 * 商品编号
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商家的商品条形码
	 */
	@ApiField("merchant_item_bar_code")
	private String merchantItemBarCode;

	/**
	 * 商家的商品编码
	 */
	@ApiField("merchant_item_code")
	private String merchantItemCode;

	/**
	 * 售价
单位：分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品的sku列表（已废弃，使用skus字段）
	 */
	@ApiField("sku_list")
	private HealthServiceSku skuList;

	/**
	 * sku列表
	 */
	@ApiListField("skus")
	@ApiField("health_service_sku")
	private List<HealthServiceSku> skus;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMerchantItemBarCode() {
		return this.merchantItemBarCode;
	}
	public void setMerchantItemBarCode(String merchantItemBarCode) {
		this.merchantItemBarCode = merchantItemBarCode;
	}

	public String getMerchantItemCode() {
		return this.merchantItemCode;
	}
	public void setMerchantItemCode(String merchantItemCode) {
		this.merchantItemCode = merchantItemCode;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public HealthServiceSku getSkuList() {
		return this.skuList;
	}
	public void setSkuList(HealthServiceSku skuList) {
		this.skuList = skuList;
	}

	public List<HealthServiceSku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<HealthServiceSku> skus) {
		this.skus = skus;
	}

}
