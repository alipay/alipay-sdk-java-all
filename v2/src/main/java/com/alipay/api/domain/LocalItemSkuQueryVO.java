package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 本地商品sku，查询本地商品详情时使用当前sku对象进行传参
 *
 * @author auto create
 * @since 1.0, 2024-05-29 17:14:16
 */
public class LocalItemSkuQueryVO extends AlipayObject {

	private static final long serialVersionUID = 1594465417721934775L;

	/**
	 * 用于需要透出sku属性的场景。如线路游需要透出sku销售属性
	 */
	@ApiListField("attrs")
	@ApiField("item_sku_attr_v_o")
	private List<ItemSkuAttrVO> attrs;

	/**
	 * sku原价，分为单位
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
	 * sku售卖状态，包含以下两种状态： 已下架(DELISTING) 可售卖(AVAILABLE)
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * 支付宝平台侧商品sku的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * sku图片afts文件链接，素材中心根据提报时的图片afts文件ID自动生成
	 */
	@ApiField("thumb_img_url")
	private String thumbImgUrl;

	public List<ItemSkuAttrVO> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<ItemSkuAttrVO> attrs) {
		this.attrs = attrs;
	}

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

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public String getThumbImgUrl() {
		return this.thumbImgUrl;
	}
	public void setThumbImgUrl(String thumbImgUrl) {
		this.thumbImgUrl = thumbImgUrl;
	}

}
