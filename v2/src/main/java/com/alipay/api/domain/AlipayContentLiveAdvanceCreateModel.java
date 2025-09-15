package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建直播预告
 *
 * @author auto create
 * @since 1.0, 2025-04-22 13:57:59
 */
public class AlipayContentLiveAdvanceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2871891559914363447L;

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
	 * 对直播主题的简短描述
	 */
	@ApiField("live_title")
	private String liveTitle;

	/**
	 * 外部的预告id，和支付宝直播域的预告id有关联
	 */
	@ApiField("out_advance_id")
	private String outAdvanceId;

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

	public String getOutAdvanceId() {
		return this.outAdvanceId;
	}
	public void setOutAdvanceId(String outAdvanceId) {
		this.outAdvanceId = outAdvanceId;
	}

}
