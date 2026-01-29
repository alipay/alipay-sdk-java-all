package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售后单用户确认延期
 *
 * @author auto create
 * @since 1.0, 2026-01-15 15:42:42
 */
public class AlipayCommerceAftersaleorderConfirmtimeoutModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3185689481196918294L;

	/**
	 * 售后单id
	 */
	@ApiField("aftersales_id")
	private String aftersalesId;

	/**
	 * 待用户确认延期小时数
	 */
	@ApiField("wait_user_confirm_timeout_expand_hour")
	private Long waitUserConfirmTimeoutExpandHour;

	public String getAftersalesId() {
		return this.aftersalesId;
	}
	public void setAftersalesId(String aftersalesId) {
		this.aftersalesId = aftersalesId;
	}

	public Long getWaitUserConfirmTimeoutExpandHour() {
		return this.waitUserConfirmTimeoutExpandHour;
	}
	public void setWaitUserConfirmTimeoutExpandHour(Long waitUserConfirmTimeoutExpandHour) {
		this.waitUserConfirmTimeoutExpandHour = waitUserConfirmTimeoutExpandHour;
	}

}
