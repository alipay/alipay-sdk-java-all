package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业订单批量查询接口
 *
 * @author auto create
 * @since 1.0, 2021-04-07 20:41:15
 */
public class AlipayEbppOrderItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4371561623132931353L;

	/**
	 * 机构端订单项id列表
	 */
	@ApiField("inst_item_id")
	private String instItemId;

	public String getInstItemId() {
		return this.instItemId;
	}
	public void setInstItemId(String instItemId) {
		this.instItemId = instItemId;
	}

}
