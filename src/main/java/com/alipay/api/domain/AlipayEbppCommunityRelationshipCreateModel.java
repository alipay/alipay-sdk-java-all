package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业小区绑定关系创建
 *
 * @author auto create
 * @since 1.0, 2021-01-25 10:33:48
 */
public class AlipayEbppCommunityRelationshipCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7882377536369888733L;

	/**
	 * 小区短名, 创建小区时创建
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 日常服务开始时间，例如24:00
	 */
	@ApiField("daily_end")
	private String dailyEnd;

	/**
	 * 日常服务开始时间，例如00:00
	 */
	@ApiField("daily_start")
	private String dailyStart;

	/**
	 * 物业公司的短名,在创建物业公司时生成
	 */
	@ApiField("property_short_name")
	private String propertyShortName;

	/**
	 * 服务结束时间，格式：yyyy-MM-dd HH:mm:ss（精度只到日期）
	 */
	@ApiField("service_end")
	private Date serviceEnd;

	/**
	 * 服务开始时间，格式为yyyy-MM-dd HH:mm:ss（精度只到日期）
	 */
	@ApiField("service_start")
	private Date serviceStart;

	/**
	 * 服务类型，不传默认为物业缴费THIRD_PARTY_COMMUNITY_JIAOFEI
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public String getDailyEnd() {
		return this.dailyEnd;
	}
	public void setDailyEnd(String dailyEnd) {
		this.dailyEnd = dailyEnd;
	}

	public String getDailyStart() {
		return this.dailyStart;
	}
	public void setDailyStart(String dailyStart) {
		this.dailyStart = dailyStart;
	}

	public String getPropertyShortName() {
		return this.propertyShortName;
	}
	public void setPropertyShortName(String propertyShortName) {
		this.propertyShortName = propertyShortName;
	}

	public Date getServiceEnd() {
		return this.serviceEnd;
	}
	public void setServiceEnd(Date serviceEnd) {
		this.serviceEnd = serviceEnd;
	}

	public Date getServiceStart() {
		return this.serviceStart;
	}
	public void setServiceStart(Date serviceStart) {
		this.serviceStart = serviceStart;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
