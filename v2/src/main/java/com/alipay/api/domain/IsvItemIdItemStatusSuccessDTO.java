package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商疫苗修改状态值成功响应结果
 *
 * @author auto create
 * @since 1.0, 2025-09-19 16:39:54
 */
public class IsvItemIdItemStatusSuccessDTO extends AlipayObject {

	private static final long serialVersionUID = 8857226198811179129L;

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
