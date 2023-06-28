package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序版本列表查询
 *
 * @author auto create
 * @since 1.0, 2023-06-21 13:10:51
 */
public class AlipayOpenMiniVersionListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8672677239139961337L;

	/**
	 * 端参数，用于查询多端版本，不传默认为支付宝端。
高德端：com.amap.app
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 版本状态列表，用英文逗号","分割，可选；不填默认不返回。
	 */
	@ApiField("version_status")
	private String versionStatus;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getVersionStatus() {
		return this.versionStatus;
	}
	public void setVersionStatus(String versionStatus) {
		this.versionStatus = versionStatus;
	}

}
