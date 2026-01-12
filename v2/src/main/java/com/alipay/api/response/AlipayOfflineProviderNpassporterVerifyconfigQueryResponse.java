package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VerifyConfigAuthorizationPageConfig;
import com.alipay.api.domain.VerifyConfigCommonPageConfig;
import com.alipay.api.domain.VerifyConfigResultPageConfig;
import com.alipay.api.domain.VerifyConfigSolutionConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npassporter.verifyconfig.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-31 17:50:56
 */
public class AlipayOfflineProviderNpassporterVerifyconfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8163983461646515819L;

	/** 
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	/** 
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 审批单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 审批url
	 */
	@ApiField("auth_url")
	private String authUrl;

	/** 
	 * 授权页面配置
	 */
	@ApiField("authorization_page_config")
	private VerifyConfigAuthorizationPageConfig authorizationPageConfig;

	/** 
	 * 正常页配置
	 */
	@ApiField("common_page_config")
	private VerifyConfigCommonPageConfig commonPageConfig;

	/** 
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 直接跳转url
	 */
	@ApiField("location_url")
	private String locationUrl;

	/** 
	 * 外部唯一幂等号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/** 
	 * 最近一次核验配置审批描述
	 */
	@ApiField("recent_verify_config_audit_desc")
	private String recentVerifyConfigAuditDesc;

	/** 
	 * 最近一次核验配置id
	 */
	@ApiField("recent_verify_config_id")
	private String recentVerifyConfigId;

	/** 
	 * 最近一次核验配置状态
	 */
	@ApiField("recent_verify_config_status")
	private String recentVerifyConfigStatus;

	/** 
	 * 结果页配置
	 */
	@ApiField("result_page_config")
	private VerifyConfigResultPageConfig resultPageConfig;

	/** 
	 * 解决方案code
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/** 
	 * 核验方案配置
	 */
	@ApiField("solution_config")
	private VerifyConfigSolutionConfig solutionConfig;

	/** 
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 应用id
	 */
	@ApiField("verify_app_id")
	private String verifyAppId;

	/** 
	 * 核身配置ID
	 */
	@ApiField("verify_config_id")
	private String verifyConfigId;

	/** 
	 * 商户id
	 */
	@ApiField("verify_pid")
	private String verifyPid;

	/** 
	 * 核验结果业来源一方或三方
	 */
	@ApiField("verify_result_page_source")
	private String verifyResultPageSource;

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public String getActivityCode( ) {
		return this.activityCode;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityName( ) {
		return this.activityName;
	}

	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	public String getAuthNo( ) {
		return this.authNo;
	}

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	public String getAuthUrl( ) {
		return this.authUrl;
	}

	public void setAuthorizationPageConfig(VerifyConfigAuthorizationPageConfig authorizationPageConfig) {
		this.authorizationPageConfig = authorizationPageConfig;
	}
	public VerifyConfigAuthorizationPageConfig getAuthorizationPageConfig( ) {
		return this.authorizationPageConfig;
	}

	public void setCommonPageConfig(VerifyConfigCommonPageConfig commonPageConfig) {
		this.commonPageConfig = commonPageConfig;
	}
	public VerifyConfigCommonPageConfig getCommonPageConfig( ) {
		return this.commonPageConfig;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setLocationUrl(String locationUrl) {
		this.locationUrl = locationUrl;
	}
	public String getLocationUrl( ) {
		return this.locationUrl;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

	public void setRecentVerifyConfigAuditDesc(String recentVerifyConfigAuditDesc) {
		this.recentVerifyConfigAuditDesc = recentVerifyConfigAuditDesc;
	}
	public String getRecentVerifyConfigAuditDesc( ) {
		return this.recentVerifyConfigAuditDesc;
	}

	public void setRecentVerifyConfigId(String recentVerifyConfigId) {
		this.recentVerifyConfigId = recentVerifyConfigId;
	}
	public String getRecentVerifyConfigId( ) {
		return this.recentVerifyConfigId;
	}

	public void setRecentVerifyConfigStatus(String recentVerifyConfigStatus) {
		this.recentVerifyConfigStatus = recentVerifyConfigStatus;
	}
	public String getRecentVerifyConfigStatus( ) {
		return this.recentVerifyConfigStatus;
	}

	public void setResultPageConfig(VerifyConfigResultPageConfig resultPageConfig) {
		this.resultPageConfig = resultPageConfig;
	}
	public VerifyConfigResultPageConfig getResultPageConfig( ) {
		return this.resultPageConfig;
	}

	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}
	public String getSolutionCode( ) {
		return this.solutionCode;
	}

	public void setSolutionConfig(VerifyConfigSolutionConfig solutionConfig) {
		this.solutionConfig = solutionConfig;
	}
	public VerifyConfigSolutionConfig getSolutionConfig( ) {
		return this.solutionConfig;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource( ) {
		return this.source;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVerifyAppId(String verifyAppId) {
		this.verifyAppId = verifyAppId;
	}
	public String getVerifyAppId( ) {
		return this.verifyAppId;
	}

	public void setVerifyConfigId(String verifyConfigId) {
		this.verifyConfigId = verifyConfigId;
	}
	public String getVerifyConfigId( ) {
		return this.verifyConfigId;
	}

	public void setVerifyPid(String verifyPid) {
		this.verifyPid = verifyPid;
	}
	public String getVerifyPid( ) {
		return this.verifyPid;
	}

	public void setVerifyResultPageSource(String verifyResultPageSource) {
		this.verifyResultPageSource = verifyResultPageSource;
	}
	public String getVerifyResultPageSource( ) {
		return this.verifyResultPageSource;
	}

}
