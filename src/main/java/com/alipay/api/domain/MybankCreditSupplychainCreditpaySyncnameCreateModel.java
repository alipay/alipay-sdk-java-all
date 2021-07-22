package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商-1688和赊呗融合-卖家同步接口	
 *
 * @author auto create
 * @since 1.0, 2020-03-20 11:27:29
 */
public class MybankCreditSupplychainCreditpaySyncnameCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5225684394995966192L;

	/**
	 * 报名时间/取消时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 渠道标签
	 */
	@ApiField("channel_tag")
	private String channelTag;

	/**
	 * 操作类型: APPLY:报名申请; CANCEL:取消报名
	 */
	@ApiField("handle_type")
	private String handleType;

	/**
	 * 营销结束时间
	 */
	@ApiField("promo_end_time")
	private String promoEndTime;

	/**
	 * 营销开始时间
	 */
	@ApiField("promo_start_time")
	private String promoStartTime;

	/**
	 * 营销类型, 长账期:LONG_TERM
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 营销值, 长账期:2
	 */
	@ApiField("promo_value")
	private String promoValue;

	/**
	 * 请求幂等控制ID，以isv的ipRoleId_为前缀
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 1688商铺ID
	 */
	@ApiField("scene_user_id")
	private String sceneUserId;

	/**
	 * 卖家信息
	 */
	@ApiField("seller")
	private Member seller;

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getChannelTag() {
		return this.channelTag;
	}
	public void setChannelTag(String channelTag) {
		this.channelTag = channelTag;
	}

	public String getHandleType() {
		return this.handleType;
	}
	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	public String getPromoEndTime() {
		return this.promoEndTime;
	}
	public void setPromoEndTime(String promoEndTime) {
		this.promoEndTime = promoEndTime;
	}

	public String getPromoStartTime() {
		return this.promoStartTime;
	}
	public void setPromoStartTime(String promoStartTime) {
		this.promoStartTime = promoStartTime;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getPromoValue() {
		return this.promoValue;
	}
	public void setPromoValue(String promoValue) {
		this.promoValue = promoValue;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneUserId() {
		return this.sceneUserId;
	}
	public void setSceneUserId(String sceneUserId) {
		this.sceneUserId = sceneUserId;
	}

	public Member getSeller() {
		return this.seller;
	}
	public void setSeller(Member seller) {
		this.seller = seller;
	}

}
