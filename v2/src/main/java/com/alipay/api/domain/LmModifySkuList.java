package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * linkedmall中修改商品后，推送的变更商品SKU对象
 *
 * @author auto create
 * @since 1.0, 2023-02-08 10:44:33
 */
public class LmModifySkuList extends AlipayObject {

	private static final long serialVersionUID = 8668276319915871638L;

	/**
	 * 是否可售卖
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/**
	 * 积分
	 */
	@ApiField("points")
	private Long points;

	/**
	 * 积分抵扣金额
	 */
	@ApiField("points_amount")
	private Long pointsAmount;

	/**
	 * 销售价格（分）
	 */
	@ApiField("price_cent")
	private Long priceCent;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private Long skuId;

	public Boolean getCanSell() {
		return this.canSell;
	}
	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}

	public Long getPoints() {
		return this.points;
	}
	public void setPoints(Long points) {
		this.points = points;
	}

	public Long getPointsAmount() {
		return this.pointsAmount;
	}
	public void setPointsAmount(Long pointsAmount) {
		this.pointsAmount = pointsAmount;
	}

	public Long getPriceCent() {
		return this.priceCent;
	}
	public void setPriceCent(Long priceCent) {
		this.priceCent = priceCent;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

}
