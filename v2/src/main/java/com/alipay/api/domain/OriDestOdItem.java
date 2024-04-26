package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 7位od 结果对
 *
 * @author auto create
 * @since 1.0, 2019-07-31 19:51:09
 */
public class OriDestOdItem extends AlipayObject {

	private static final long serialVersionUID = 1364825973719784524L;

	/**
	 * 目的geohash
	 */
	@ApiField("dest_geo")
	private String destGeo;

	/**
	 * od数量
	 */
	@ApiField("od")
	private Long od;

	/**
	 * 周末
	 */
	@ApiField("week_od")
	private Long weekOd;

	/**
	 * 工作日OD
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
