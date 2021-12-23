package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * JsApi基础信息
 *
 * @author auto create
 * @since 1.0, 2019-12-26 14:43:29
 */
public class JsApiBaseDTO extends AlipayObject {

	private static final long serialVersionUID = 8233128311974276196L;

	/**
	 * Appx最低版本
	 */
	@ApiField("appx_min_version")
	private String appxMinVersion;

	/**
	 * 来源端,高德:com.amap.app,IOT:com.alipay.iot.xpaas,微博:com.weibo.app,优酷:com.youku.app,网商银行:com.mybank.phone,菜鸟:com.cainiao.app,天猫精灵:com.alibaba.ailabs.genie.webapps,UC:com.uc.app,支付宝:com.alipay.alipaywallet,口碑:com.koubei.mobile.KoubeiClient,财富:com.alipay.antfortune,学习强国:com.xuexi.app,支付宝香港:com.alipay.wallethk
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 客户端最低版本
	 */
	@ApiField("bundle_min_version")
	private String bundleMinVersion;

	/**
	 * 中文名称
	 */
	@ApiField("cn_name")
	private String cnName;

	/**
	 * DemoURL
	 */
	@ApiField("demo_url")
	private String demoUrl;

	/**
	 * 接口描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 英文名称
	 */
	@ApiField("en_name")
	private String enName;

	/**
	 * 是否是基础类型，是:true,否:false
	 */
	@ApiField("general")
	private Boolean general;

	/**
	 * 是否异步,异步：true,同步:false
	 */
	@ApiField("is_async")
	private Boolean isAsync;

	/**
	 * JSAPI版本
	 */
	@ApiField("jsapi_version")
	private String jsapiVersion;

	/**
	 * private：私有；public：公开；value_add：增值
	 */
	@ApiField("open_range")
	private String openRange;

	/**
	 * 负责人域账号
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 示例代码
	 */
	@ApiField("sample_code")
	private String sampleCode;

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

	public String getCnName() {
		return this.cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	public String getDemoUrl() {
		return this.demoUrl;
	}
	public void setDemoUrl(String demoUrl) {
		this.demoUrl = demoUrl;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnName() {
		return this.enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}

	public Boolean getGeneral() {
		return this.general;
	}
	public void setGeneral(Boolean general) {
		this.general = general;
	}

	public Boolean getIsAsync() {
		return this.isAsync;
	}
	public void setIsAsync(Boolean isAsync) {
		this.isAsync = isAsync;
	}

	public String getJsapiVersion() {
		return this.jsapiVersion;
	}
	public void setJsapiVersion(String jsapiVersion) {
		this.jsapiVersion = jsapiVersion;
	}

	public String getOpenRange() {
		return this.openRange;
	}
	public void setOpenRange(String openRange) {
		this.openRange = openRange;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSampleCode() {
		return this.sampleCode;
	}
	public void setSampleCode(String sampleCode) {
		this.sampleCode = sampleCode;
	}

}
