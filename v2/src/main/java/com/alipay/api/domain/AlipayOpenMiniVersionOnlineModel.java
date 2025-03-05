package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序上架
 *
 * @author auto create
 * @since 1.0, 2024-09-04 09:47:16
 */
public class AlipayOpenMiniVersionOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 3315197557624591128L;

	/**
	 * 商家小程序版本号，需为审核通过状态或灰度中版本。
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序客户端类型，默认为支付宝端。常见支持如下客户端：
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
	 * true - 性能优先； false - 覆盖优先（默认）
	 */
	@ApiField("downgrade")
	private Boolean downgrade;

	/**
	 * 如果该字段为true，在首次发版的小程序在备案未完成的情况下，允许小程序上架，但小程序上架后只可以上架可扫码进行使用，但不可被搜索、限制访问人数（50人/每天）、限制公域（无法进行商品、服务、营促销）、限制上架后90天不完成备案自动下架。
默认为false
	 */
	@ApiField("permit_registration_limit_release")
	private Boolean permitRegistrationLimitRelease;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public Boolean getDowngrade() {
		return this.downgrade;
	}
	public void setDowngrade(Boolean downgrade) {
		this.downgrade = downgrade;
	}

	public Boolean getPermitRegistrationLimitRelease() {
		return this.permitRegistrationLimitRelease;
	}
	public void setPermitRegistrationLimitRelease(Boolean permitRegistrationLimitRelease) {
		this.permitRegistrationLimitRelease = permitRegistrationLimitRelease;
	}

}
