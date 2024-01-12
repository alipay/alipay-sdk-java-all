package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenPrizeCategoryDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.unitedopencoupon.prizechoose.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:51:43
 */
public class AlipayMarketingCampaignUnitedopencouponPrizechooseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8374534983686414244L;

	/** 
	 * 是否绑定手机号。（只有活动规则上配置要求绑定手机号且当前用户未绑定手机号情况下该字段才会返回false，其余情况下不返回或者返回为空（null）
	 */
	@ApiField("bind_phone")
	private Boolean bindPhone;

	/** 
	 * 活动结束时间
	 */
	@ApiField("camp_end_time")
	private Date campEndTime;

	/** 
	 * 活动开始时间
	 */
	@ApiField("camp_start_time")
	private Date campStartTime;

	/** 
	 * 活动状态
	 */
	@ApiField("camp_status")
	private String campStatus;

	/** 
	 * 用户支付宝登录号（脱敏）
	 */
	@ApiField("login_id")
	private String loginId;

	/** 
	 * 奖品选择列表
	 */
	@ApiListField("prize_category_details")
	@ApiField("open_prize_category_detail")
	private List<OpenPrizeCategoryDetail> prizeCategoryDetails;

	/** 
	 * 是否实名认证（只有活动规则上配置需要验证实名，且当前用户不满足该规则时才会返回false，其余情况默认不返回或者返回为null）
	 */
	@ApiField("real_name_auth")
	private Boolean realNameAuth;

	/** 
	 * 是否是风险用户
	 */
	@ApiField("risk_user")
	private Boolean riskUser;

	public void setBindPhone(Boolean bindPhone) {
		this.bindPhone = bindPhone;
	}
	public Boolean getBindPhone( ) {
		return this.bindPhone;
	}

	public void setCampEndTime(Date campEndTime) {
		this.campEndTime = campEndTime;
	}
	public Date getCampEndTime( ) {
		return this.campEndTime;
	}

	public void setCampStartTime(Date campStartTime) {
		this.campStartTime = campStartTime;
	}
	public Date getCampStartTime( ) {
		return this.campStartTime;
	}

	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}
	public String getCampStatus( ) {
		return this.campStatus;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId( ) {
		return this.loginId;
	}

	public void setPrizeCategoryDetails(List<OpenPrizeCategoryDetail> prizeCategoryDetails) {
		this.prizeCategoryDetails = prizeCategoryDetails;
	}
	public List<OpenPrizeCategoryDetail> getPrizeCategoryDetails( ) {
		return this.prizeCategoryDetails;
	}

	public void setRealNameAuth(Boolean realNameAuth) {
		this.realNameAuth = realNameAuth;
	}
	public Boolean getRealNameAuth( ) {
		return this.realNameAuth;
	}

	public void setRiskUser(Boolean riskUser) {
		this.riskUser = riskUser;
	}
	public Boolean getRiskUser( ) {
		return this.riskUser;
	}

}
