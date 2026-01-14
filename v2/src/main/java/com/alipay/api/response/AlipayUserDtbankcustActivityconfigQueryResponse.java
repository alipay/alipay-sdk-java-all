package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DtBankActivityTimeInfo;
import com.alipay.api.domain.DtBankActivityTypeInfo;
import com.alipay.api.domain.DtbankActivityAlertConfigInfo;
import com.alipay.api.domain.DtBankInfo;
import com.alipay.api.domain.DtBankBudgetInfo;
import com.alipay.api.domain.DtBankCrowdInfo;
import com.alipay.api.domain.DtbankActivityDataEffectInfo;
import com.alipay.api.domain.DtBankPreferenceTypeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbankcust.activityconfig.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-11 14:59:03
 */
public class AlipayUserDtbankcustActivityconfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3664188739227885759L;

	/** 
	 * 当入参活动类型是DISCOUNT、VOUCHER、FIRST_BIND_CARD_GIFT时返回活动ID；
当入参活动类型是SOLUTION时返回解决方案ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 活动状态
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 活动时间信息
	 */
	@ApiField("activity_time_info")
	private DtBankActivityTimeInfo activityTimeInfo;

	/** 
	 * 活动类型信息
	 */
	@ApiField("activity_type_info")
	private DtBankActivityTypeInfo activityTypeInfo;

	/** 
	 * 预算预警信息
为空时表示不进行预算预警，
不为空时表示有预算预警，返回预算预警配置
	 */
	@ApiField("alert_config_info")
	private DtbankActivityAlertConfigInfo alertConfigInfo;

	/** 
	 * 活动配置银行信息
	 */
	@ApiField("bank_info")
	private DtBankInfo bankInfo;

	/** 
	 * 活动预算信息
	 */
	@ApiField("budget_info")
	private DtBankBudgetInfo budgetInfo;

	/** 
	 * 计次信息
	 */
	@ApiField("count_limit")
	private String countLimit;

	/** 
	 * 活动配置人群信息
	 */
	@ApiField("crowd_info")
	private DtBankCrowdInfo crowdInfo;

	/** 
	 * 活动效果数据，一般情况下数据更新到昨日，具体以接口中返回的更新日期为准。
	 */
	@ApiField("data_effect_info")
	private DtbankActivityDataEffectInfo dataEffectInfo;

	/** 
	 * 优惠类型信息
	 */
	@ApiField("preference_type_info")
	private DtBankPreferenceTypeInfo preferenceTypeInfo;

	/** 
	 * 活动支持的核销使用场景。数据格式为：场景1,场景2-子场景1/子场景2,场景3。例如：天猫超市,生活缴费-水费/电费,饿了么
	 */
	@ApiField("use_scene")
	private String useScene;

	/** 
	 * 活动配置对应的模板id信息
	 */
	@ApiField("voucher_template_id")
	private String voucherTemplateId;

	/** 
	 * 当前活动的白名单信息，逗号分隔
	 */
	@ApiField("white_list_info")
	private String whiteListInfo;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityName( ) {
		return this.activityName;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setActivityTimeInfo(DtBankActivityTimeInfo activityTimeInfo) {
		this.activityTimeInfo = activityTimeInfo;
	}
	public DtBankActivityTimeInfo getActivityTimeInfo( ) {
		return this.activityTimeInfo;
	}

	public void setActivityTypeInfo(DtBankActivityTypeInfo activityTypeInfo) {
		this.activityTypeInfo = activityTypeInfo;
	}
	public DtBankActivityTypeInfo getActivityTypeInfo( ) {
		return this.activityTypeInfo;
	}

	public void setAlertConfigInfo(DtbankActivityAlertConfigInfo alertConfigInfo) {
		this.alertConfigInfo = alertConfigInfo;
	}
	public DtbankActivityAlertConfigInfo getAlertConfigInfo( ) {
		return this.alertConfigInfo;
	}

	public void setBankInfo(DtBankInfo bankInfo) {
		this.bankInfo = bankInfo;
	}
	public DtBankInfo getBankInfo( ) {
		return this.bankInfo;
	}

	public void setBudgetInfo(DtBankBudgetInfo budgetInfo) {
		this.budgetInfo = budgetInfo;
	}
	public DtBankBudgetInfo getBudgetInfo( ) {
		return this.budgetInfo;
	}

	public void setCountLimit(String countLimit) {
		this.countLimit = countLimit;
	}
	public String getCountLimit( ) {
		return this.countLimit;
	}

	public void setCrowdInfo(DtBankCrowdInfo crowdInfo) {
		this.crowdInfo = crowdInfo;
	}
	public DtBankCrowdInfo getCrowdInfo( ) {
		return this.crowdInfo;
	}

	public void setDataEffectInfo(DtbankActivityDataEffectInfo dataEffectInfo) {
		this.dataEffectInfo = dataEffectInfo;
	}
	public DtbankActivityDataEffectInfo getDataEffectInfo( ) {
		return this.dataEffectInfo;
	}

	public void setPreferenceTypeInfo(DtBankPreferenceTypeInfo preferenceTypeInfo) {
		this.preferenceTypeInfo = preferenceTypeInfo;
	}
	public DtBankPreferenceTypeInfo getPreferenceTypeInfo( ) {
		return this.preferenceTypeInfo;
	}

	public void setUseScene(String useScene) {
		this.useScene = useScene;
	}
	public String getUseScene( ) {
		return this.useScene;
	}

	public void setVoucherTemplateId(String voucherTemplateId) {
		this.voucherTemplateId = voucherTemplateId;
	}
	public String getVoucherTemplateId( ) {
		return this.voucherTemplateId;
	}

	public void setWhiteListInfo(String whiteListInfo) {
		this.whiteListInfo = whiteListInfo;
	}
	public String getWhiteListInfo( ) {
		return this.whiteListInfo;
	}

}
