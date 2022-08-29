package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拓展内容model
 *
 * @author auto create
 * @since 1.0, 2019-03-08 11:47:14
 */
public class ContentExtensionForOpenapi extends AlipayObject {

	private static final long serialVersionUID = 5843342471637282158L;

	/**
	 * 扩展信息正文,新建内容的扩展信息存入这个字段。
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 扩展类型,新建内容的扩展类型。RICH_TEXT，代表富文本。
	 */
	@ApiField("extension_type")
	private String extensionType;

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getExtensionType() {
		return this.extensionType;
	}
	public void setExtensionType(String extensionType) {
		this.extensionType = extensionType;
	}

}
