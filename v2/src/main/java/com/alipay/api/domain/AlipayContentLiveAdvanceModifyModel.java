package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改支付宝直播预告
 *
 * @author auto create
 * @since 1.0, 2025-04-22 13:58:08
 */
public class AlipayContentLiveAdvanceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3589396555492888832L;

	/**
	 * 支付宝直播预告id
	 */
	@ApiField("alipay_advance_id")
	private String alipayAdvanceId;

	/**
	 * 用户生活号标识id
	 */
	@ApiField("alipay_public_id")
	private String alipayPublicId;

	/**
	 * 预约开播时间 格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("live_advance_time")
	private Date liveAdvanceTime;

	/**
	 * 直播标题
	 */
	@ApiField("live_title")
	private String liveTitle;

	public String getAlipayAdvanceId() {
		return this.alipayAdvanceId;
	}
	public void setAlipayAdvanceId(String alipayAdvanceId) {
		this.alipayAdvanceId = alipayAdvanceId;
	}

	public String getAlipayPublicId() {
		return this.alipayPublicId;
	}
	public void setAlipayPublicId(String alipayPublicId) {
		this.alipayPublicId = alipayPublicId;
	}

	public Date getLiveAdvanceTime() {
		return this.liveAdvanceTime;
	}
	public void setLiveAdvanceTime(Date liveAdvanceTime) {
		this.liveAdvanceTime = liveAdvanceTime;
	}

	public String getLiveTitle() {
		return this.liveTitle;
	}
	public void setLiveTitle(String liveTitle) {
		this.liveTitle = liveTitle;
	}

}
