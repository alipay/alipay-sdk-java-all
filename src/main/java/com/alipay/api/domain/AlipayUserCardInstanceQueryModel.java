package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡实例查询
 *
 * @author auto create
 * @since 1.0, 2022-11-04 10:32:30
 */
public class AlipayUserCardInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4151614142687344472L;

	/**
	 * card_no：商家业务系统中的卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * open_id:唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * user_id:蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
