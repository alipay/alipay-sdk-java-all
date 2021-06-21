package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除会员关系
 *
 * @author auto create
 * @since 1.0, 2018-11-30 15:36:18
 */
public class KoubeiMarketingCampaignMemberRelationUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 2544982271395332898L;

	/**
	 * 会员模版id
	 */
	@ApiField("member_template_id")
	private String memberTemplateId;

	/**
	 * 商户外部会员号
	 */
	@ApiField("out_member_no")
	private String outMemberNo;

	/**
	 * 外部请求幂等号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getMemberTemplateId() {
		return this.memberTemplateId;
	}
	public void setMemberTemplateId(String memberTemplateId) {
		this.memberTemplateId = memberTemplateId;
	}

	public String getOutMemberNo() {
		return this.outMemberNo;
	}
	public void setOutMemberNo(String outMemberNo) {
		this.outMemberNo = outMemberNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
