package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GiftUserTemplateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.template.user.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-28 16:17:51
 */
public class AlipayFundCouponTemplateUserCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5342732281314733738L;

	/** 
	 * 红包皮肤模板信息
	 */
	@ApiField("template_info")
	private GiftUserTemplateInfo templateInfo;

	/** 
	 * 和user_id一起，唯一标识发放给该用户的一个红包皮肤实例，需要业务方记录维护用户该皮肤实例的状态
	 */
	@ApiField("user_template_id")
	private String userTemplateId;

	public void setTemplateInfo(GiftUserTemplateInfo templateInfo) {
		this.templateInfo = templateInfo;
	}
	public GiftUserTemplateInfo getTemplateInfo( ) {
		return this.templateInfo;
	}

	public void setUserTemplateId(String userTemplateId) {
		this.userTemplateId = userTemplateId;
	}
	public String getUserTemplateId( ) {
		return this.userTemplateId;
	}

}
