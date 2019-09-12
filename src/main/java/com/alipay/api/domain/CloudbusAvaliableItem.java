package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可以用城市信息
 *
 * @author auto create
 * @since 1.0, 2019-07-31 19:50:50
 */
public class CloudbusAvaliableItem extends AlipayObject {

	private static final long serialVersionUID = 4441475782278569119L;

	/**
	 * 城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 结束可查月份  格式 yyyyMM
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 最大geohash数量
	 */
	@ApiField("max_size")
	private Long maxSize;

	/**
	 * 起始可查月份
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 城市是否有可用信息  true  false
	 */
	@ApiField("status")
	private Boolean status;

	/**
	 * 已经用geohash 数量
	 */
	@ApiField("used_size")
	private Long usedSize;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getMaxSize() {
		return this.maxSize;
	}
	public void setMaxSize(Long maxSize) {
		this.maxSize = maxSize;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Boolean getStatus() {
		return this.status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Long getUsedSize() {
		return this.usedSize;
	}
	public void setUsedSize(Long usedSize) {
		this.usedSize = usedSize;
	}

}
