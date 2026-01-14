package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品检内容详情明细
 *
 * @author auto create
 * @since 1.0, 2025-11-27 14:38:13
 */
public class ContentDetail extends AlipayObject {

	private static final long serialVersionUID = 6145873474691944437L;

	/**
	 * 蚂蚁服务端计算静置时间差（写入时的服务器时间-当前服务器时间）
	 */
	@ApiField("rtc_time_difference")
	private String rtcTimeDifference;

	/**
	 * 唯一序号
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public String getRtcTimeDifference() {
		return this.rtcTimeDifference;
	}
	public void setRtcTimeDifference(String rtcTimeDifference) {
		this.rtcTimeDifference = rtcTimeDifference;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
