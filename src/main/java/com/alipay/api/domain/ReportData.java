package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报表数据
 *
 * @author auto create
 * @since 1.0, 2022-07-14 11:08:06
 */
public class ReportData extends AlipayObject {

	private static final long serialVersionUID = 7192787419411128147L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 线路编码
	 */
	@ApiField("line_code")
	private String lineCode;

	/**
	 * 点位id
	 */
	@ApiField("position_id")
	private String positionId;

	/**
	 * 播放次数
	 */
	@ApiField("pv")
	private Long pv;

	/**
	 * 触达人数
	 */
	@ApiField("uv")
	private Long uv;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getLineCode() {
		return this.lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	public String getPositionId() {
		return this.positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public Long getPv() {
		return this.pv;
	}
	public void setPv(Long pv) {
		this.pv = pv;
	}

	public Long getUv() {
		return this.uv;
	}
	public void setUv(Long uv) {
		this.uv = uv;
	}

}
