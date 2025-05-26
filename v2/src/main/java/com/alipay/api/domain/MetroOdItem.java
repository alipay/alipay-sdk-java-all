package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2020-04-01 13:03:38
 */
public class MetroOdItem extends AlipayObject {

	private static final long serialVersionUID = 5424592894973789983L;

	/**
	 * D
	 */
	@ApiField("dest_geo")
	private String destGeo;

	/**
	 * 客流
	 */
	@ApiField("od")
	private Long od;

	/**
	 * 时间
	 */
	@ApiField("time")
	private Long time;

	/**
	 * 结果
	 */
	@ApiField("user_info")
	private CloudbusUserInfo userInfo;

	/**
	 * 周末客流
	 */
	@ApiField("week_od")
	private Long weekOd;

	/**
	 * 工作日客流
	 */
	@ApiField("work_od")
	private Long workOd;

	public String getDestGeo() {
		return this.destGeo;
	}
	public void setDestGeo(String destGeo) {
		this.destGeo = destGeo;
	}

	public Long getOd() {
		return this.od;
	}
	public void setOd(Long od) {
		this.od = od;
	}

	public Long getTime() {
		return this.time;
	}
	public void setTime(Long time) {
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
