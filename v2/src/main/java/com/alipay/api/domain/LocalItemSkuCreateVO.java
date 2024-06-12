package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 本地商品sku，创建本地商品时使用当前sku对象进行传参。
 *
 * @author auto create
 * @since 1.0, 2024-05-29 17:14:54
 */
public class LocalItemSkuCreateVO extends AlipayObject {

	private static final long serialVersionUID = 3569423825452593837L;

	/**
	 * sku原价，分为单位。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商家侧自定义的app下唯一的skuId
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
	 * sku库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * 图片afts文件ID，可以通过 <a href="https://opendocs.alipay.com/mini/3fade898_alipay.marketing.image.enhance.upload?scene=a07c8e4fcf3e490f97d959445f393b01&pathHash=a941a783" target="_blank">alipay.marketing.image.enhance.upload</a> 获取图片文件id
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

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public String getThumbImgId() {
		return this.thumbImgId;
	}
	public void setThumbImgId(String thumbImgId) {
		this.thumbImgId = thumbImgId;
	}

}
