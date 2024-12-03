package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT展位投放计划商家报名接口
 *
 * @author auto create
 * @since 1.0, 2021-09-29 15:02:59
 */
public class AlipayMarketingIotMerchantplanCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 3669841258417197169L;

	/**
	 * 操作类型：CREATE（新增） / MODIFY（修改）
	 */
	@ApiField("action")
	private String action;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 商家活动ID，当修改报名详情时，本参数需要有值
	 */
	@ApiField("merchant_plan_id")
	private String merchantPlanId;

	/**
	 * 商家小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 商家小程序页面地址
	 */
	@ApiField("mini_app_page")
	private String miniAppPage;

	/**
	 * IoT展位投放计划ID
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 投放资源内容，如优惠券ID
	 */
	@ApiField("resource_content")
	private String resourceContent;

	/**
	 * 投放资源类型，如：IOT_MERCHANT_VOUCHER（商家自发券）
	 */
	@ApiField("resource_type")
	private String resourceType;

	/**
	 * IoT展位码
	 */
	@ApiField("space_code")
	private String spaceCode;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getMerchantPlanId() {
		return this.merchantPlanId;
	}
	public void setMerchantPlanId(String merchantPlanId) {
		this.merchantPlanId = merchantPlanId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppPage() {
		return this.miniAppPage;
	}
	public void setMiniAppPage(String miniAppPage) {
		this.miniAppPage = miniAppPage;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getResourceContent() {
		return this.resourceContent;
	}
	public void setResourceContent(String resourceContent) {
		this.resourceContent = resourceContent;
	}

	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getSpaceCode() {
		return this.spaceCode;
	}
	public void setSpaceCode(String spaceCode) {
		this.spaceCode = spaceCode;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
