package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活记录详情
 *
 * @author auto create
 * @since 1.0, 2022-10-27 16:00:39
 */
public class PromiseDetail extends AlipayObject {

	private static final long serialVersionUID = 8359426677954228368L;

	/**
	 * 授权状态
	 */
	@ApiField("auth_status")
	private Boolean authStatus;

	/**
	 * 任务创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 任务结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 任务到达终态的时间
	 */
	@ApiField("final_time")
	private String finalTime;

	/**
	 * 任务完成期数
	 */
	@ApiField("finish_periods")
	private Long finishPeriods;

	/**
	 * 芝麻侧的商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户logo
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 周期类型
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 生活记录模板名称
	 */
	@ApiField("promise_name")
	private String promiseName;

	/**
	 * 生活记录主记录id
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 主任务状态
	 */
	@ApiField("record_status")
	private String recordStatus;

	/**
	 * 任务开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 子记录状态
	 */
	@ApiField("sub_record_status")
	private String subRecordStatus;

	/**
	 * 副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 生活记录模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 任务总期数
	 */
	@ApiField("total_periods")
	private Long totalPeriods;

	public Boolean getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(Boolean authStatus) {
		this.authStatus = authStatus;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getFinalTime() {
		return this.finalTime;
	}
	public void setFinalTime(String finalTime) {
		this.finalTime = finalTime;
	}

	public Long getFinishPeriods() {
		return this.finishPeriods;
	}
	public void setFinishPeriods(Long finishPeriods) {
		this.finishPeriods = finishPeriods;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantLogo() {
		return this.merchantLogo;
	}
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public String getPromiseName() {
		return this.promiseName;
	}
	public void setPromiseName(String promiseName) {
		this.promiseName = promiseName;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRecordStatus() {
		return this.recordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getSubRecordStatus() {
		return this.subRecordStatus;
	}
	public void setSubRecordStatus(String subRecordStatus) {
		this.subRecordStatus = subRecordStatus;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public Long getTotalPeriods() {
		return this.totalPeriods;
	}
	public void setTotalPeriods(Long totalPeriods) {
		this.totalPeriods = totalPeriods;
	}

}
