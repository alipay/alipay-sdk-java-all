package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交换中心JSAPI更新
 *
 * @author auto create
 * @since 1.0, 2019-12-26 18:17:03
 */
public class AlipayOpenMiniAliminiabilityprodJsapiModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2446775486546241428L;

	/**
	 * appx最低版本
	 */
	@ApiField("appx_min_version")
	private String appxMinVersion;

	/**
	 * 来源端,高德:com.amap.app,IOT:com.alipay.iot.xpaas,微博:com.weibo.app,优酷:com.youku.app,网商银行:com.mybank.phone,菜鸟:com.cainiao.app,天猫精灵:com.alibaba.ailabs.genie.webapps,UC:com.uc.app,支付宝:com.alipay.alipaywallet,口碑:com.koubei.mobile.KoubeiClient,财富:com.alipay.antfortune,学习强国:com.xuexi.app,支付宝香港:com.alipay.wallethk,手淘:com.taobao.app
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 客户端最低版本
	 */
	@ApiField("bundle_min_version")
	private String bundleMinVersion;

	/**
	 * DemoUrl
	 */
	@ApiField("demo_url")
	private String demoUrl;

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

	/**
	 * 域账号
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 已发布:published,已删除:deleted
	 */
	@ApiField("status")
	private String status;

	public String getAppxMinVersion() {
		return this.appxMinVersion;
	}
	public void setAppxMinVersion(String appxMinVersion) {
		this.appxMinVersion = appxMinVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getBundleMinVersion() {
		return this.bundleMinVersion;
	}
	public void setBundleMinVersion(String bundleMinVersion) {
		this.bundleMinVersion = bundleMinVersion;
	}

	public String getDemoUrl() {
		return this.demoUrl;
	}
	public void setDemoUrl(String demoUrl) {
		this.demoUrl = demoUrl;
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

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
