package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 亲情卡业务方通用用户模型
 *
 * @author auto create
 * @since 1.0, 2023-05-04 21:15:09
 */
public class FamilyPayBizUserInfo extends AlipayObject {

	private static final long serialVersionUID = 6584164695666776875L;

	/**
	 * 支付宝user_id，代表亲情卡赠卡人或者赠卡人
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务方用户id
	 */
	@ApiField("biz_user_id")
	private String bizUserId;

	/**
	 * 赠卡人在业务方的注册时间，用于安全校验
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 用户身份证号，用于安全校验
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 用户手机号，用于安全校验
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 用户实名姓名，用于安全校验
	 */
	@ApiField("name")
	private String name;

	/**
	 * 业务平台用户昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 支付宝user_id，代表亲情卡赠卡人或者赠卡人
	 */
	@ApiField("open_id")
	private String openId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizUserId() {
		return this.bizUserId;
	}
	public void setBizUserId(String bizUserId) {
		this.bizUserId = bizUserId;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
