package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商修改价格成功响应
 *
 * @author auto create
 * @since 1.0, 2025-09-19 16:39:55
 */
public class IsvItemIdItemPriceSuccessDTO extends AlipayObject {

	private static final long serialVersionUID = 8698651253197828224L;

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
