package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客资详情
 *
 * @author auto create
 * @since 1.0, 2020-07-08 19:26:09
 */
public class LeadsOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 5617637916398477228L;

	/**
	 * 客资类型，如手艺人预约，直播客资，门店预约，商品购买等
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 参与的活动名称
	 */
	@ApiField("camp_name")
	private String campName;

	/**
	 * 客资渠道，例如口碑、支付宝、淘宝等
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用户手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 用户姓名，如示例值展示
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 客资创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 扩展字段，interest(兴趣)，sex（性别），age（年龄），campName（参与的活动名称）,businessExt（通话记录），activityName（活动名称（广告外投）），userNumber（预约人数），craftsmanNickName（手艺人昵称），careerName（手艺人职业名称），careerUserId（手艺人用户id），careerContactMobile（手艺人联系电话），activityTitle（直播预约标题），leadsType（leads类型）,prizeInfo(奖品信息)
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 领取的预约礼名称
	 */
	@ApiField("gift_name")
	private String giftName;

	/**
	 * 电话客资，是否接起，"是"或者"否"，仅电话客资会有值
	 */
	@ApiField("is_answer")
	private String isAnswer;

	/**
	 * 购买的商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商家备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 客资记录id
	 */
	@ApiField("reservation_record_id")
	private String reservationRecordId;

	/**
	 * 店铺所在的城市
	 */
	@ApiField("shop_city")
	private String shopCity;

	/**
	 * 客资所属的门店名称，分店名
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * PROCESSING("待跟进"),
CUSTOMER_ACCEPTED("待到店"),
CUSTOMER_ARRIVED("已到店")，CUSTOMER_REJECTED("无意向"), 
IN_BLACK_LIST("黑名单")
	 */
	@ApiField("status")
	private String status;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCampName() {
		return this.campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGiftName() {
		return this.giftName;
	}
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public String getIsAnswer() {
		return this.isAnswer;
	}
	public void setIsAnswer(String isAnswer) {
		this.isAnswer = isAnswer;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getReservationRecordId() {
		return this.reservationRecordId;
	}
	public void setReservationRecordId(String reservationRecordId) {
		this.reservationRecordId = reservationRecordId;
	}

	public String getShopCity() {
		return this.shopCity;
	}
	public void setShopCity(String shopCity) {
		this.shopCity = shopCity;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
