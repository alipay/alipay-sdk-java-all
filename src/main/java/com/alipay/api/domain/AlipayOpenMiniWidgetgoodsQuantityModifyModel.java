package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小部件商品库存修改
 *
 * @author auto create
 * @since 1.0, 2022-10-24 14:42:13
 */
public class AlipayOpenMiniWidgetgoodsQuantityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5524563493243926761L;

	/**
	 * 商品的唯一标识，根据该字段修改商品
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 已售数量
	 */
	@ApiField("sold_quantity")
	private Long soldQuantity;

	/**
	 * 总库存量
	 */
	@ApiField("total_quantity")
	private Long totalQuantity;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Long getSoldQuantity() {
		return this.soldQuantity;
	}
	public void setSoldQuantity(Long soldQuantity) {
		this.soldQuantity = soldQuantity;
	}

	public Long getTotalQuantity() {
		return this.totalQuantity;
	}
	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}
