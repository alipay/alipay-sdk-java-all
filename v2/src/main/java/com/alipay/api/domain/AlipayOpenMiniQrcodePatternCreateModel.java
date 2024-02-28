package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建关联普通二维码模式
 *
 * @author auto create
 * @since 1.0, 2023-09-14 11:45:49
 */
public class AlipayOpenMiniQrcodePatternCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6515324894174622526L;

	/**
	 * 调用类型，目前支持三种调用类型：DELEGATE、MERCHANT和ISV，不同调用类型会导致模式归属者不同
	 */
	@ApiField("invoke_type")
	private String invokeType;

	/**
	 * 模式，用于描述通用的路由url格式，适用于同一个host下面存在大量路由的场景，主要用于提升路由性能，其中{0}、{1} 代表路径中的变量
	 */
	@ApiField("pattern_url")
	private String patternUrl;

	/**
	 * 模板小程序ID。当invoke_type为DELEGATE或者ISV时，需要指定模板小程序的ID，用于校验模式的host是否存在于该模板小程序普通链接二维码的已验证列表中；当invoke_type为MERCHANT时，需要确保模式host所在的域名服务器根目录下放置了校验文件
	 */
	@ApiField("template_id")
	private String templateId;

	public String getInvokeType() {
		return this.invokeType;
	}
	public void setInvokeType(String invokeType) {
		this.invokeType = invokeType;
	}

	public String getPatternUrl() {
		return this.patternUrl;
	}
	public void setPatternUrl(String patternUrl) {
		this.patternUrl = patternUrl;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
