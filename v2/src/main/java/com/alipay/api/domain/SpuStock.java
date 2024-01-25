package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品spu库存
 *
 * @author auto create
 * @since 1.0, 2023-03-23 11:00:07
 */
public class SpuStock extends AlipayObject {

	private static final long serialVersionUID = 6477525392857758837L;

	/**
	 * 对用户展示的实际可售卖库存数量。
若包含了多个规格，为所有规格的可售库存之和。
	 */
	@ApiField("available_stock_num")
	private Long availableStockNum;

	/**
	 * 总库存=预扣库存+可售库存
若包含了多个规格，为所有规格的总库存之和
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * 用户下单但未支付的商品数量
若包含了多个规格，为所有规格的占用库存之和。
	 */
	@ApiField("withholding_stock_num")
	private Long withholdingStockNum;

	public Long getAvailableStockNum() {
		return this.availableStockNum;
	}
	public void setAvailableStockNum(Long availableStockNum) {
		this.availableStockNum = availableStockNum;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public Long getWithholdingStockNum() {
		return this.withholdingStockNum;
	}
	public void setWithholdingStockNum(Long withholdingStockNum) {
		this.withholdingStockNum = withholdingStockNum;
	}

}
