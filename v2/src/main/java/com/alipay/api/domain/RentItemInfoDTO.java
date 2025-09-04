package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品详细信息
 *
 * @author auto create
 * @since 1.0, 2025-04-10 15:12:29
 */
public class RentItemInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4698875929587862386L;

	/**
	 * <a href="https://opendocs.alipay.com/open/10719">请参考租赁商品类目文档</a>
	 */
	@ApiField("goods_category")
	private String goodsCategory;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private Long itemCnt;

	/**
	 * 商户侧商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 外部商品ID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商品单价，单位：元，精确到小数点后两位，例如租赁商品请传入日租，10元/天
	 */
	@ApiField("sale_price")
	private String salePrice;

	public String getGoodsCategory() {
		return this.goodsCategory;
	}
	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Long getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(Long itemCnt) {
		this.itemCnt = itemCnt;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

}
