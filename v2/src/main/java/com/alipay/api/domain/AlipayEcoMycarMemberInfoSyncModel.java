package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员信息同步
 *
 * @author auto create
 * @since 1.0, 2024-10-24 16:23:11
 */
public class AlipayEcoMycarMemberInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6754164942586428865L;

	/**
	 * 会员ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 会员卡发放时间
	 */
	@ApiField("issuance_date")
	private Date issuanceDate;

	/**
	 * 业务发生时间，即同步会员信息的时间
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/**
	 * 会员卡生效时间
	 */
	@ApiField("open_date")
	private Date openDate;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 运营商侧用户ID
	 */
	@ApiField("operator_uid")
	private String operatorUid;

	/**
	 * 会员购买时间
	 */
	@ApiField("purchase_time")
	private Date purchaseTime;

	/**
	 * 场景ID:
1:（charging）充电
	 */
	@ApiField("scene_id")
	private Long sceneId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 会员卡失效时间
	 */
	@ApiField("valid_date")
	private Date validDate;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Date getIssuanceDate() {
		return this.issuanceDate;
	}
	public void setIssuanceDate(Date issuanceDate) {
		this.issuanceDate = issuanceDate;
	}

	public Date getOccurTime() {
		return this.occurTime;
	}
	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	public Date getOpenDate() {
		return this.openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperatorUid() {
		return this.operatorUid;
	}
	public void setOperatorUid(String operatorUid) {
		this.operatorUid = operatorUid;
	}

	public Date getPurchaseTime() {
		return this.purchaseTime;
	}
	public void setPurchaseTime(Date purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	public Long getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getValidDate() {
		return this.validDate;
	}
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

}
