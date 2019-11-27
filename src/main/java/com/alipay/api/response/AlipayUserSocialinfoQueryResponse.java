package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SocialInfoView;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.socialinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-30 11:30:00
 */
public class AlipayUserSocialinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1497542634781647332L;

	/** 
	 * 头像、昵称信息视图【注意】如果入参中某一userId不存在，返回的视图列表中将不包含该userId对应视图。（举例：入参里10个userId，其中1个userId不存在，则出参列表里有9个视图）
	 */
	@ApiListField("social_info_views")
	@ApiField("social_info_view")
	private List<SocialInfoView> socialInfoViews;

	public void setSocialInfoViews(List<SocialInfoView> socialInfoViews) {
		this.socialInfoViews = socialInfoViews;
	}
	public List<SocialInfoView> getSocialInfoViews( ) {
		return this.socialInfoViews;
	}

}
