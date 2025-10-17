package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 尚闻流量卡全量信息同步
 *
 * @author auto create
 * @since 1.0, 2025-06-11 16:41:35
 */
public class AlipayTerminalEdgecloudSwnetflowCardfullSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6662652536278615154L;

	/**
	 * 卡激活时间
	 */
	@ApiField("active_time")
	private String activeTime;

	/**
	 * 卡池套餐周期，例如年包，月包
	 */
	@ApiField("biling_cycle")
	private String bilingCycle;

	/**
	 * 卡状态
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * 流量卡套餐名称，用于获取档位信息
	 */
	@ApiField("credential_name")
	private String credentialName;

	/**
	 * 卡池套餐档位信息，例如：单卡通用流量、单卡运营商定向流量
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 卡销户时间
	 */
	@ApiField("destroy_time")
	private String destroyTime;

	/**
	 * 流量状态
	 */
	@ApiField("gprs_status")
	private String gprsStatus;

	/**
	 * 流量卡id
	 */
	@ApiField("icc_id")
	private String iccId;

	/**
	 * 设备IMEI
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 流量是否超标
	 */
	@ApiField("is_over_limit")
	private String isOverLimit;

	/**
	 * 套餐到期时间
	 */
	@ApiField("last_stop_date")
	private String lastStopDate;

	/**
	 * 卡的网络状态
	 */
	@ApiField("os_status")
	private String osStatus;

	/**
	 * 流量卡池id
	 */
	@ApiField("pool_id")
	private String poolId;

	/**
	 * 用户查询尚闻订单唯一表示标识
	 */
	@ApiField("sw_order_id")
	private String swOrderId;

	/**
	 * 卡总流量，单位KB。
	 */
	@ApiField("total_flow_amount")
	private String totalFlowAmount;

	/**
	 * 卡运营商
	 */
	@ApiField("vendor_id")
	private String vendorId;

	public String getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}

	public String getBilingCycle() {
		return this.bilingCycle;
	}
	public void setBilingCycle(String bilingCycle) {
		this.bilingCycle = bilingCycle;
	}

	public String getCardStatus() {
		return this.cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCredentialName() {
		return this.credentialName;
	}
	public void setCredentialName(String credentialName) {
		this.credentialName = credentialName;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDestroyTime() {
		return this.destroyTime;
	}
	public void setDestroyTime(String destroyTime) {
		this.destroyTime = destroyTime;
	}

	public String getGprsStatus() {
		return this.gprsStatus;
	}
	public void setGprsStatus(String gprsStatus) {
		this.gprsStatus = gprsStatus;
	}

	public String getIccId() {
		return this.iccId;
	}
	public void setIccId(String iccId) {
		this.iccId = iccId;
	}

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getIsOverLimit() {
		return this.isOverLimit;
	}
	public void setIsOverLimit(String isOverLimit) {
		this.isOverLimit = isOverLimit;
	}

	public String getLastStopDate() {
		return this.lastStopDate;
	}
	public void setLastStopDate(String lastStopDate) {
		this.lastStopDate = lastStopDate;
	}

	public String getOsStatus() {
		return this.osStatus;
	}
	public void setOsStatus(String osStatus) {
		this.osStatus = osStatus;
	}

	public String getPoolId() {
		return this.poolId;
	}
	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}

	public String getSwOrderId() {
		return this.swOrderId;
	}
	public void setSwOrderId(String swOrderId) {
		this.swOrderId = swOrderId;
	}

	public String getTotalFlowAmount() {
		return this.totalFlowAmount;
	}
	public void setTotalFlowAmount(String totalFlowAmount) {
		this.totalFlowAmount = totalFlowAmount;
	}

	public String getVendorId() {
		return this.vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

}
