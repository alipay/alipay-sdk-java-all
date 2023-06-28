package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户账号绑定关系创建
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:10
 */
public class AlipayCommerceIotAccountbindingCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5246695319559556954L;

	/**
	 * 协议服务商id+唯一+指定操作数据归属于哪个协议服务商+协议服务商接入时由支付宝统一分配
	 */
	@ApiField("protocol_supplier_id")
	private String protocolSupplierId;

	/**
	 * 用户在协议服务商的用户id+唯一+用于建立与支付宝账号的绑定关系+用户在协议服务商注册
	 */
	@ApiField("protocol_user_id")
	private String protocolUserId;

	/**
	 * 用户在协议服务商的用户名(显示名称)+不唯一+用于支付宝智能设备中心中显示用户名+用户在协议服务商注册时指定
	 */
	@ApiField("protocol_user_name")
	private String protocolUserName;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getProtocolSupplierId() {
		return this.protocolSupplierId;
	}
	public void setProtocolSupplierId(String protocolSupplierId) {
		this.protocolSupplierId = protocolSupplierId;
	}

	public String getProtocolUserId() {
		return this.protocolUserId;
	}
	public void setProtocolUserId(String protocolUserId) {
		this.protocolUserId = protocolUserId;
	}

	public String getProtocolUserName() {
		return this.protocolUserName;
	}
	public void setProtocolUserName(String protocolUserName) {
		this.protocolUserName = protocolUserName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
