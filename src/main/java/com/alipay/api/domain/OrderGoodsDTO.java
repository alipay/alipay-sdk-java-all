package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单商品列表; 环保行为:临期商品，补充替换包装
、再生塑料包装、FSC认证包装、该商品列表必填
 *
 * @author auto create
 * @since 1.0, 2022-05-19 15:30:45
 */
public class OrderGoodsDTO extends AlipayObject {

	private static final long serialVersionUID = 6498969234632483369L;

	/**
	 * 商品数量(FSC的情况下，必填)
	 */
	@ApiField("goods_amount")
	private Long goodsAmount;

	/**
	 * 商品有效时长，单位:天 (临期商品时，必填)
	 */
	@ApiField("goods_effective_duration")
	private Long goodsEffectiveDuration;

	/**
	 * 商品编码(最好69码)
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品生产时间 (临期商品时，必填)
	 */
	@ApiField("goods_prd_time")
	private Date goodsPrdTime;

	/**
	 * 行号, 支持购买几件同一个商品(批次)
	 */
	@ApiField("item_id")
	private String itemId;

	public Long getGoodsAmount() {
		return this.goodsAmount;
	}
	public void setGoodsAmount(Long goodsAmount) {
		this.goodsAmount = goodsAmount;
	}

	public Long getGoodsEffectiveDuration() {
		return this.goodsEffectiveDuration;
	}
	public void setGoodsEffectiveDuration(Long goodsEffectiveDuration) {
		this.goodsEffectiveDuration = goodsEffectiveDuration;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Date getGoodsPrdTime() {
		return this.goodsPrdTime;
	}
	public void setGoodsPrdTime(Date goodsPrdTime) {
		this.goodsPrdTime = goodsPrdTime;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
