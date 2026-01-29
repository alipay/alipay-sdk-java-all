package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 路段坐标信息
 *
 * @author auto create
 * @since 1.0, 2025-12-03 11:39:11
 */
public class RoboRoutingPoint extends AlipayObject {

	private static final long serialVersionUID = 3214539281894437374L;

	/**
	 * 点位信息
	 */
	@ApiField("point")
	private RoboPoint point;

	public RoboPoint getPoint() {
		return this.point;
	}
	public void setPoint(RoboPoint point) {
		this.point = point;
	}

}
