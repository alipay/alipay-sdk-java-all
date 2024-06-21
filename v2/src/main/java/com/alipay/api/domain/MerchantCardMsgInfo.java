package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家会员卡消息信息
 *
 * @author auto create
 * @since 1.0, 2023-06-25 10:48:45
 */
public class MerchantCardMsgInfo extends AlipayObject {

	private static final long serialVersionUID = 6423963459243967772L;

	/**
	 * 本次消息通知的变动积分，积分必须为数字型（可为浮点型，带2位小数点），格式非法则不发送消息。例如：
100，则代表增加100积分。
-100，则代表减少100积分。
	 */
	@ApiField("changed_point")
	private String changedPoint;

	public String getChangedPoint() {
		return this.changedPoint;
	}
	public void setChangedPoint(String changedPoint) {
		this.changedPoint = changedPoint;
	}

}
