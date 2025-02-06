package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝社交查询加入的群列表
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:15:36
 */
public class AlipaySocialBaseChatGroupsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1395648397655798296L;

	/**
	 * 上次接口返回的key，初始传0
	 */
	@ApiField("last_key")
	private Long lastKey;

	public Long getLastKey() {
		return this.lastKey;
	}
	public void setLastKey(Long lastKey) {
		this.lastKey = lastKey;
	}

}
