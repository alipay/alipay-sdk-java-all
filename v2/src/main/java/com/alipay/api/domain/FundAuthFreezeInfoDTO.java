package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金预授权冻结信息
 *
 * @author auto create
 * @since 1.0, 2024-09-01 22:13:15
 */
public class FundAuthFreezeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5385237451332851347L;

	/**
	 * 芝麻外部类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 资金预授权成功消息通知地址，接入租赁快捷下单商户可通过指定该地址监听支付宝侧预授权消息
	 */
	@ApiField("freeze_notify_url")
	private String freezeNotifyUrl;

	/**
	 * 收款账户的支付宝用户号。
以2088开头的16位纯数字，如果传入则会校验该账号是否具备当前商户收款权限，
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/**
	 * 芝麻侧生成的信用服务id
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getFreezeNotifyUrl() {
		return this.freezeNotifyUrl;
	}
	public void setFreezeNotifyUrl(String freezeNotifyUrl) {
		this.freezeNotifyUrl = freezeNotifyUrl;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}
