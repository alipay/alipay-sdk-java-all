package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预测结果查询
 *
 * @author auto create
 * @since 1.0, 2019-08-22 10:28:10
 */
public class CloudbusPredictResult extends AlipayObject {

	private static final long serialVersionUID = 4383477942953872748L;

	/**
	 * 执行任务状态描述
	 */
	@ApiField("message")
	private String message;

	/**
	 * 任务id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 进度50%
	 */
	@ApiField("progress")
	private Long progress;

	/**
	 * 预测线路
	 */
	@ApiListField("routes")
	@ApiField("cloudbus_route_r_item")
	private List<CloudbusRouteRItem> routes;

	/**
	 * 影响下降线路
	 */
	@ApiListField("routes_decreased")
	@ApiField("cloudbus_route_r_item")
	private List<CloudbusRouteRItem> routesDecreased;

	/**
	 * 客流预测影响下降线路
	 */
	@ApiListField("routes_increased")
	@ApiField("cloudbus_route_r_item")
	private List<CloudbusRouteRItem> routesIncreased;

	/**
	 * 任务状态：0：准备 1：运行中 2：成功 3： 失败： 4：终止 5： 其他
	 */
	@ApiField("status")
	private Long status;

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public Long getProgress() {
		return this.progress;
	}
	public void setProgress(Long progress) {
		this.progress = progress;
	}

	public List<CloudbusRouteRItem> getRoutes() {
		return this.routes;
	}
	public void setRoutes(List<CloudbusRouteRItem> routes) {
		this.routes = routes;
	}

	public List<CloudbusRouteRItem> getRoutesDecreased() {
		return this.routesDecreased;
	}
	public void setRoutesDecreased(List<CloudbusRouteRItem> routesDecreased) {
		this.routesDecreased = routesDecreased;
	}

	public List<CloudbusRouteRItem> getRoutesIncreased() {
		return this.routesIncreased;
	}
	public void setRoutesIncreased(List<CloudbusRouteRItem> routesIncreased) {
		this.routesIncreased = routesIncreased;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
