package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流碰一下设备下线接口处理器
 *
 * @author auto create
 * @since 1.0, 2026-06-03 16:12:53
 */
public class AlipayCommerceLogisticsPointTagOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 4379892665718482413L;

	/**
	 * 物流行业线圈ID
	 */
	@ApiField("logistics_nfc_id")
	private String logisticsNfcId;

	/**
	 * n6设备的下线时间
	 */
	@ApiField("offline_time")
	private Date offlineTime;

	/**
	 * 下线类型
	 */
	@ApiField("offline_type")
	private String offlineType;

	/**
	 * n6设备ID
	 */
	@ApiField("sn_id")
	private String snId;

	/**
	 * 作业租户码
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getLogisticsNfcId() {
		return this.logisticsNfcId;
	}
	public void setLogisticsNfcId(String logisticsNfcId) {
		this.logisticsNfcId = logisticsNfcId;
	}

	public Date getOfflineTime() {
		return this.offlineTime;
	}
	public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
	}

	public String getOfflineType() {
		return this.offlineType;
	}
	public void setOfflineType(String offlineType) {
		this.offlineType = offlineType;
	}

	public String getSnId() {
		return this.snId;
	}
	public void setSnId(String snId) {
		this.snId = snId;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
