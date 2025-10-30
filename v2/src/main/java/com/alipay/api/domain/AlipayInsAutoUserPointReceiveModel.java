package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户攒油请求
 *
 * @author auto create
 * @since 1.0, 2025-08-07 18:44:26
 */
public class AlipayInsAutoUserPointReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 7195773687885299892L;

	/**
	 * 车险活动类型编码。
攒油：SAVE_OIL
	 */
	@ApiField("auto_campaign_type")
	private String autoCampaignType;

	/**
	 * 扩展参数。
BIZ_END_TIME:业务结束时间，值为时间戳
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 车险活动的接入场景。
例如，车险攒油活动的接入场景码。
高德导航：gaode_use
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAutoCampaignType() {
		return this.autoCampaignType;
	}
	public void setAutoCampaignType(String autoCampaignType) {
		this.autoCampaignType = autoCampaignType;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
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

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
