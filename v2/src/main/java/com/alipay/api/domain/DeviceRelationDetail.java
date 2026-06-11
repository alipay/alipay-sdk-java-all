package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备关联信息
 *
 * @author auto create
 * @since 1.0, 2026-06-10 11:05:04
 */
public class DeviceRelationDetail extends AlipayObject {

	private static final long serialVersionUID = 3889252966244754765L;

	/**
	 * 设备SN号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备关联的服务商pid
	 */
	@ApiField("related_pid")
	private String relatedPid;

	/**
	 * 设备供应商id,用于区分设备类型
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 设备TagSN编号
	 */
	@ApiField("tag_sn")
	private String tagSn;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getRelatedPid() {
		return this.relatedPid;
	}
	public void setRelatedPid(String relatedPid) {
		this.relatedPid = relatedPid;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getTagSn() {
		return this.tagSn;
	}
	public void setTagSn(String tagSn) {
		this.tagSn = tagSn;
	}

}
