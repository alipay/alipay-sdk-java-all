package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 仪表盘详细信息
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:32
 */
public class DashBoardMeta extends AlipayObject {

	private static final long serialVersionUID = 1835516298385343622L;

	/**
	 * 授权状态，值为true或者false
	 */
	@ApiField("auth_status")
	private Boolean authStatus;

	/**
	 * 仪表盘创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 仪表盘ID
	 */
	@ApiField("dashboard_id")
	private String dashboardId;

	/**
	 * 仪表盘名称
	 */
	@ApiField("dashboard_name")
	private String dashboardName;

	public Boolean getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(Boolean authStatus) {
		this.authStatus = authStatus;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDashboardId() {
		return this.dashboardId;
	}
	public void setDashboardId(String dashboardId) {
		this.dashboardId = dashboardId;
	}

	public String getDashboardName() {
		return this.dashboardName;
	}
	public void setDashboardName(String dashboardName) {
		this.dashboardName = dashboardName;
	}

}
