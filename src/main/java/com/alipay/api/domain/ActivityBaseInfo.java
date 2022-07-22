package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动基础信息
 *
 * @author auto create
 * @since 1.0, 2022-07-20 18:19:05
 */
public class ActivityBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 5137939243897559142L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称。 不对用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动操作状态。 取值范围： 1.CREATING：创建中。 2.MODIFYING：修改中。 3.APPENDING：追加中。 4.FINISHEING：终止中。 限制： 该值为空，说明活动当前没有正在执行中的操作。
	 */
	@ApiField("activity_operation_status")
	private String activityOperationStatus;

	/**
	 * 活动状态。 取值范围： 1.ACTIVE：已激活（活动正常运行）。 2.FINISHED：已终止（商家终止活动，不可再发放。 限制： 1.该值为空，说明活动还未创建成功。可以使用 activity_operation_status字段判断活动是否处于CREATING状态。
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 商家券活动归属的商户信息。 说明： 如果该复杂对象不填。则默认为该商家券活动的归属者是调用者本人。 如果填写，则认为该商家券活动的归属者是该商户。 限制:自研商户可以不传，服务商身份接入时必传
	 */
	@ApiField("belong_merchant_info")
	private BelongMerchantInfo belongMerchantInfo;

	/**
	 * 码模式。 枚举值： MERCHANT_UPLOAD：商户上传自定义code，发券时系统随机选取上传的券code发放 MERCHANT_API：发奖时指定券码发奖，此模式无须提前上传券码。
	 */
	@ApiField("code_mode")
	private String codeMode;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityOperationStatus() {
		return this.activityOperationStatus;
	}
	public void setActivityOperationStatus(String activityOperationStatus) {
		this.activityOperationStatus = activityOperationStatus;
	}

	public String getActivityStatus() {
		return this.activityStatus;
	}
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public BelongMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(BelongMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public String getCodeMode() {
		return this.codeMode;
	}
	public void setCodeMode(String codeMode) {
		this.codeMode = codeMode;
	}

}
