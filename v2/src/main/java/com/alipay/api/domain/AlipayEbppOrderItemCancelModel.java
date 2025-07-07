package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业支付订单子项删除接口
 *
 * @author auto create
 * @since 1.0, 2022-05-11 16:33:38
 */
public class AlipayEbppOrderItemCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7867767333979829648L;

	/**
	 * 机构订单子项id
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
