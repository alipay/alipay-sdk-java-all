package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 本地商品sku修改模型
 *
 * @author auto create
 * @since 1.0, 2024-05-29 17:14:53
 */
public class LocalItemSkuModifyVO extends AlipayObject {

	private static final long serialVersionUID = 6149493526124541498L;

	/**
	 * sku原价，分为单位。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商家侧sku ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * sku售价，分为单位
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * sku售卖状态
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * sku销售属性列表
	 */
	@ApiListField("sku_attrs")
	@ApiField("item_sku_attr_v_o")
	private List<ItemSkuAttrVO> skuAttrs;

	/**
	 * 支付宝平台侧商品sku的唯一标识
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku库存
	 */
	@ApiField("stock_num")
	private String stockNum;

	/**
	 * sku图片的afts文件ID，可以通过 <a href="https://opendocs.alipay.com/mini/3fade898_alipay.marketing.image.enhance.upload?scene=a07c8e4fcf3e490f97d959445f393b01&pathHash=a941a783" target="_blank">alipay.marketing.image.enhance.upload</a> 获取图片文件id
	 */
	@ApiField("thumb_img_id")
	private String thumbImgId;

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public List<ItemSkuAttrVO> getSkuAttrs() {
		return this.skuAttrs;
	}
	public void setSkuAttrs(List<ItemSkuAttrVO> skuAttrs) {
		this.skuAttrs = skuAttrs;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}

	public String getThumbImgId() {
		return this.thumbImgId;
	}
	public void setThumbImgId(String thumbImgId) {
		this.thumbImgId = thumbImgId;
	}

}
