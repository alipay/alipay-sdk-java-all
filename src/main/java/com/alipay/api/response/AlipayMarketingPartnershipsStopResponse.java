package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.partnerships.stop response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-19 14:22:35
 */
public class AlipayMarketingPartnershipsStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 4811586765261438428L;

	/** 
	 * 合作状态，枚举值： ESTABLISHED：已建立 TERMINATED：已终止
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 终止合作关系时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("stop_time")
	private Date stopTime;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}
	public Date getStopTime( ) {
		return this.stopTime;
	}

}
