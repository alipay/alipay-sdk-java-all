package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户券码券查询
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:39:41
 */
public class AlipayMarketingVoucherStockQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3633631857987368978L;

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
