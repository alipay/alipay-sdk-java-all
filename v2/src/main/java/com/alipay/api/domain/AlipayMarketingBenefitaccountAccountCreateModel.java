package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益账户开户
 *
 * @author auto create
 * @since 1.0, 2025-08-29 11:05:55
 */
public class AlipayMarketingBenefitaccountAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2477545343958331939L;

	/**
	 * 授权信息
	 */
	@ApiField("authorization_info")
	private FsAuthorizationInfoForm authorizationInfo;

	/**
	 * 开户来源场景，天猫国际，TMGJ
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 业务身份，由支付宝侧分配，目前权益账户传递benefit_account，信用红包传递credit_coupon
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 业务订单号-用于户号幂等，一个户号一个bizNo业务订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 权益账户生效时间
	 */
	@ApiField("effective_time")
	private Date effectiveTime;

	/**
	 * 权益账户失效时间
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 出资方信息
	 */
	@ApiListField("fund_infos")
	@ApiField("fs_fund_info_form")
	private List<FsFundInfoForm> fundInfos;

	/**
	 * 出资关系组
	 */
	@ApiListField("fund_relation_groups")
	@ApiField("fs_fund_relation_group_form")
	private List<FsFundRelationGroupForm> fundRelationGroups;

	/**
	 * 支付宝回调通知的url
	 */
	@ApiField("mnotify_url")
	private String mnotifyUrl;

	/**
	 * 权益账户的账户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 创建人对应的支付宝userId
	 */
	@ApiField("publisher_user_id")
	private String publisherUserId;

	/**
	 * 核身口令
	 */
	@ApiField("verify_id")
	private String verifyId;

	public FsAuthorizationInfoForm getAuthorizationInfo() {
		return this.authorizationInfo;
	}
	public void setAuthorizationInfo(FsAuthorizationInfoForm authorizationInfo) {
		this.authorizationInfo = authorizationInfo;
	}

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getBizIdentity() {
		return this.bizIdentity;
	}
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Date getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public List<FsFundInfoForm> getFundInfos() {
		return this.fundInfos;
	}
	public void setFundInfos(List<FsFundInfoForm> fundInfos) {
		this.fundInfos = fundInfos;
	}

	public List<FsFundRelationGroupForm> getFundRelationGroups() {
		return this.fundRelationGroups;
	}
	public void setFundRelationGroups(List<FsFundRelationGroupForm> fundRelationGroups) {
		this.fundRelationGroups = fundRelationGroups;
	}

	public String getMnotifyUrl() {
		return this.mnotifyUrl;
	}
	public void setMnotifyUrl(String mnotifyUrl) {
		this.mnotifyUrl = mnotifyUrl;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPublisherUserId() {
		return this.publisherUserId;
	}
	public void setPublisherUserId(String publisherUserId) {
		this.publisherUserId = publisherUserId;
	}

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
