package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N模组绑定上位机
 *
 * @author auto create
 * @since 1.0, 2026-04-29 19:32:48
 */
public class AlipayOpenSpNopenModuleBindModel extends AlipayObject {

	private static final long serialVersionUID = 7355148525999443974L;

	/**
	 * 设备 adid
	 */
	@ApiField("device_ad_id")
	private String deviceAdId;

	/**
	 * 设备 bizTid
	 */
	@ApiField("device_biz_tid")
	private String deviceBizTid;

	/**
	 * 上位机设备 itemId
	 */
	@ApiField("device_item_id")
	private String deviceItemId;

	/**
	 * 上位机设备 SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 模组 itemId
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 模组 SN（与 url 二选一，必须传且仅传一个）
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 供应商 ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 模组 URL（与 sn 二选一，必须传且仅传一个）
	 */
	@ApiField("url")
	private String url;

	public String getDeviceAdId() {
		return this.deviceAdId;
	}
	public void setDeviceAdId(String deviceAdId) {
		this.deviceAdId = deviceAdId;
	}

	public String getDeviceBizTid() {
		return this.deviceBizTid;
	}
	public void setDeviceBizTid(String deviceBizTid) {
		this.deviceBizTid = deviceBizTid;
	}

	public String getDeviceItemId() {
		return this.deviceItemId;
	}
	public void setDeviceItemId(String deviceItemId) {
		this.deviceItemId = deviceItemId;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
