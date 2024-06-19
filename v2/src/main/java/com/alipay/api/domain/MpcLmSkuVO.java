package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * openapi接口返回的sku
 *
 * @author auto create
 * @since 1.0, 2024-06-14 11:09:16
 */
public class MpcLmSkuVO extends AlipayObject {

	private static final long serialVersionUID = 8875145266835842575L;

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
	 * sku划线价，即原价
	 */
	@ApiField("mark_price")
	private String markPrice;

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
	 * sku售价
	 */
	@ApiField("price")
	private String price;

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

	public String getMarkPrice() {
		return this.markPrice;
	}
	public void setMarkPrice(String markPrice) {
		this.markPrice = markPrice;
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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
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
