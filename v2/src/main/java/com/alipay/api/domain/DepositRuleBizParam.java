package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自动充值业务参数扩展
 *
 * @author auto create
 * @since 1.0, 2025-05-07 11:18:08
 */
public class DepositRuleBizParam extends AlipayObject {

	private static final long serialVersionUID = 3631147174889449343L;

	/**
	 * 是否发内部消息
	 */
	@ApiField("need_send_inner_msg")
	private Boolean needSendInnerMsg;

	public Boolean getNeedSendInnerMsg() {
		return this.needSendInnerMsg;
	}
	public void setNeedSendInnerMsg(Boolean needSendInnerMsg) {
		this.needSendInnerMsg = needSendInnerMsg;
	}

}
