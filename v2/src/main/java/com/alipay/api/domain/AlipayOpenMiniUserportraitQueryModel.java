package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序的用户画像信息
 *
 * @author auto create
 * @since 1.0, 2021-06-01 14:32:56
 */
public class AlipayOpenMiniUserportraitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3779757531354171312L;

	/**
	 * 用户画像的时间范围。RECENT_7_DAY代表近7日，RECENT_30_DAY代表近30日
	 */
	@ApiField("date_scope")
	private String dateScope;

	/**
	 * 画像类型。AGE-年龄，PROVINCE-省份，CITY-城市，DEVICE-设备，GENDER-性别
	 */
	@ApiField("portrait_type")
	private String portraitType;

	/**
	 * 用户类型。NEW_USER新用户，ACTIVE_USER活跃用户
	 */
	@ApiField("user_type")
	private String userType;

	public String getDateScope() {
		return this.dateScope;
	}
	public void setDateScope(String dateScope) {
		this.dateScope = dateScope;
	}

	public String getPortraitType() {
		return this.portraitType;
	}
	public void setPortraitType(String portraitType) {
		this.portraitType = portraitType;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
