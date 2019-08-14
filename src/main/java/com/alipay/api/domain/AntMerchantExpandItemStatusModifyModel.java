package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品状态修改接口
 *
 * @author auto create
 * @since 1.0, 2019-01-18 10:39:57
 */
public class AntMerchantExpandItemStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5646551576588369411L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品状态：EFFECT、INVALID
	 */
	@ApiField("status")
	private String status;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
