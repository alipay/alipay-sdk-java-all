package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险产品资源项
 *
 * @author auto create
 * @since 1.0, 2019-12-09 15:22:25
 */
public class InsProdResource extends AlipayObject {

	private static final long serialVersionUID = 8748988261228785185L;

	/**
	 * 资源项标识符;insMustKnow:投保须知,productTerm:产品条款,insAgreement:投保协议,insAgreementH5:投保协议H5,healthMustKnow:健康告知,announcement:重要告知,productFeature:产品特色,productFeatureDetail:产品特色详情,insTermUrl:保险条款链接,relativeFileUrl:相关文件链接,claimFlow:理赔流程,productImage:产品图片,productImageSmall:产品小图片,productIcon:产品图标,insDetail:投保详情,claimDetail:理赔详情,insDetailDigest:投保详情摘要,electronicPolicyUrl:电子保单地址.
	 */
	@ApiField("key")
	private String key;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 资源类型;text:文本;url:URL;
	 */
	@ApiField("type")
	private String type;

	/**
	 * 值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
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

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
