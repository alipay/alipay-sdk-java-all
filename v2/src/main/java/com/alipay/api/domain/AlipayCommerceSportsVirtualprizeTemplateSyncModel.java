package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 勋章模版录入
 *
 * @author auto create
 * @since 1.0, 2023-05-18 11:32:10
 */
public class AlipayCommerceSportsVirtualprizeTemplateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7146719519384832474L;

	/**
	 * true:点击虚拟奖品详情，跳转到三方详情页
false:点击虚拟奖品详情，在支付宝文体展示详情
	 */
	@ApiField("action_open")
	private Boolean actionOpen;

	/**
	 * 未获得奖品时，去获取按钮配置的跳转链接
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 参考值：跑步线上赛：online_game；跑量挑战：regular_challenge
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 详情页已获得时彩色图片url,图片最大2M
	 */
	@ApiField("detail_picture")
	private String detailPicture;

	/**
	 * 详情页未获得时的灰色图片url，图片最大2M
	 */
	@ApiField("detail_unreceived_picture")
	private String detailUnreceivedPicture;

	/**
	 * 详情跳转连接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 外部奖品id+appid唯一
	 */
	@ApiField("out_prize_id")
	private String outPrizeId;

	/**
	 * 图片url,图片最大2M
	 */
	@ApiField("picture")
	private String picture;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * MEDAL：虚拟奖牌，CERTIFICATE：电子证书
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 用户领取奖品操作的配置，默认值为不需要用户手动领取即直接发放给用户，"receive"为会在用户获得但是还没领取奖品的时候主动弹出领取勋章的页面
	 */
	@ApiField("receive_type")
	private String receiveType;

	/**
	 * 奖品获取规则文案
	 */
	@ApiField("rule_desc")
	private String ruleDesc;

	/**
	 * 分享奖品时图片中展示的文案
	 */
	@ApiField("share_memo")
	private String shareMemo;

	/**
	 * 分享奖品时图片中展示的文案
	 */
	@ApiField("share_title")
	private String shareTitle;

	/**
	 * 状态，0：下线，1：上线
	 */
	@ApiField("status")
	private String status;

	/**
	 * 未获得时的灰色图片url,图片最大2M
	 */
	@ApiField("unreceived_picture")
	private String unreceivedPicture;

	/**
	 * 奖品对用户可见的配置，默认值为空表示未获取奖品的用户可见，"have"为拥有奖品的用户才可见(非have时unreceived_picture、detail_unreceived_picture必填)
	 */
	@ApiField("visible_type")
	private String visibleType;

	public Boolean getActionOpen() {
		return this.actionOpen;
	}
	public void setActionOpen(Boolean actionOpen) {
		this.actionOpen = actionOpen;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDetailPicture() {
		return this.detailPicture;
	}
	public void setDetailPicture(String detailPicture) {
		this.detailPicture = detailPicture;
	}

	public String getDetailUnreceivedPicture() {
		return this.detailUnreceivedPicture;
	}
	public void setDetailUnreceivedPicture(String detailUnreceivedPicture) {
		this.detailUnreceivedPicture = detailUnreceivedPicture;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getOutPrizeId() {
		return this.outPrizeId;
	}
	public void setOutPrizeId(String outPrizeId) {
		this.outPrizeId = outPrizeId;
	}

	public String getPicture() {
		return this.picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getReceiveType() {
		return this.receiveType;
	}
	public void setReceiveType(String receiveType) {
		this.receiveType = receiveType;
	}

	public String getRuleDesc() {
		return this.ruleDesc;
	}
	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
	}

	public String getShareMemo() {
		return this.shareMemo;
	}
	public void setShareMemo(String shareMemo) {
		this.shareMemo = shareMemo;
	}

	public String getShareTitle() {
		return this.shareTitle;
	}
	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUnreceivedPicture() {
		return this.unreceivedPicture;
	}
	public void setUnreceivedPicture(String unreceivedPicture) {
		this.unreceivedPicture = unreceivedPicture;
	}

	public String getVisibleType() {
		return this.visibleType;
	}
	public void setVisibleType(String visibleType) {
		this.visibleType = visibleType;
	}

}
