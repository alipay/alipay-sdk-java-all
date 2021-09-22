package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户当前路线信息接口
 *
 * @author auto create
 * @since 1.0, 2021-09-22 11:39:31
 */
public class AlipaySocialAntsportsCurrentpathQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7197457294546681772L;

	/**
	 * 日期。格式yyyy-MM-dd
	 */
	@ApiField("day")
	private String day;

	/**
	 * 路线场景
	 */
	@ApiField("path_scene")
	private String pathScene;

	/**
	 * 路线归属站点编码
	 */
	@ApiField("path_station_code")
	private String pathStationCode;

	/**
	 * 路线归属站点名称
	 */
	@ApiField("path_station_name")
	private String pathStationName;

	/**
	 * 时区
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDay() {
		return this.day;
	}
	public void setDay(String day) {
		this.day = day;
	}

	public String getPathScene() {
		return this.pathScene;
	}
	public void setPathScene(String pathScene) {
		this.pathScene = pathScene;
	}

	public String getPathStationCode() {
		return this.pathStationCode;
	}
	public void setPathStationCode(String pathStationCode) {
		this.pathStationCode = pathStationCode;
	}

	public String getPathStationName() {
		return this.pathStationName;
	}
	public void setPathStationName(String pathStationName) {
		this.pathStationName = pathStationName;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
