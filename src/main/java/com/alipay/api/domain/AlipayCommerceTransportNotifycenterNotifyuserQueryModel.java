package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅中心订阅状态查询
 *
 * @author auto create
 * @since 1.0, 2021-01-13 11:36:02
 */
public class AlipayCommerceTransportNotifycenterNotifyuserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4425197162537429613L;

	/**
	 * 订阅服务唯一标识
	 */
	@ApiField("notify_id")
	private String notifyId;

	/**
	 * 订阅实体的值，ETC订阅实体为人，则为user_id
	 */
	@ApiField("notify_object")
	private String notifyObject;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getNotifyId() {
		return this.notifyId;
	}
	public void setNotifyId(String notifyId) {
		this.notifyId = notifyId;
	}

	public String getNotifyObject() {
		return this.notifyObject;
	}
	public void setNotifyObject(String notifyObject) {
		this.notifyObject = notifyObject;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
