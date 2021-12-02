package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * bpaas应用分发信息同步
 *
 * @author auto create
 * @since 1.0, 2021-03-22 09:58:28
 */
public class AlipayOpenBpaasPushSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1553585611155235551L;

	/**
	 * bpaas应用ID
	 */
	@ApiField("bpaas_app_id")
	private String bpaasAppId;

	/**
	 * 应用版本号
	 */
	@ApiField("bpaas_app_version")
	private String bpaasAppVersion;

	/**
	 * 设备SN，支持同一个厂商的SN批量反馈；数组限制最大100
	 */
	@ApiListField("device_sn")
	@ApiField("string")
	private List<String> deviceSn;

	/**
	 * 厂商ID，需要和设备端的生产商ID保持一致
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getBpaasAppId() {
		return this.bpaasAppId;
	}
	public void setBpaasAppId(String bpaasAppId) {
		this.bpaasAppId = bpaasAppId;
	}

	public String getBpaasAppVersion() {
		return this.bpaasAppVersion;
	}
	public void setBpaasAppVersion(String bpaasAppVersion) {
		this.bpaasAppVersion = bpaasAppVersion;
	}

	public List<String> getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(List<String> deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
