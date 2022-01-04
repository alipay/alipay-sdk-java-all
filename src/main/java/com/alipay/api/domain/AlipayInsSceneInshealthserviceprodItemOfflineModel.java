package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康服务标的下架接口
 *
 * @author auto create
 * @since 1.0, 2020-10-15 15:34:01
 */
public class AlipayInsSceneInshealthserviceprodItemOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 7135976413182111566L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
