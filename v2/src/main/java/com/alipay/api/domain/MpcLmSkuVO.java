package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * openapi接口返回的sku
 *
 * @author auto create
 * @since 1.0, 2024-06-12 11:42:19
 */
public class MpcLmSkuVO extends AlipayObject {

	private static final long serialVersionUID = 7841499356277285821L;

	/**
	 * 69码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * sku售卖状态
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/**
	 * 地区码
	 */
	@ApiField("division_code")
	private String divisionCode;

	/**
	 * sku模糊库存
	 */
	@ApiField("fuzzy_quantity")
	private String fuzzyQuantity;

	/**
	 * 商品id
	 */
	@ApiField("mpc_item_id")
	private String mpcItemId;

	/**
	 * skuid
	 */
	@ApiField("mpc_sku_id")
	private String mpcSkuId;

	/**
	 * sku划线价
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * sku售价
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 渠道店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * sku主图链接
	 */
	@ApiField("sku_pic")
	private String skuPic;

	/**
	 * sku规格列表
	 */
	@ApiListField("sku_specs")
	@ApiField("sku_spec")
	private List<SkuSpec> skuSpecs;

	/**
	 * sku 管控状态
	 */
	@ApiField("sku_status")
	private String skuStatus;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

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

	public String getMpcItemId() {
		return this.mpcItemId;
	}
	public void setMpcItemId(String mpcItemId) {
		this.mpcItemId = mpcItemId;
	}

	public String getMpcSkuId() {
		return this.mpcSkuId;
	}
	public void setMpcSkuId(String mpcSkuId) {
		this.mpcSkuId = mpcSkuId;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSkuPic() {
		return this.skuPic;
	}
	public void setSkuPic(String skuPic) {
		this.skuPic = skuPic;
	}

	public List<SkuSpec> getSkuSpecs() {
		return this.skuSpecs;
	}
	public void setSkuSpecs(List<SkuSpec> skuSpecs) {
		this.skuSpecs = skuSpecs;
	}

	public String getSkuStatus() {
		return this.skuStatus;
	}
	public void setSkuStatus(String skuStatus) {
		this.skuStatus = skuStatus;
	}

}
