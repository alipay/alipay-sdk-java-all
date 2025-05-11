package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义路线景点查询
 *
 * @author auto create
 * @since 1.0, 2024-09-20 19:27:35
 */
public class AlipayCloudCloudpromoCustomroutePoiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4538457391447771492L;

	/**
	 * 伴游卡片唯一id
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
