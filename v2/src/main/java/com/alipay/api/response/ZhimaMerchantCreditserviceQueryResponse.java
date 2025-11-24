package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BaseInfoApiConfig;
import com.alipay.api.domain.RiskApiConfig;
import com.alipay.api.domain.PromiseApiConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.creditservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-16 16:35:43
 */
public class ZhimaMerchantCreditserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8741974691759964949L;

	/** 
	 * 信用服务基础信息配置
	 */
	@ApiField("base_info_config")
	private BaseInfoApiConfig baseInfoConfig;

	/** 
	 * 信用服务创建模式，枚举如下： * DIRECT_MERCHANT：直连商户（直连模式）。 * ZFT_MERCHANT：直付通商户(间联模式)。
	 */
	@ApiField("create_type")
	private String createType;

	/** 
	 * 信用服务ID
	 */
	@ApiField("credit_service_id")
	private String creditServiceId;

	/** 
	 * 多评估方案信用服务风控配置。此字段为复杂模型。
	 */
	@ApiListField("evaluation_risk_configs")
	@ApiField("risk_api_config")
	private List<RiskApiConfig> evaluationRiskConfigs;

	/** 
	 * 信用服务的创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 信用服务的修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 信用服务版本的下线时间
	 */
	@ApiField("gmt_offline")
	private Date gmtOffline;

	/** 
	 * 信用服务版本的上线时间
	 */
	@ApiField("gmt_online")
	private Date gmtOnline;

	/** 
	 * 信用服务版本的审批通过时间
	 */
	@ApiField("gmt_review")
	private Date gmtReview;

	/** 
	 * 间连模式创建信用服务的ISV商户ID
	 */
	@ApiField("isv_id")
	private String isvId;

	/** 
	 * 提供信用服务的商户的ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 提供信用服务的商户的名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 先用后付经营的小程序
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/** 
	 * 信用服务的工单ID
	 */
	@ApiField("process_id")
	private String processId;

	/** 
	 * 信用服务守护配置
	 */
	@ApiField("promise_config")
	private PromiseApiConfig promiseConfig;

	/** 
	 * 信用服务版本审核失败时的原因描述
	 */
	@ApiField("review_failed_msg")
	private String reviewFailedMsg;

	/** 
	 * 信用服务版本审核状态，可取值： init(未提交)； reviewing(审核中)； review_failed(审核驳回)； review_passed(审核通过)
	 */
	@ApiField("review_status")
	private String reviewStatus;

	/** 
	 * 信用服务风控配置
	 */
	@ApiField("risk_config")
	private RiskApiConfig riskConfig;

	/** 
	 * 信用服务版本状态，可取值： init(未上线)； to_be_published(待发布)； online_processing(上线中)； online(已上线)； offline(已下线)； notOnline(未上线)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 信用服务版本的版本号
	 */
	@ApiField("version_no")
	private String versionNo;

	public void setBaseInfoConfig(BaseInfoApiConfig baseInfoConfig) {
		this.baseInfoConfig = baseInfoConfig;
	}
	public BaseInfoApiConfig getBaseInfoConfig( ) {
		return this.baseInfoConfig;
	}

	public void setCreateType(String createType) {
		this.createType = createType;
	}
	public String getCreateType( ) {
		return this.createType;
	}

	public void setCreditServiceId(String creditServiceId) {
		this.creditServiceId = creditServiceId;
	}
	public String getCreditServiceId( ) {
		return this.creditServiceId;
	}

	public void setEvaluationRiskConfigs(List<RiskApiConfig> evaluationRiskConfigs) {
		this.evaluationRiskConfigs = evaluationRiskConfigs;
	}
	public List<RiskApiConfig> getEvaluationRiskConfigs( ) {
		return this.evaluationRiskConfigs;
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

	public void setGmtReview(Date gmtReview) {
		this.gmtReview = gmtReview;
	}
	public Date getGmtReview( ) {
		return this.gmtReview;
	}

	public void setIsvId(String isvId) {
		this.isvId = isvId;
	}
	public String getIsvId( ) {
		return this.isvId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

	public void setPromiseConfig(PromiseApiConfig promiseConfig) {
		this.promiseConfig = promiseConfig;
	}
	public PromiseApiConfig getPromiseConfig( ) {
		return this.promiseConfig;
	}

	public void setReviewFailedMsg(String reviewFailedMsg) {
		this.reviewFailedMsg = reviewFailedMsg;
	}
	public String getReviewFailedMsg( ) {
		return this.reviewFailedMsg;
	}

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	public String getReviewStatus( ) {
		return this.reviewStatus;
	}

	public void setRiskConfig(RiskApiConfig riskConfig) {
		this.riskConfig = riskConfig;
	}
	public RiskApiConfig getRiskConfig( ) {
		return this.riskConfig;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionNo( ) {
		return this.versionNo;
	}

}
