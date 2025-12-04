package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商疫苗商品修改库存成功结果
 *
 * @author auto create
 * @since 1.0, 2025-09-19 16:39:58
 */
public class IsvItemIdItemStockSuccessDTO extends AlipayObject {

	private static final long serialVersionUID = 7747858441395815925L;

	/**
	 * 外部疫苗商品ID
	 */
	@ApiField("isv_item_id")
	private String isvItemId;

	public String getIsvItemId() {
		return this.isvItemId;
	}
	public void setIsvItemId(String isvItemId) {
		this.isvItemId = isvItemId;
	}

}
