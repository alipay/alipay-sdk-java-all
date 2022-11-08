package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 热力图数据
 *
 * @author auto create
 * @since 1.0, 2022-10-14 19:15:52
 */
public class HeatMapData extends AlipayObject {

	private static final long serialVersionUID = 3394189379665462492L;

	/**
	 * 城市代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 热力图所在时间片结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 热力图栅栏列表
	 */
	@ApiListField("fences")
	@ApiField("fence")
	private List<Fence> fences;

	/**
	 * 热力图所在时间片开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<Fence> getFences() {
		return this.fences;
	}
	public void setFences(List<Fence> fences) {
		this.fences = fences;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
