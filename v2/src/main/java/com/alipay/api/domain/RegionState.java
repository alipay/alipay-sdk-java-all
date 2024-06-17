package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 柜内区域状态
 *
 * @author auto create
 * @since 1.0, 2019-06-19 21:15:23
 */
public class RegionState extends AlipayObject {

	private static final long serialVersionUID = 1694631675892218993L;

	/**
	 * 区域所在层
	 */
	@ApiField("floor")
	private Long floor;

	/**
	 * 左端最大可放坐标(单位:毫米)
	 */
	@ApiField("left_max")
	private Long leftMax;

	/**
	 * 左端最小可放坐标(单位:毫米)
	 */
	@ApiField("left_min")
	private Long leftMin;

	/**
	 * 黄色区域插入选取商品后最左端坐标(单位:毫米)
	 */
	@ApiField("left_push")
	private Long leftPush;

	public Long getFloor() {
		return this.floor;
	}
	public void setFloor(Long floor) {
		this.floor = floor;
	}

	public Long getLeftMax() {
		return this.leftMax;
	}
	public void setLeftMax(Long leftMax) {
		this.leftMax = leftMax;
	}

	public Long getLeftMin() {
		return this.leftMin;
	}
	public void setLeftMin(Long leftMin) {
		this.leftMin = leftMin;
	}

	public Long getLeftPush() {
		return this.leftPush;
	}
	public void setLeftPush(Long leftPush) {
		this.leftPush = leftPush;
	}

}
