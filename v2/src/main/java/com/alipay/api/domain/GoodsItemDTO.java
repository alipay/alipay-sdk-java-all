package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2023-03-29 19:18:33
 */
public class GoodsItemDTO extends AlipayObject {

	private static final long serialVersionUID = 5731597447468167341L;

	/**
	 * 商家goods_id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private Long itemCnt;

	/**
	 * 提报服务库外部商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商家自定义skuID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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

}
