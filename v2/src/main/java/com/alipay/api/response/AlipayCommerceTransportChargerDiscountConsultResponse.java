package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChargerDiscountActivityInfo;
import com.alipay.api.domain.ChargerDiscountActivityQuota;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.discount.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-29 14:47:45
 */
public class AlipayCommerceTransportChargerDiscountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8862752529546569231L;

	/** 
	 * 活动优惠信息
	 */
	@ApiField("activity_info")
	private ChargerDiscountActivityInfo activityInfo;

	/** 
	 * null
	 */
	@ApiListField("activity_quota")
	@ApiField("charger_discount_activity_quota")
	private List<ChargerDiscountActivityQuota> activityQuota;

	/** 
	 * 业务时间，格式：yyyy-MM-dd HH:mm: ss
	 */
	@ApiField("biz_date")
	private Date bizDate;

	public void setActivityInfo(ChargerDiscountActivityInfo activityInfo) {
		this.activityInfo = activityInfo;
	}
	public ChargerDiscountActivityInfo getActivityInfo( ) {
		return this.activityInfo;
	}

	public void setActivityQuota(List<ChargerDiscountActivityQuota> activityQuota) {
		this.activityQuota = activityQuota;
	}
	public List<ChargerDiscountActivityQuota> getActivityQuota( ) {
		return this.activityQuota;
	}

	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}
	public Date getBizDate( ) {
		return this.bizDate;
	}

}
