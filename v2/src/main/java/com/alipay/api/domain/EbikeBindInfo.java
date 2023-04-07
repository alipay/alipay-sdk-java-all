package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电动车绑定信息
 *
 * @author auto create
 * @since 1.0, 2022-12-22 14:17:31
 */
public class EbikeBindInfo extends AlipayObject {

	private static final long serialVersionUID = 2395415596422676176L;

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

	public Boolean getIsBind() {
		return this.isBind;
	}
	public void setIsBind(Boolean isBind) {
		this.isBind = isBind;
	}

}
