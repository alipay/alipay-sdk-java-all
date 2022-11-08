package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.disassociate response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-07 18:24:17
 */
public class AlipayMarketingActivityOrdervoucherDisassociateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5898716211119759519L;

	/** 
	 * 支付宝系统取消关联订单成功的时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("disassociate_time")
	private Date disassociateTime;

	public void setDisassociateTime(Date disassociateTime) {
		this.disassociateTime = disassociateTime;
	}
	public Date getDisassociateTime( ) {
		return this.disassociateTime;
	}

}
