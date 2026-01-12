package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户券码券查询
 *
 * @author auto create
 * @since 1.0, 2024-05-27 14:01:05
 */
public class AlipayMarketingVoucherStockQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7178188777412386771L;

	/**
	 * 库存ID, 库存创建接口返回
	 */
	@ApiField("stock_id")
	private String stockId;

	public String getStockId() {
		return this.stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

}
