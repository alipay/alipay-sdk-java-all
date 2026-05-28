package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N模组返厂解绑
 *
 * @author auto create
 * @since 1.0, 2026-04-29 19:32:48
 */
public class AlipayOpenSpNopenModuleUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 1565589555352319644L;

	/**
	 * 上位机 itemId 必传
	 */
	@ApiField("device_item_id")
	private String deviceItemId;

	/**
	 * 绑定的上位机sn 必传
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 模组 item_Id必传
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 模组 mcu_id必传
	 */
	@ApiField("mcu_id")
	private String mcuId;

	/**
	 * 是否删除已生成的N链接，请求Y表示删除，请求N或不传表示不删除
	 */
	@ApiField("regenerate_link")
	private String regenerateLink;

	/**
	 * 模组有 se_uuid 必传
	 */
	@ApiField("se_uuid")
	private String seUuid;

	/**
	 * 模组有 sn 必传，如碰有源线圈
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 模组供应商 Id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 模组链接模板
	 */
	@ApiField("template_code")
	private String templateCode;

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

	public String getRegenerateLink() {
		return this.regenerateLink;
	}
	public void setRegenerateLink(String regenerateLink) {
		this.regenerateLink = regenerateLink;
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

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
