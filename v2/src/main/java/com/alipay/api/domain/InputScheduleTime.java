package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入参
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:57:37
 */
public class InputScheduleTime extends AlipayObject {

	private static final long serialVersionUID = 4424128185288685724L;

	/**
	 * 车容量
	 */
	@ApiField("capacity")
	private Long capacity;

	/**
	 * 方向，参考方向枚举
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 预设车次数
	 */
	@ApiField("exp_trip_cnt")
	private Long expTripCnt;

	/**
	 * 拓展参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 线路id
	 */
	@ApiField("line_id")
	private String lineId;

	public Long getCapacity() {
		return this.capacity;
	}
	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Long getExpTripCnt() {
		return this.expTripCnt;
	}
	public void setExpTripCnt(Long expTripCnt) {
		this.expTripCnt = expTripCnt;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

}
