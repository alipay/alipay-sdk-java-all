package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回语音播报数据Item
 *
 * @author auto create
 * @since 1.0, 2025-10-13 13:10:46
 */
public class BroadcastReportItem extends AlipayObject {

	private static final long serialVersionUID = 5446488516786163439L;

	/**
	 * 设备激活时间（查询条件，日期选择组件）
	 */
	@ApiField("biz_active_time")
	private Date bizActiveTime;

	/**
	 * 设备碰激活时间
	 */
	@ApiField("biz_touch_active_time")
	private String bizTouchActiveTime;

	/**
	 * 设备模式
	 */
	@ApiField("coop_mode")
	private String coopMode;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 首次营销播报时间（2025年7月1日起首次播报时间）
	 */
	@ApiField("first_marketing_broadcast")
	private Date firstMarketingBroadcast;

	/**
	 * 音箱类型
	 */
	@ApiField("is_have_jl_coil")
	private String isHaveJlCoil;

	/**
	 * 设备归属服务商pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商户SMID
	 */
	@ApiField("last_bind_merchant_id")
	private String lastBindMerchantId;

	/**
	 * 当月营销播报次数
	 */
	@ApiField("monthly_marketing_count")
	private Long monthlyMarketingCount;

	/**
	 * 累计有效碰交易笔数
	 */
	@ApiField("monthly_touch_tx_count_above_2")
	private String monthlyTouchTxCountAbove2;

	/**
	 * 累计有效交易笔数
	 */
	@ApiField("monthly_tx_count_above_2")
	private Long monthlyTxCountAbove2;

	/**
	 * 设备外部补充ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 线圈tagid
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 作业日期范围
	 */
	@ApiField("work_date_range")
	private String workDateRange;

	public Date getBizActiveTime() {
		return this.bizActiveTime;
	}
	public void setBizActiveTime(Date bizActiveTime) {
		this.bizActiveTime = bizActiveTime;
	}

	public String getBizTouchActiveTime() {
		return this.bizTouchActiveTime;
	}
	public void setBizTouchActiveTime(String bizTouchActiveTime) {
		this.bizTouchActiveTime = bizTouchActiveTime;
	}

	public String getCoopMode() {
		return this.coopMode;
	}
	public void setCoopMode(String coopMode) {
		this.coopMode = coopMode;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public Date getFirstMarketingBroadcast() {
		return this.firstMarketingBroadcast;
	}
	public void setFirstMarketingBroadcast(Date firstMarketingBroadcast) {
		this.firstMarketingBroadcast = firstMarketingBroadcast;
	}

	public String getIsHaveJlCoil() {
		return this.isHaveJlCoil;
	}
	public void setIsHaveJlCoil(String isHaveJlCoil) {
		this.isHaveJlCoil = isHaveJlCoil;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getLastBindMerchantId() {
		return this.lastBindMerchantId;
	}
	public void setLastBindMerchantId(String lastBindMerchantId) {
		this.lastBindMerchantId = lastBindMerchantId;
	}

	public Long getMonthlyMarketingCount() {
		return this.monthlyMarketingCount;
	}
	public void setMonthlyMarketingCount(Long monthlyMarketingCount) {
		this.monthlyMarketingCount = monthlyMarketingCount;
	}

	public String getMonthlyTouchTxCountAbove2() {
		return this.monthlyTouchTxCountAbove2;
	}
	public void setMonthlyTouchTxCountAbove2(String monthlyTouchTxCountAbove2) {
		this.monthlyTouchTxCountAbove2 = monthlyTouchTxCountAbove2;
	}

	public Long getMonthlyTxCountAbove2() {
		return this.monthlyTxCountAbove2;
	}
	public void setMonthlyTxCountAbove2(Long monthlyTxCountAbove2) {
		this.monthlyTxCountAbove2 = monthlyTxCountAbove2;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getWorkDateRange() {
		return this.workDateRange;
	}
	public void setWorkDateRange(String workDateRange) {
		this.workDateRange = workDateRange;
	}

}
