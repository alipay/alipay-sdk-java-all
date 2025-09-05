package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碳普惠低碳行为查询
 *
 * @author auto create
 * @since 1.0, 2024-10-30 00:20:44
 */
public class AlipayCommerceTransportCarbonjusticeLowcarbonbehaviorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3618723869258672295L;

	/**
	 * 城市编码，与城市名二选一必须有一个。比cityName更标准，在接入前确认传参。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 提前和出行方确认对应城市的城市名，部分城市的出行行为包含“市” 部分没有城市名只能使用cityCode。如果需要区县级别，则重新评估
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 查询行程的最晚时间。用于圈定行程的范围。如果不传则默认为当前时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 属于哪种低碳类型，必须属于枚举中的一个
CARBON_JUSTICE_BUS|CARBON_JUSTICE_METRO|CARBON_JUSTICE_HITCHHIKING
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 讲明自己是哪个调用方，要求能够让商务定位到来源即可
	 */
	@ApiField("source")
	private String source;

	/**
	 * 表示行程开始时间的最早时间，用于圈定时间范围。
如果不传，会默认取前一天
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
