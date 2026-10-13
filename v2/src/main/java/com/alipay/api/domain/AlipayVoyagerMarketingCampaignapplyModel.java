package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager营销活动领取接口
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:41:25
 */
public class AlipayVoyagerMarketingCampaignapplyModel extends AlipayObject {

	private static final long serialVersionUID = 8276182975141858575L;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动类型（可选）：VOYAGER_ACTIVITY / DOLPHIN_CAMP
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 环境信息
	 */
	@ApiField("env_info")
	private VoyagerEnvInfo envInfo;

	/**
	 * 扩展信息（Map 的 JSON string）
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 幂等键兜底
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 投放流量位ID
	 */
	@ApiField("polymer_block_code")
	private String polymerBlockCode;

	/**
	 * 奖品ID
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 幂等键
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 用户userid
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public VoyagerEnvInfo getEnvInfo() {
		return this.envInfo;
	}
	public void setEnvInfo(VoyagerEnvInfo envInfo) {
		this.envInfo = envInfo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPolymerBlockCode() {
		return this.polymerBlockCode;
	}
	public void setPolymerBlockCode(String polymerBlockCode) {
		this.polymerBlockCode = polymerBlockCode;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
