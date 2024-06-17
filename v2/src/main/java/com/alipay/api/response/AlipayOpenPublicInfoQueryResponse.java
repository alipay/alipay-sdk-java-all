package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PublicAuditStatus;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:55:03
 */
public class AlipayOpenPublicInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2228853164887564821L;

	/** 
	 * 生活号名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 最新审核状态描述，如果审核驳回则有相关的驳回理由
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 最新审核状态，对于系统商而言，只有四个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过，AUDIT_NORMAL：无审核状态（当前没有处于审核过程的工单）
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 审核状态表，目前支持名称、头像、名称与头像、简介审核状态
	 */
	@ApiListField("audit_status_list")
	@ApiField("public_audit_status")
	private List<PublicAuditStatus> auditStatusList;

	/** 
	 * 背景图片地址
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/** 
	 * 生活号简介
	 */
	@ApiField("introduction")
	private String introduction;

	/** 
	 * 生活号是否上线，T表示上线，F表示未上线
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 生活号是否上架，T表示上架，上架即可在支付宝客户端被搜索到，F表示未上架
	 */
	@ApiField("is_release")
	private String isRelease;

	/** 
	 * 生活号头像地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/** 
	 * 商家经营类目，详情参见 <a href="https://opendocs.alipay.com/open/01n22g">商家经营类目</a>
	 */
	@ApiField("mcc_code_desc")
	private String mccCodeDesc;

	/** 
	 * 欢迎语
	 */
	@ApiField("public_greeting")
	private String publicGreeting;

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setAuditStatusList(List<PublicAuditStatus> auditStatusList) {
		this.auditStatusList = auditStatusList;
	}
	public List<PublicAuditStatus> getAuditStatusList( ) {
		return this.auditStatusList;
	}

	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}
	public String getBackgroundUrl( ) {
		return this.backgroundUrl;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getIntroduction( ) {
		return this.introduction;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	public String getIsOnline( ) {
		return this.isOnline;
	}

	public void setIsRelease(String isRelease) {
		this.isRelease = isRelease;
	}
	public String getIsRelease( ) {
		return this.isRelease;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getLogoUrl( ) {
		return this.logoUrl;
	}

	public void setMccCodeDesc(String mccCodeDesc) {
		this.mccCodeDesc = mccCodeDesc;
	}
	public String getMccCodeDesc( ) {
		return this.mccCodeDesc;
	}

	public void setPublicGreeting(String publicGreeting) {
		this.publicGreeting = publicGreeting;
	}
	public String getPublicGreeting( ) {
		return this.publicGreeting;
	}

}
