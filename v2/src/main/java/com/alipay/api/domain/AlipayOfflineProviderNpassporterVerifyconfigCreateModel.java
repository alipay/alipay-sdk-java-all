package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N核身配置创建
 *
 * @author auto create
 * @since 1.0, 2025-12-31 17:50:54
 */
public class AlipayOfflineProviderNpassporterVerifyconfigCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1349616474512843646L;

	/**
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 授权页面配置
	 */
	@ApiField("authorization_page_config")
	private AuthorizationPageConfig authorizationPageConfig;

	/**
	 * 通用页面配置
	 */
	@ApiField("common_page_config")
	private CommonPageConfig commonPageConfig;

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
	 * 结果页配置
	 */
	@ApiField("result_page_config")
	private ResultPageConfig resultPageConfig;

	/**
	 * 解决方案类型
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 解决方案配置
	 */
	@ApiField("solution_config")
	private SolutionConfig solutionConfig;

	/**
	 * 应用id
	 */
	@ApiField("verify_app_id")
	private String verifyAppId;

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

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public AuthorizationPageConfig getAuthorizationPageConfig() {
		return this.authorizationPageConfig;
	}
	public void setAuthorizationPageConfig(AuthorizationPageConfig authorizationPageConfig) {
		this.authorizationPageConfig = authorizationPageConfig;
	}

	public CommonPageConfig getCommonPageConfig() {
		return this.commonPageConfig;
	}
	public void setCommonPageConfig(CommonPageConfig commonPageConfig) {
		this.commonPageConfig = commonPageConfig;
	}

	public String getLocationUrl() {
		return this.locationUrl;
	}
	public void setLocationUrl(String locationUrl) {
		this.locationUrl = locationUrl;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public ResultPageConfig getResultPageConfig() {
		return this.resultPageConfig;
	}
	public void setResultPageConfig(ResultPageConfig resultPageConfig) {
		this.resultPageConfig = resultPageConfig;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

	public SolutionConfig getSolutionConfig() {
		return this.solutionConfig;
	}
	public void setSolutionConfig(SolutionConfig solutionConfig) {
		this.solutionConfig = solutionConfig;
	}

	public String getVerifyAppId() {
		return this.verifyAppId;
	}
	public void setVerifyAppId(String verifyAppId) {
		this.verifyAppId = verifyAppId;
	}

	public String getVerifyPid() {
		return this.verifyPid;
	}
	public void setVerifyPid(String verifyPid) {
		this.verifyPid = verifyPid;
	}

	public String getVerifyResultPageSource() {
		return this.verifyResultPageSource;
	}
	public void setVerifyResultPageSource(String verifyResultPageSource) {
		this.verifyResultPageSource = verifyResultPageSource;
	}

}
