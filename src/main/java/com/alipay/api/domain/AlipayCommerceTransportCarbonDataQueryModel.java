package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户碳积分记录
 *
 * @author auto create
 * @since 1.0, 2022-10-19 16:35:15
 */
public class AlipayCommerceTransportCarbonDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1597548117871342821L;

	/**
	 * 业务结束时间  yyyy-MM-dd HH:mm:ss 格式
	 */
	@ApiField("biz_date_end")
	private Date bizDateEnd;

	/**
	 * 业务开始时间  yyyy-MM-dd HH:mm:sss 格式
	 */
	@ApiField("biz_date_start")
	private Date bizDateStart;

	/**
	 * 业务场景，目前支持BUS、METRO
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizDateEnd() {
		return this.bizDateEnd;
	}
	public void setBizDateEnd(Date bizDateEnd) {
		this.bizDateEnd = bizDateEnd;
	}

	public Date getBizDateStart() {
		return this.bizDateStart;
	}
	public void setBizDateStart(Date bizDateStart) {
		this.bizDateStart = bizDateStart;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
