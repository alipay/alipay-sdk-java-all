package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业主证件申领
 *
 * @author auto create
 * @since 1.0, 2022-11-18 11:27:49
 */
public class AlipayEbppCommunityOwnercardCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5556184593457628569L;

	/**
	 * 支付宝uid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝uid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 产品类型： OWNER_CARD 电子业主卡
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 卡过期时间，为空则默认2099-12-31 00:00:00
	 */
	@ApiField("card_expired_time")
	private Date cardExpiredTime;

	/**
	 * 房管局卡ID，当开业主卡时为业主卡ID，当开附属卡时为附属卡ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 房管局系统中的小区id
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 房屋信息是否已脱敏，1已脱敏，0未脱敏， 默认0
	 */
	@ApiField("is_room_info_desensitization")
	private Long isRoomInfoDesensitization;

	/**
	 * 父业主卡ID
当卡类型为附属卡时，标明其父业主卡ID
	 */
	@ApiField("parent_card_id")
	private String parentCardId;

	/**
	 * 房管局标识的唯一房屋编号
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 房屋信息
	 */
	@ApiField("room_info")
	private String roomInfo;

	/**
	 * 产品子类型： HANGZHOU_OWNER_CARD 杭州房管局电子业主卡
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 用户类型: 
业主：OWNER 租客：TENANT 
家属：FAMILY其他：OTHER
	 */
	@ApiField("user_type")
	private String userType;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Date getCardExpiredTime() {
		return this.cardExpiredTime;
	}
	public void setCardExpiredTime(Date cardExpiredTime) {
		this.cardExpiredTime = cardExpiredTime;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public Long getIsRoomInfoDesensitization() {
		return this.isRoomInfoDesensitization;
	}
	public void setIsRoomInfoDesensitization(Long isRoomInfoDesensitization) {
		this.isRoomInfoDesensitization = isRoomInfoDesensitization;
	}

	public String getParentCardId() {
		return this.parentCardId;
	}
	public void setParentCardId(String parentCardId) {
		this.parentCardId = parentCardId;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getRoomInfo() {
		return this.roomInfo;
	}
	public void setRoomInfo(String roomInfo) {
		this.roomInfo = roomInfo;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
