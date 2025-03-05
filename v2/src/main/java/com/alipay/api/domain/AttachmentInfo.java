package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户附件信息
 *
 * @author auto create
 * @since 1.0, 2017-09-23 20:47:16
 */
public class AttachmentInfo extends AlipayObject {

	private static final long serialVersionUID = 7472479926584488255L;

	/**
	 * 支付宝返回的图片在文件存储平台的标识
	 */
	@ApiField("atta_url")
	private String attaUrl;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 附件类型,PROMO_PIC:营销物料照
	 */
	@ApiField("type")
	private String type;

	public String getAttaUrl() {
		return this.attaUrl;
	}
	public void setAttaUrl(String attaUrl) {
		this.attaUrl = attaUrl;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
