package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰音箱激活时间模型，用于服务商激活时间的透出查询
 *
 * @author auto create
 * @since 1.0, 2025-12-19 10:15:10
 */
public class SpeakerActivityItem extends AlipayObject {

	private static final long serialVersionUID = 8512563255894722352L;

	/**
	 * 设备碰激活时间
	 */
	@ApiField("biz_touch_active_time")
	private Date bizTouchActiveTime;

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
	 * 设备绑定时间
	 */
	@ApiField("first_bind_time")
	private Date firstBindTime;

	/**
	 * 商户SMI
	 */
	@ApiField("last_bind_merchant_id")
	private String lastBindMerchantId;

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

	public Date getBizTouchActiveTime() {
		return this.bizTouchActiveTime;
	}
	public void setBizTouchActiveTime(Date bizTouchActiveTime) {
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

	public Date getFirstBindTime() {
		return this.firstBindTime;
	}
	public void setFirstBindTime(Date firstBindTime) {
		this.firstBindTime = firstBindTime;
	}

	public String getLastBindMerchantId() {
		return this.lastBindMerchantId;
	}
	public void setLastBindMerchantId(String lastBindMerchantId) {
		this.lastBindMerchantId = lastBindMerchantId;
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

}
