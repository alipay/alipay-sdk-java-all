package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发布物业通知公告
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:30:50
 */
public class AlipayEcoCplifeNoticePublishModel extends AlipayObject {

	private static final long serialVersionUID = 1583918511863624116L;

	/**
	 * 待发布通知的目标物业小区ID列表，使用支付宝平台统一的小区ID编码。
	 */
	@ApiListField("community_id_set")
	@ApiField("string")
	private List<String> communityIdSet;

	/**
	 * 待发送的通知内容
	 */
	@ApiField("notice_details")
	private CplifeNoticeDetail noticeDetails;

	public List<String> getCommunityIdSet() {
		return this.communityIdSet;
	}
	public void setCommunityIdSet(List<String> communityIdSet) {
		this.communityIdSet = communityIdSet;
	}

	public CplifeNoticeDetail getNoticeDetails() {
		return this.noticeDetails;
	}
	public void setNoticeDetails(CplifeNoticeDetail noticeDetails) {
		this.noticeDetails = noticeDetails;
	}

}
