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

	private static final long serialVersionUID = 7348972645941917282L;

	/**
	 * 端参数，用于查询多端版本，不传默认为支付宝端。。常见支持如下客户端：
com.alipay.alipaywallet：支付宝端；
com.alibaba.android.rimet：DINGDING端；
com.amap.app：高德端；
com.alibaba.ailabs.genie.webapps：天猫精灵端；
com.alipay.iot.xpaas：支付宝IoT端。
如需更多端投放，请联系业务BD。
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
