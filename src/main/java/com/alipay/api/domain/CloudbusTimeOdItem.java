package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公交云分时查询结果输出列表
 *
 * @author auto create
 * @since 1.0, 2019-10-15 11:45:27
 */
public class CloudbusTimeOdItem extends AlipayObject {

	private static final long serialVersionUID = 4895161117369214455L;

	/**
	 * 公交od
	 */
	@ApiField("bus_od")
	private Long busOd;

	/**
	 * 潜在od
	 */
	@ApiField("od")
	private Long od;

	/**
	 * 时间，精确到小时
	 */
	@ApiField("time")
	private String time;

	/**
	 * 用户画像
	 */
	@ApiField("user_info")
	private CloudbusUserInfo userInfo;

	/**
	 * 工作日od
	 */
	@ApiField("week_od")
	private Long weekOd;

	/**
	 * 工作日od
	 */
	@ApiField("work_od")
	private Long workOd;

	public Long getBusOd() {
		return this.busOd;
	}
	public void setBusOd(Long busOd) {
		this.busOd = busOd;
	}

	public Long getOd() {
		return this.od;
	}
	public void setOd(Long od) {
		this.od = od;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public CloudbusUserInfo getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(CloudbusUserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Long getWeekOd() {
		return this.weekOd;
	}
	public void setWeekOd(Long weekOd) {
		this.weekOd = weekOd;
	}

	public Long getWorkOd() {
		return this.workOd;
	}
	public void setWorkOd(Long workOd) {
		this.workOd = workOd;
	}

}
