package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序基于模板上传版本
 *
 * @author auto create
 * @since 1.0, 2020-10-01 15:57:05
 */
public class AlipayOpenMiniVersionUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8164912487284428788L;

	/**
	 * 商家小程序版本号。版本号必须满足 x.y.z, 且均为数字。要求版本号比商户之前最新的版本号高。
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序投放的端参数，默认支付宝端 。支持：com.alipay.alipaywallet：支付宝端。
com.alipay.iot.xpaas：支付宝IoT端。
例如投放到支付宝钱包是支付宝端。
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 模板的配置参数，ISV 自定义。传入后实例化的小程序会生成一个 ext.json 的文件，ext.json 会覆盖 app.json 中的相同字段，不相同字段合并生效。
在小程序可以通过my.getExtConfigSync().key获取字段（建议支付宝版本 > 10.1.38，并使用 my.canIUse 做兼容处理）。
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 小程序模板 APPID。
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 小程序模板版本号。版本号必须满足 x.y.z, 且均为数字。不传默认使用最新在架（已上架）模板版本。
	 */
	@ApiField("template_version")
	private String templateVersion;

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

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

}
