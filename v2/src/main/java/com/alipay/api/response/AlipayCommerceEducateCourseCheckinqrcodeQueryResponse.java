package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.course.checkinqrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 10:02:29
 */
public class AlipayCommerceEducateCourseCheckinqrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8388736499623414331L;

	/** 
	 * 自动刷新二维码
	 */
	@ApiField("automatic_refresh")
	private Boolean automaticRefresh;

	/** 
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 手动关闭
	 */
	@ApiField("manual_close")
	private Boolean manualClose;

	/** 
	 * 下一次刷新时间
	 */
	@ApiField("next_refresh_time")
	private Date nextRefreshTime;

	/** 
	 * 二维码URL
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public void setAutomaticRefresh(Boolean automaticRefresh) {
		this.automaticRefresh = automaticRefresh;
	}
	public Boolean getAutomaticRefresh( ) {
		return this.automaticRefresh;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setManualClose(Boolean manualClose) {
		this.manualClose = manualClose;
	}
	public Boolean getManualClose( ) {
		return this.manualClose;
	}

	public void setNextRefreshTime(Date nextRefreshTime) {
		this.nextRefreshTime = nextRefreshTime;
	}
	public Date getNextRefreshTime( ) {
		return this.nextRefreshTime;
	}

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

}
