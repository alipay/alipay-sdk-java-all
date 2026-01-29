package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于批量更新疫苗商品的状态入参
 *
 * @author auto create
 * @since 1.0, 2025-09-19 16:39:54
 */
public class ItemStatusUpdateByIsvItemIdParam extends AlipayObject {

	private static final long serialVersionUID = 3798832128548551328L;

	/**
	 * 外部疫苗ID用于定位商品信息
	 */
	@ApiField("isv_item_id")
	private String isvItemId;

	/**
	 * 操作类型, 0上架, -1下架
	 */
	@ApiField("status")
	private String status;

	public String getIsvItemId() {
		return this.isvItemId;
	}
	public void setIsvItemId(String isvItemId) {
		this.isvItemId = isvItemId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
