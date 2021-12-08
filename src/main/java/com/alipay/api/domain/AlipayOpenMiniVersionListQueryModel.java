package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序版本列表查询
 *
 * @author auto create
 * @since 1.0, 2021-12-06 21:52:29
 */
public class AlipayOpenMiniVersionListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1612253198689446613L;

	/**
	 * 端参数，用于查询多端版本，不传默认为支付宝端。
高德端：com.amap.app
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 版本状态列表，用英文逗号","分割，可选；不填默认不返回，状态可选值以及说明如下-INIT: 开发中, AUDITING: 审核中, AUDIT_REJECT: 审核驳回, WAIT_RELEASE: 待上架, GRAY: 灰度中, RELEASE: 已上架, OFFLINE: 已下架, AUDIT_OFFLINE: 已下架;
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
