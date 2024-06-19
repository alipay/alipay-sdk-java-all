package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DtBankActivityTimeInfo;
import com.alipay.api.domain.DtBankActivityTypeInfo;
import com.alipay.api.domain.DtBankInfo;
import com.alipay.api.domain.DtBankBudgetInfo;
import com.alipay.api.domain.DtBankCrowdInfo;
import com.alipay.api.domain.DtBankPreferenceTypeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbankcust.activityconfig.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-09 11:49:19
 */
public class AlipayUserDtbankcustActivityconfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5422594291964532884L;

	/** 
	 * 活动ID
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
	 * 优惠类型信息
	 */
	@ApiField("preference_type_info")
	private DtBankPreferenceTypeInfo preferenceTypeInfo;

	/** 
	 * 活动支持的核销使用场景。数据格式为：场景1,场景2-子场景1/子场景2,场景3。例如：天猫超市,生活缴费-水费/电费,饿了么
	 */
	@ApiField("use_scene")
	private String useScene;

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

}
