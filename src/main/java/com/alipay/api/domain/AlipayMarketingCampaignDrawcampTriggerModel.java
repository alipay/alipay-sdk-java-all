package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动触发
 *
 * @author auto create
 * @since 1.0, 2018-12-28 15:23:17
 */
public class AlipayMarketingCampaignDrawcampTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 7422446351419219488L;

	/**
	 * 用户参与活动的手机号（如果是用户直接输入手机号的活动形式，该项必填，作为识别用户的依据）
	 */
	@ApiField("bind_mobile")
	private String bindMobile;

	/**
	 * 活动id，获取方式：调用方通过活动创建接口alipay.marketing.campaign.drawcamp.create 生成；联系支付宝运营同学获取（适用于支付宝平台活动，由合作伙伴调用触发）
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 请求来源，目前支持：1微信 2 微博 3虾米 4淘宝  5天猫
	 */
	@ApiField("camp_source")
	private Long campSource;

	/**
	 * 渠道来源参数，记录调用方level 1~n级渠道来源信息，用于业务数据统计和分析
	 */
	@ApiField("channel_info")
	private String channelInfo;

	/**
	 * 客户端ip
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * rds嵌入页面的js收集的用户行为数据
	 */
	@ApiField("json_ua")
	private String jsonUa;

	/**
	 * 用户登录账号名：邮箱或手机号。已知支付宝账号的活动触发调用中，user_id与login_id至少有一个非空，都非空时，以user_id为准。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 幂等id，用于判断是否重复调用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户uid：支付宝用户唯一标识。该参数用于已知支付宝账号的活动触发。user_id、login_id、bind_mobile三个参数至少有一个非空。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBindMobile() {
		return this.bindMobile;
	}
	public void setBindMobile(String bindMobile) {
		this.bindMobile = bindMobile;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public Long getCampSource() {
		return this.campSource;
	}
	public void setCampSource(Long campSource) {
		this.campSource = campSource;
	}

	public String getChannelInfo() {
		return this.channelInfo;
	}
	public void setChannelInfo(String channelInfo) {
		this.channelInfo = channelInfo;
	}

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getJsonUa() {
		return this.jsonUa;
	}
	public void setJsonUa(String jsonUa) {
		this.jsonUa = jsonUa;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
