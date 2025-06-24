package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车辆检查报告内容明细
 *
 * @author auto create
 * @since 1.0, 2025-04-01 10:56:19
 */
public class CheckReportData extends AlipayObject {

	private static final long serialVersionUID = 3358914287865819299L;

	/**
	 * 是否支持回购认证， 90 天回购认证
	 */
	@ApiField("buyback_auth")
	private Boolean buybackAuth;

	/**
	 * 报告来源渠道
	 */
	@ApiField("report_origin_code")
	private String reportOriginCode;

	/**
	 * 车辆检测明细
	 */
	@ApiListField("vehicle_check_detail")
	@ApiField("vehicle_check_detail_item")
	private List<VehicleCheckDetailItem> vehicleCheckDetail;

	/**
	 * 第三方质检报告url地址
	 */
	@ApiField("vehicle_check_url")
	private String vehicleCheckUrl;

	/**
	 * 车辆不合适条件。车辆认证；
	 */
	@ApiListField("vehicle_exclusions")
	@ApiField("string")
	private List<String> vehicleExclusions;

	/**
	 * 车辆评分
	 */
	@ApiField("vehicle_score")
	private String vehicleScore;

	public Boolean getBuybackAuth() {
		return this.buybackAuth;
	}
	public void setBuybackAuth(Boolean buybackAuth) {
		this.buybackAuth = buybackAuth;
	}

	public String getReportOriginCode() {
		return this.reportOriginCode;
	}
	public void setReportOriginCode(String reportOriginCode) {
		this.reportOriginCode = reportOriginCode;
	}

	public List<VehicleCheckDetailItem> getVehicleCheckDetail() {
		return this.vehicleCheckDetail;
	}
	public void setVehicleCheckDetail(List<VehicleCheckDetailItem> vehicleCheckDetail) {
		this.vehicleCheckDetail = vehicleCheckDetail;
	}

	public String getVehicleCheckUrl() {
		return this.vehicleCheckUrl;
	}
	public void setVehicleCheckUrl(String vehicleCheckUrl) {
		this.vehicleCheckUrl = vehicleCheckUrl;
	}

	public List<String> getVehicleExclusions() {
		return this.vehicleExclusions;
	}
	public void setVehicleExclusions(List<String> vehicleExclusions) {
		this.vehicleExclusions = vehicleExclusions;
	}

	public String getVehicleScore() {
		return this.vehicleScore;
	}
	public void setVehicleScore(String vehicleScore) {
		this.vehicleScore = vehicleScore;
	}

}
