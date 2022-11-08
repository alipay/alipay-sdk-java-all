package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动基础信息
 *
 * @author auto create
 * @since 1.0, 2022-10-08 16:44:03
 */
public class ActivityBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 3165357378454727578L;

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
	 * 活动操作状态。
	 */
	@ApiField("activity_operation_status")
	private String activityOperationStatus;

	/**
	 * 券活动产品类型
	 */
	@ApiField("activity_product_type")
	private String activityProductType;

	/**
	 * 活动状态。 已激活状态表示活动正常运行。已终止状态表示商家终止活动，不可再发放。
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 商家券活动归属的商户信息。 说明： 如果该复杂对象不填。则默认为该商家券活动的归属者是调用者本人。 如果填写，则认为该商家券活动的归属者是该商户。
	 */
	@ApiField("belong_merchant_info")
	private BelongMerchantInfo belongMerchantInfo;

	/**
	 * 码模式。  MERCHANT_UPLOAD：商户上传自定义code，发券时系统随机选取上传的券code发放 MERCHANT_API：发奖时指定券码发奖，此模式无须提前上传券码。
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

	public String getActivityProductType() {
		return this.activityProductType;
	}
	public void setActivityProductType(String activityProductType) {
		this.activityProductType = activityProductType;
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
