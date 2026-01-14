package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 媒体报表数据
 *
 * @author auto create
 * @since 1.0, 2025-01-15 17:17:40
 */
public class MediaReportDetail extends AlipayObject {

	private static final long serialVersionUID = 4771553638214113372L;

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
	 * 广告位类型
	 */
	@ApiField("ad_pos_type")
	private String adPosType;

	/**
	 * 广告位类型名称
	 */
	@ApiField("ad_pos_type_name")
	private String adPosTypeName;

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
	 * 组件被展现的总次数
	 */
	@ApiField("component_exposure")
	private Long componentExposure;

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

	/**
	 * 展位码列表
	 */
	@ApiField("space_code_list")
	private String spaceCodeList;

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

	public String getAdPosType() {
		return this.adPosType;
	}
	public void setAdPosType(String adPosType) {
		this.adPosType = adPosType;
	}

	public String getAdPosTypeName() {
		return this.adPosTypeName;
	}
	public void setAdPosTypeName(String adPosTypeName) {
		this.adPosTypeName = adPosTypeName;
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

	public Long getComponentExposure() {
		return this.componentExposure;
	}
	public void setComponentExposure(Long componentExposure) {
		this.componentExposure = componentExposure;
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

	public String getSpaceCodeList() {
		return this.spaceCodeList;
	}
	public void setSpaceCodeList(String spaceCodeList) {
		this.spaceCodeList = spaceCodeList;
	}

}
