package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 媒体报表数据
 *
 * @author auto create
 * @since 1.0, 2024-10-10 11:42:03
 */
public class MediaReportDetail extends AlipayObject {

	private static final long serialVersionUID = 7598892764514324511L;

	/**
	 * 广告位id，如：2023xxxxxxx
	 */
	@ApiField("ad_pos_id")
	private String adPosId;

	/**
	 * 广告位名称
	 */
	@ApiField("ad_pos_name")
	private String adPosName;

	/**
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用id
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * 点击pv
	 */
	@ApiField("click")
	private Long click;

	/**
	 * 点击率
	 */
	@ApiField("click_rate")
	private String clickRate;

	/**
	 * 资源位维度预估cpm,千次曝光收入
	 */
	@ApiField("cpm")
	private String cpm;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 分润前预估广告收入，单位：元
	 */
	@ApiField("es_income")
	private String esIncome;

	/**
	 * 曝光pv
	 */
	@ApiField("exposure")
	private Long exposure;

	public String getAdPosId() {
		return this.adPosId;
	}
	public void setAdPosId(String adPosId) {
		this.adPosId = adPosId;
	}

	public String getAdPosName() {
		return this.adPosName;
	}
	public void setAdPosName(String adPosName) {
		this.adPosName = adPosName;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public Long getClick() {
		return this.click;
	}
	public void setClick(Long click) {
		this.click = click;
	}

	public String getClickRate() {
		return this.clickRate;
	}
	public void setClickRate(String clickRate) {
		this.clickRate = clickRate;
	}

	public String getCpm() {
		return this.cpm;
	}
	public void setCpm(String cpm) {
		this.cpm = cpm;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getEsIncome() {
		return this.esIncome;
	}
	public void setEsIncome(String esIncome) {
		this.esIncome = esIncome;
	}

	public Long getExposure() {
		return this.exposure;
	}
	public void setExposure(Long exposure) {
		this.exposure = exposure;
	}

}
