package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新建库存查询任务
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:20:04
 */
public class AlipayCommerceTransportAdStocktaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3369348119223695313L;

	/**
	 * 广告主id+创建库存查询任务
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 计价方式 + 是否唯一(不需要) + 创建库存查询任务 + 枚举值（1：CPT 时间保量、2：CPP 人次保量）+ 调用方根据业务需要传入
	 */
	@ApiField("charge_type")
	private Long chargeType;

	/**
	 * 售卖方式；是否唯一（不需要）+ 创建库存查询任务 + 枚举值（0：GD、1：RTB）+  调用方根据业务需求传入
	 */
	@ApiField("sell_mode")
	private Long sellMode;

	/**
	 * 库存量查询条件 + 是否唯一（不需要）+ 创建库存查询任务 + 业务方根据业务需求构造传入
	 */
	@ApiField("stock_query_condition")
	private StockQueryCondition stockQueryCondition;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public Long getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(Long chargeType) {
		this.chargeType = chargeType;
	}

	public Long getSellMode() {
		return this.sellMode;
	}
	public void setSellMode(Long sellMode) {
		this.sellMode = sellMode;
	}

	public StockQueryCondition getStockQueryCondition() {
		return this.stockQueryCondition;
	}
	public void setStockQueryCondition(StockQueryCondition stockQueryCondition) {
		this.stockQueryCondition = stockQueryCondition;
	}

}
