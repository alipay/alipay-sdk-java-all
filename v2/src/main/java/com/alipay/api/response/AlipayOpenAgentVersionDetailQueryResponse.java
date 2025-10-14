package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.version.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 11:22:29
 */
public class AlipayOpenAgentVersionDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7648233512172625951L;

	/** 
	 * 智能体应用logo图标
	 */
	@ApiField("app_logo")
	private String appLogo;

	/** 
	 * 智能体应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 智能体开发包版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/** 
	 * 审核驳回原因
	 */
	@ApiField("audit_reason")
	private String auditReason;

	/** 
	 * 智能体投放的客户端类型。支持如下客户端：支小宝、web服务
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/** 
	 * 版本提审时间
	 */
	@ApiField("gmt_apply_audit")
	private Date gmtApplyAudit;

	/** 
	 * 审核结束时间
	 */
	@ApiField("gmt_audit_end")
	private Date gmtAuditEnd;

	/** 
	 * 版本创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 版本下架时间
	 */
	@ApiField("gmt_offline")
	private Date gmtOffline;

	/** 
	 * 版本上架时间
	 */
	@ApiField("gmt_online")
	private Date gmtOnline;

	/** 
	 * 版本状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 智能体版本备注
	 */
	@ApiField("version_desc")
	private String versionDesc;

	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}
	public String getAppLogo( ) {
		return this.appLogo;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getAppVersion( ) {
		return this.appVersion;
	}

	public void setAuditReason(String auditReason) {
		this.auditReason = auditReason;
	}
	public String getAuditReason( ) {
		return this.auditReason;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public String getBundleId( ) {
		return this.bundleId;
	}

	public void setGmtApplyAudit(Date gmtApplyAudit) {
		this.gmtApplyAudit = gmtApplyAudit;
	}
	public Date getGmtApplyAudit( ) {
		return this.gmtApplyAudit;
	}

	public void setGmtAuditEnd(Date gmtAuditEnd) {
		this.gmtAuditEnd = gmtAuditEnd;
	}
	public Date getGmtAuditEnd( ) {
		return this.gmtAuditEnd;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtOffline(Date gmtOffline) {
		this.gmtOffline = gmtOffline;
	}
	public Date getGmtOffline( ) {
		return this.gmtOffline;
	}

	public void setGmtOnline(Date gmtOnline) {
		this.gmtOnline = gmtOnline;
	}
	public Date getGmtOnline( ) {
		return this.gmtOnline;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVersionDesc(String versionDesc) {
		this.versionDesc = versionDesc;
	}
	public String getVersionDesc( ) {
		return this.versionDesc;
	}

}
