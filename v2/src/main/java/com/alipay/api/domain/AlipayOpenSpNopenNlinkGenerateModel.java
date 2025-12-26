package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N链接释放
 *
 * @author auto create
 * @since 1.0, 2025-11-28 16:22:41
 */
public class AlipayOpenSpNopenNlinkGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 5212526218573966798L;

	/**
	 * 设备adid
	 */
	@ApiField("device_ad_id")
	private String deviceAdId;

	/**
	 * 设备tid，有则必传
	 */
	@ApiField("device_biz_tid")
	private String deviceBizTid;

	/**
	 * 设备itemId
	 */
	@ApiField("device_item_id")
	private String deviceItemId;

	/**
	 * 设备SN，该字段必传，特殊场景和业务沟通，避免获取链接失败
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 模组itemId
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 模组mcuid
	 */
	@ApiField("mcu_id")
	private String mcuId;

	/**
	 * 链接模版
	 */
	@ApiField("n_link_template_code")
	private String nLinkTemplateCode;

	/**
	 * 模组se芯片id
	 */
	@ApiField("se_uuid")
	private String seUuid;

	/**
	 * 模组SN
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

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

	public String getMcuId() {
		return this.mcuId;
	}
	public void setMcuId(String mcuId) {
		this.mcuId = mcuId;
	}

	public String getnLinkTemplateCode() {
		return this.nLinkTemplateCode;
	}
	public void setnLinkTemplateCode(String nLinkTemplateCode) {
		this.nLinkTemplateCode = nLinkTemplateCode;
	}

	public String getSeUuid() {
		return this.seUuid;
	}
	public void setSeUuid(String seUuid) {
		this.seUuid = seUuid;
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

}
