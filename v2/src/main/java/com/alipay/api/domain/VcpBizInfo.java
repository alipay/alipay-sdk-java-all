package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务信息
 *
 * @author auto create
 * @since 1.0, 2026-08-11 14:39:20
 */
public class VcpBizInfo extends AlipayObject {

	private static final long serialVersionUID = 7323588442492347352L;

	/**
	 * 业务标签
	 */
	@ApiListField("biz_tags")
	@ApiField("string")
	private List<String> bizTags;

	/**
	 * 营销内容
	 */
	@ApiField("promo_target")
	private VcpPromoTargetInfo promoTarget;

	public List<String> getBizTags() {
		return this.bizTags;
	}
	public void setBizTags(List<String> bizTags) {
		this.bizTags = bizTags;
	}

	public VcpPromoTargetInfo getPromoTarget() {
		return this.promoTarget;
	}
	public void setPromoTarget(VcpPromoTargetInfo promoTarget) {
		this.promoTarget = promoTarget;
	}

}
