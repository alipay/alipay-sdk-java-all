package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营-计划-计划详情
 *
 * @author auto create
 * @since 1.0, 2023-04-17 20:20:44
 */
public class BsBrandPlanDetail extends AlipayObject {

	private static final long serialVersionUID = 4464952843889936953L;

	/**
	 * 计划发起方的品牌信息
	 */
	@ApiField("brand_info")
	private BsPlanBrandInfo brandInfo;

	/**
	 * 联营计划介绍
	 */
	@ApiField("intro")
	private BsBrandPlanIntro intro;

	/**
	 * 计划邀约配置
	 */
	@ApiField("invite_config")
	private BsPlanInviteConfig inviteConfig;

	/**
	 * 联营计划ID,在计划管理平台查看
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 联营方案类型，如EASY_BUY：顺手买
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public BsPlanBrandInfo getBrandInfo() {
		return this.brandInfo;
	}
	public void setBrandInfo(BsPlanBrandInfo brandInfo) {
		this.brandInfo = brandInfo;
	}

	public BsBrandPlanIntro getIntro() {
		return this.intro;
	}
	public void setIntro(BsBrandPlanIntro intro) {
		this.intro = intro;
	}

	public BsPlanInviteConfig getInviteConfig() {
		return this.inviteConfig;
	}
	public void setInviteConfig(BsPlanInviteConfig inviteConfig) {
		this.inviteConfig = inviteConfig;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
