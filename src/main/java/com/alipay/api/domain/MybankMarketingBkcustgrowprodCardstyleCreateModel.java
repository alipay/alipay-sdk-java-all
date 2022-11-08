package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商卡皮肤创建
 *
 * @author auto create
 * @since 1.0, 2022-09-26 18:14:56
 */
public class MybankMarketingBkcustgrowprodCardstyleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3389591193589275618L;

	/**
	 * alipay_user_id, 不唯一，用于卡皮肤创建，无枚举值，支付宝uid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * link_resource，跳转地址url，不唯一，无枚举值，特殊可选，当need_link为true时，该字段必填
	 */
	@ApiField("link_resource")
	private String linkResource;

	/**
	 * need_link，是否需要跳转，不唯一，无枚举值，Boolean类型，不传默认为false
	 */
	@ApiField("need_link")
	private Boolean needLink;

	/**
	 * selected, 是否选中，不唯一，Boolean类型，不传默认为false
	 */
	@ApiField("selected")
	private Boolean selected;

	/**
	 * source，调用方，不唯一，用于识别调用方，无枚举值，此字段必传
	 */
	@ApiField("source")
	private String source;

	/**
	 * style_origin_id，资源原始id，不唯一，无枚举值，对应水母原始订单号，此字段必传
	 */
	@ApiField("style_origin_id")
	private String styleOriginId;

	/**
	 * style_resource,网商卡皮肤url地址，不唯一，无枚举值，此字段必传
	 */
	@ApiField("style_resource")
	private String styleResource;

	/**
	 * template_id，网商皮肤模版id，不唯一，无枚举值，有网商进行分配，此字段必传
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getLinkResource() {
		return this.linkResource;
	}
	public void setLinkResource(String linkResource) {
		this.linkResource = linkResource;
	}

	public Boolean getNeedLink() {
		return this.needLink;
	}
	public void setNeedLink(Boolean needLink) {
		this.needLink = needLink;
	}

	public Boolean getSelected() {
		return this.selected;
	}
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStyleOriginId() {
		return this.styleOriginId;
	}
	public void setStyleOriginId(String styleOriginId) {
		this.styleOriginId = styleOriginId;
	}

	public String getStyleResource() {
		return this.styleResource;
	}
	public void setStyleResource(String styleResource) {
		this.styleResource = styleResource;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
