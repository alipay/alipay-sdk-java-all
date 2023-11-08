package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.associate response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-07 18:56:49
 */
public class AlipayMarketingActivityOrdervoucherAssociateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6168218616153644758L;

	/** 
	 * 支付宝系统关联订单成功的时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("associate_time")
	private Date associateTime;

	public void setAssociateTime(Date associateTime) {
		this.associateTime = associateTime;
	}
	public Date getAssociateTime( ) {
		return this.associateTime;
	}

}
