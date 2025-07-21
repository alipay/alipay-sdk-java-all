package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 票务的SKU信息
 *
 * @author auto create
 * @since 1.0, 2024-09-20 15:02:09
 */
public class TicketSKU extends AlipayObject {

	private static final long serialVersionUID = 8672161627285782595L;

	/**
	 * 票种的唯一ID用于下单
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 票种的类型由客户方针对自己的商品类型进行传递，不进行枚举管控，在页面上透传展示
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 09:00-10:00 这种属于按照天+分时控制余票，DATE是按照天控制余票
	 */
	@ApiField("stock_type")
	private String stockType;

	/**
	 * 用户票种的一些描述信息
	 */
	@ApiField("tips")
	private String tips;

	/**
	 * 票种的单价，非必填如果有会显示在票种旁
	 */
	@ApiField("unit_price")
	private String unitPrice;

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

	public String getStockType() {
		return this.stockType;
	}
	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	public String getTips() {
		return this.tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
