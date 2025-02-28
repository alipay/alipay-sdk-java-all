package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GiftUserTemplateBoxInfo;
import com.alipay.api.domain.GiftUserTemplateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.template.user.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-09 10:56:47
 */
public class AlipayFundCouponTemplateUserCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1237553523552966844L;

	/** 
	 * 用户封面容器信息，包含封面生效时间区间以及封面、封底等图片、视频资源
	 */
	@ApiField("gift_user_template_box_info")
	private GiftUserTemplateBoxInfo giftUserTemplateBoxInfo;

	/** 
	 * 红包封面模板信息
	 */
	@ApiField("template_info")
	private GiftUserTemplateInfo templateInfo;

	/** 
	 * 和user_id一起，唯一标识发放给该用户的一个红包封面实例，需要业务方记录维护用户该封面实例的状态
	 */
	@ApiField("user_template_id")
	private String userTemplateId;

	public void setGiftUserTemplateBoxInfo(GiftUserTemplateBoxInfo giftUserTemplateBoxInfo) {
		this.giftUserTemplateBoxInfo = giftUserTemplateBoxInfo;
	}
	public GiftUserTemplateBoxInfo getGiftUserTemplateBoxInfo( ) {
		return this.giftUserTemplateBoxInfo;
	}

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
