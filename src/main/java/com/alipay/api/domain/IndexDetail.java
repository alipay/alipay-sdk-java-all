package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指数信息详情
 *
 * @author auto create
 * @since 1.0, 2019-09-06 20:54:21
 */
public class IndexDetail extends AlipayObject {

	private static final long serialVersionUID = 8432859661955416725L;

	/**
	 * 区域编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 区域名称
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 当月市排名
	 */
	@ApiField("city_ranking")
	private String cityRanking;

	/**
	 * 当月区排名
	 */
	@ApiField("county_ranking")
	private String countyRanking;

	/**
	 * 主键
	 */
	@ApiField("id")
	private String id;

	/**
	 * 指数值
	 */
	@ApiField("index_val")
	private String indexVal;

	/**
	 * 年月
	 */
	@ApiField("period")
	private String period;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return this.areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCityRanking() {
		return this.cityRanking;
	}
	public void setCityRanking(String cityRanking) {
		this.cityRanking = cityRanking;
	}

	public String getCountyRanking() {
		return this.countyRanking;
	}
	public void setCountyRanking(String countyRanking) {
		this.countyRanking = countyRanking;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIndexVal() {
		return this.indexVal;
	}
	public void setIndexVal(String indexVal) {
		this.indexVal = indexVal;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

}
