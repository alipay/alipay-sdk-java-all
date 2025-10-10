package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集团通用入驻链路提交资料
 *
 * @author auto create
 * @since 1.0, 2024-04-11 14:09:05
 */
public class AlipayMerchantGroupEntryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2615481745554515563L;

	/**
	 * 集团入驻单号
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 有无营业执照
	 */
	@ApiField("have_business")
	private Boolean haveBusiness;

	/**
	 * 集团入驻成功后，期望跳转的地址
	 */
	@ApiField("jump_link")
	private String jumpLink;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Boolean getHaveBusiness() {
		return this.haveBusiness;
	}
	public void setHaveBusiness(Boolean haveBusiness) {
		this.haveBusiness = haveBusiness;
	}

	public String getJumpLink() {
		return this.jumpLink;
	}
	public void setJumpLink(String jumpLink) {
		this.jumpLink = jumpLink;
	}

}
