package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GiftUserTemplateBoxInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.template.merchant.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:31:48
 */
public class AlipayFundCouponTemplateMerchantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3769377627691834355L;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 封面模型列表
	 */
	@ApiListField("templates")
	@ApiField("gift_user_template_box_info")
	private List<GiftUserTemplateBoxInfo> templates;

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setTemplates(List<GiftUserTemplateBoxInfo> templates) {
		this.templates = templates;
	}
	public List<GiftUserTemplateBoxInfo> getTemplates( ) {
		return this.templates;
	}

}
