package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交换中心JSAPI查询
 *
 * @author auto create
 * @since 1.0, 2019-12-26 18:14:30
 */
public class AlipayOpenMiniAliminiabilityprodJsapiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2586498197617486679L;

	/**
	 * 来源端,高德:com.amap.app,IOT:com.alipay.iot.xpaas,微博:com.weibo.app,优酷:com.youku.app,网商银行:com.mybank.phone,菜鸟:com.cainiao.app,天猫精灵:com.alibaba.ailabs.genie.webapps,UC:com.uc.app,支付宝:com.alipay.alipaywallet,口碑:com.koubei.mobile.KoubeiClient,财富:com.alipay.antfortune,学习强国:com.xuexi.app,支付宝香港:com.alipay.wallethk
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 英文名称
	 */
	@ApiField("en_name")
	private String enName;

	/**
	 * 交换中心接口版本
	 */
	@ApiField("instance_version")
	private String instanceVersion;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getEnName() {
		return this.enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getInstanceVersion() {
		return this.instanceVersion;
	}
	public void setInstanceVersion(String instanceVersion) {
		this.instanceVersion = instanceVersion;
	}

}
