package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 调整运营组织对象
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:16
 */
public class AdjustOperationOrganizationObject extends AlipayObject {

	private static final long serialVersionUID = 4588874462954767336L;

	/**
	 * 调整运营汇总
	 */
	@ApiField("adjust_operational_summary")
	private String adjustOperationalSummary;

	/**
	 * 下行调整运营详情
	 */
	@ApiField("down_adjust_operational_detail")
	private String downAdjustOperationalDetail;

	/**
	 * 下行方向
	 */
	@ApiField("down_direction")
	private String downDirection;

	/**
	 * 线路名称
	 */
	@ApiField("route_name")
	private String routeName;

	/**
	 * 上行调整运营详情
	 */
	@ApiField("up_adjust_operational_detail")
	private String upAdjustOperationalDetail;

	/**
	 * 上行方向
	 */
	@ApiField("up_direction")
	private String upDirection;

	public String getAdjustOperationalSummary() {
		return this.adjustOperationalSummary;
	}
	public void setAdjustOperationalSummary(String adjustOperationalSummary) {
		this.adjustOperationalSummary = adjustOperationalSummary;
	}

	public String getDownAdjustOperationalDetail() {
		return this.downAdjustOperationalDetail;
	}
	public void setDownAdjustOperationalDetail(String downAdjustOperationalDetail) {
		this.downAdjustOperationalDetail = downAdjustOperationalDetail;
	}

	public String getDownDirection() {
		return this.downDirection;
	}
	public void setDownDirection(String downDirection) {
		this.downDirection = downDirection;
	}

	public String getRouteName() {
		return this.routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getUpAdjustOperationalDetail() {
		return this.upAdjustOperationalDetail;
	}
	public void setUpAdjustOperationalDetail(String upAdjustOperationalDetail) {
		this.upAdjustOperationalDetail = upAdjustOperationalDetail;
	}

	public String getUpDirection() {
		return this.upDirection;
	}
	public void setUpDirection(String upDirection) {
		this.upDirection = upDirection;
	}

}
