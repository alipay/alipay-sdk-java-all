package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电动车绑定信息
 *
 * @author auto create
 * @since 1.0, 2023-06-05 15:39:51
 */
public class EbikeBindInfo extends AlipayObject {

	private static final long serialVersionUID = 7145545954694347971L;

	/**
	 * 电动车品牌唯一标识
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 电动车品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 设备是否支持上报里程
	 */
	@ApiField("can_report_riding_distance")
	private Boolean canReportRidingDistance;

	/**
	 * 智能电动车名称
	 */
	@ApiField("ebike_name")
	private String ebikeName;

	/**
	 * 智能电动车编号
	 */
	@ApiField("ebike_no")
	private String ebikeNo;

	/**
	 * 车类型（4G车/蓝牙车/非智能车）
	 */
	@ApiField("ebike_type")
	private String ebikeType;

	/**
	 * 绑定状态
	 */
	@ApiField("is_bind")
	private Boolean isBind;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Boolean getCanReportRidingDistance() {
		return this.canReportRidingDistance;
	}
	public void setCanReportRidingDistance(Boolean canReportRidingDistance) {
		this.canReportRidingDistance = canReportRidingDistance;
	}

	public String getEbikeName() {
		return this.ebikeName;
	}
	public void setEbikeName(String ebikeName) {
		this.ebikeName = ebikeName;
	}

	public String getEbikeNo() {
		return this.ebikeNo;
	}
	public void setEbikeNo(String ebikeNo) {
		this.ebikeNo = ebikeNo;
	}

	public String getEbikeType() {
		return this.ebikeType;
	}
	public void setEbikeType(String ebikeType) {
		this.ebikeType = ebikeType;
	}

	public Boolean getIsBind() {
		return this.isBind;
	}
	public void setIsBind(Boolean isBind) {
		this.isBind = isBind;
	}

}
