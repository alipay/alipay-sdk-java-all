package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序智能营销sku的结构
 *
 * @author auto create
 * @since 1.0, 2023-09-13 14:18:13
 */
public class MpcSkuVO extends AlipayObject {

	private static final long serialVersionUID = 2599634384859411648L;

	/**
	 * 商品编码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 小程序云智能营销赋予的skuId
	 */
	@ApiField("mpc_sku_id")
	private String mpcSkuId;

	/**
	 * 原价 （非必填）
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 商家skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 属性
	 */
	@ApiListField("properties")
	@ApiField("mpc_property")
	private List<MpcProperty> properties;

	/**
	 * 销售价
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 规格图片
	 */
	@ApiField("sku_pic")
	private String skuPic;

	/**
	 * 库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
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

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public List<MpcProperty> getProperties() {
		return this.properties;
	}
	public void setProperties(List<MpcProperty> properties) {
		this.properties = properties;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSkuPic() {
		return this.skuPic;
	}
	public void setSkuPic(String skuPic) {
		this.skuPic = skuPic;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
