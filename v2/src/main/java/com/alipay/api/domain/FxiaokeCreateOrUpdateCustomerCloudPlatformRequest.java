package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客户云平台信息
 *
 * @author auto create
 * @since 1.0, 2025-09-28 17:30:25
 */
public class FxiaokeCreateOrUpdateCustomerCloudPlatformRequest extends AlipayObject {

	private static final long serialVersionUID = 7574147549454648624L;

	/**
	 * 客户编码（唯一）
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 主属性
	 */
	@ApiField("crm_code")
	private String crmCode;

	/**
	 * 现有云平台
	 */
	@ApiField("current_cloud_platform")
	private String currentCloudPlatform;

	/**
	 * 现有云平台数据库
	 */
	@ApiListField("current_cloud_platform_db")
	@ApiField("string")
	private List<String> currentCloudPlatformDb;

	/**
	 * 现有数据量（GB）
	 */
	@ApiField("current_data_size")
	private String currentDataSize;

	/**
	 * 现有数据库月消耗（元/月）
	 */
	@ApiField("current_db_consumption")
	private String currentDbConsumption;

	/**
	 * 现有云平台总体月消耗（元/月）
	 */
	@ApiField("current_month_consumption_total")
	private String currentMonthConsumptionTotal;

	/**
	 * 生命状态
	 */
	@ApiField("life_status")
	private String lifeStatus;

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCrmCode() {
		return this.crmCode;
	}
	public void setCrmCode(String crmCode) {
		this.crmCode = crmCode;
	}

	public String getCurrentCloudPlatform() {
		return this.currentCloudPlatform;
	}
	public void setCurrentCloudPlatform(String currentCloudPlatform) {
		this.currentCloudPlatform = currentCloudPlatform;
	}

	public List<String> getCurrentCloudPlatformDb() {
		return this.currentCloudPlatformDb;
	}
	public void setCurrentCloudPlatformDb(List<String> currentCloudPlatformDb) {
		this.currentCloudPlatformDb = currentCloudPlatformDb;
	}

	public String getCurrentDataSize() {
		return this.currentDataSize;
	}
	public void setCurrentDataSize(String currentDataSize) {
		this.currentDataSize = currentDataSize;
	}

	public String getCurrentDbConsumption() {
		return this.currentDbConsumption;
	}
	public void setCurrentDbConsumption(String currentDbConsumption) {
		this.currentDbConsumption = currentDbConsumption;
	}

	public String getCurrentMonthConsumptionTotal() {
		return this.currentMonthConsumptionTotal;
	}
	public void setCurrentMonthConsumptionTotal(String currentMonthConsumptionTotal) {
		this.currentMonthConsumptionTotal = currentMonthConsumptionTotal;
	}

	public String getLifeStatus() {
		return this.lifeStatus;
	}
	public void setLifeStatus(String lifeStatus) {
		this.lifeStatus = lifeStatus;
	}

}
