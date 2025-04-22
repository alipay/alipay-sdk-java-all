package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户日计步数据批量查询接口
 *
 * @author auto create
 * @since 1.0, 2023-08-10 11:39:45
 */
public class AlipayUserStepcounterDataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7616966175524368119L;

	/**
	 * 步数数据查询的结束日期。此日期不能小于步数查询的开始日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * OpenId是用户（UserId）在应用（AppId）下的唯一用户标识。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求方唯一标识。每一个外部商户都会分配一个业务方标识，请使用钉钉联系支付宝小二骁然获取此标识
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 步数数据查询的开始日期
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 用户的计步时区。若此参数为空，则返回所有时区的步数信息。
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 支付宝用户唯一用户id。为2088开头id号，需通过alipay.user.info.share接口获取此值
	 */
	@ApiField("user_id")
	private String userId;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
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

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
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
