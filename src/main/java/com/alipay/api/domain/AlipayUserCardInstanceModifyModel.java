package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡实例修改
 *
 * @author auto create
 * @since 1.0, 2022-11-04 10:32:39
 */
public class AlipayUserCardInstanceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1489676732838862857L;

	/**
	 * active_date：卡生效日期，yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("active_date")
	private Date activeDate;

	/**
	 * balance：余额，数字格式，最多支持2位小数
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * before_level：原先的等级名称
	 */
	@ApiField("before_level")
	private String beforeLevel;

	/**
	 * card_no：商家业务系统中的卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * changed_balance：变动的余额，数字格式，最多支持2位小数点
	 */
	@ApiField("changed_balance")
	private String changedBalance;

	/**
	 * changed_point：变动的积分，数字格式，最多支持2位小数点
	 */
	@ApiField("changed_point")
	private String changedPoint;

	/**
	 * expiry_date：卡失效日期，yyyy-MM-dd HH:mm:ss格式，若alipay.user.card.template.create接口设置的date_type为PERIOD，则此字段必传
	 */
	@ApiField("expiry_date")
	private Date expiryDate;

	/**
	 * level：等级名称
	 */
	@ApiField("level")
	private String level;

	/**
	 * 唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * point：积分，数字格式，最多支持2位小数
	 */
	@ApiField("point")
	private String point;

	/**
	 * user_id：蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getActiveDate() {
		return this.activeDate;
	}
	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBeforeLevel() {
		return this.beforeLevel;
	}
	public void setBeforeLevel(String beforeLevel) {
		this.beforeLevel = beforeLevel;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getChangedBalance() {
		return this.changedBalance;
	}
	public void setChangedBalance(String changedBalance) {
		this.changedBalance = changedBalance;
	}

	public String getChangedPoint() {
		return this.changedPoint;
	}
	public void setChangedPoint(String changedPoint) {
		this.changedPoint = changedPoint;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPoint() {
		return this.point;
	}
	public void setPoint(String point) {
		this.point = point;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
