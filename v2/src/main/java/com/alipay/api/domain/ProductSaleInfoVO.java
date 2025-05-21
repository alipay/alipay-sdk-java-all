package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品销售信息
 *
 * @author auto create
 * @since 1.0, 2024-07-10 11:15:50
 */
public class ProductSaleInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4187646266714859467L;

	/**
	 * 商品是否可售
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/**
	 * 地区码
	 */
	@ApiField("division_code")
	private String divisionCode;

	/**
	 * 模糊库存，合规要求不透出精确库存，使用模糊库存描述
	 */
	@ApiField("fuzzy_quantity")
	private String fuzzyQuantity;

	/**
	 * 商品 id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 商品管控状态
	 */
	@ApiField("product_status")
	private String productStatus;

	/**
	 * 商品库存, 合规要求不透出精确值
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 渠道店铺 id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * sku销售信息
	 */
	@ApiListField("skus")
	@ApiField("sku_sale_info_v_o")
	private List<SkuSaleInfoVO> skus;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public Boolean getCanSell() {
		return this.canSell;
	}
	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}

	public String getDivisionCode() {
		return this.divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getFuzzyQuantity() {
		return this.fuzzyQuantity;
	}
	public void setFuzzyQuantity(String fuzzyQuantity) {
		this.fuzzyQuantity = fuzzyQuantity;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductStatus() {
		return this.productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<SkuSaleInfoVO> getSkus() {
		return this.skus;
	}
	public void setSkus(List<SkuSaleInfoVO> skus) {
		this.skus = skus;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
