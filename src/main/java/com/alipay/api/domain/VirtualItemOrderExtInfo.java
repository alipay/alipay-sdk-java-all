package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟商品订单扩展信心
 *
 * @author auto create
 * @since 1.0, 2022-09-29 16:37:37
 */
public class VirtualItemOrderExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5167354541276962292L;

	/**
	 * 小程序appId
	 */
	@ApiField("notify_app_id")
	private String notifyAppId;

	public String getNotifyAppId() {
		return this.notifyAppId;
	}
	public void setNotifyAppId(String notifyAppId) {
		this.notifyAppId = notifyAppId;
	}

}
