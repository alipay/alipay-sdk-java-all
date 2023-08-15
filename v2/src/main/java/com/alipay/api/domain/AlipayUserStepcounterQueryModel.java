package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户日计步数查询
 *
 * @author auto create
 * @since 1.0, 2023-08-10 11:33:35
 */
public class AlipayUserStepcounterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4157338829599361768L;

	/**
	 * 商户要查询步数的日期。如果不传入此参数，则返回用户当日步数。
	 */
	@ApiField("count_date")
	private String countDate;

	/**
	 * OpenId是用户（UserId）在应用（AppId）下的唯一用户标识。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求方唯一标识。每一个外部商户都会分配一个业务方标识，请使用钉钉联系支付宝小二骁然获取此标识。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 商户要查询步数的时区，此参数只在查询当日用户步数时有效。若此参数为空，则以用户当时所在时区返回步数。
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 支付宝用户唯一用户id。为2088开头id号，需通过alipay.user.userinfo.share接口获取此值
	 */
	@ApiField("user_id")
	private String userId;

	public String getCountDate() {
		return this.countDate;
	}
	public void setCountDate(String countDate) {
		this.countDate = countDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
