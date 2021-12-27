package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员权益信息
 *
 * @author auto create
 * @since 1.0, 2019-08-27 18:08:15
 */
public class AntMemberBenefitInfo extends AlipayObject {

	private static final long serialVersionUID = 6433455528577699454L;

	/**
	 * 权益对应跳转地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 权益图标地址
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 权益状态：RECEIVABLE（可领取），RECEIVED（已领取），OTHER（其它）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 会员权益标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 会员权益价值
	 */
	@ApiField("value")
	private String value;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
