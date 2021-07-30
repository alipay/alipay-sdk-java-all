package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberBenefitInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.scene.cooperation.consult response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:09
 */
public class AlipayUserSceneCooperationConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3724493236649131851L;

	/** 
	 * 脱敏后的支付宝登录号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 是否是新用户，true/false。
	 */
	@ApiField("app_new")
	private Boolean appNew;

	/** 
	 * 会员权益信息列表
	 */
	@ApiListField("benefit_info_list")
	@ApiField("member_benefit_info")
	private List<MemberBenefitInfo> benefitInfoList;

	/** 
	 * true表示该用户运营有价值；false表示没有价值
	 */
	@ApiField("consult_result")
	private Boolean consultResult;

	/** 
	 * 表示邀请关系建立结果。true表示邀请关系建立成功，false表示不建立邀请关系或建立失败
	 */
	@ApiField("invite_result")
	private Boolean inviteResult;

	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}
	public String getAlipayLogonId( ) {
		return this.alipayLogonId;
	}

	public void setAppNew(Boolean appNew) {
		this.appNew = appNew;
	}
	public Boolean getAppNew( ) {
		return this.appNew;
	}

	public void setBenefitInfoList(List<MemberBenefitInfo> benefitInfoList) {
		this.benefitInfoList = benefitInfoList;
	}
	public List<MemberBenefitInfo> getBenefitInfoList( ) {
		return this.benefitInfoList;
	}

	public void setConsultResult(Boolean consultResult) {
		this.consultResult = consultResult;
	}
	public Boolean getConsultResult( ) {
		return this.consultResult;
	}

	public void setInviteResult(Boolean inviteResult) {
		this.inviteResult = inviteResult;
	}
	public Boolean getInviteResult( ) {
		return this.inviteResult;
	}

}
