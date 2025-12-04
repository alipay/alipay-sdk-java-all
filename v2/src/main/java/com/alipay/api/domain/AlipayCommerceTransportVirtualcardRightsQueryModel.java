package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户权益查询
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:05
 */
public class AlipayCommerceTransportVirtualcardRightsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4382219145467873695L;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 支付宝分配的卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 用户open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户权益类型
	 */
	@ApiListField("right_type_list")
	@ApiField("string")
	private List<String> rightTypeList;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getRightTypeList() {
		return this.rightTypeList;
	}
	public void setRightTypeList(List<String> rightTypeList) {
		this.rightTypeList = rightTypeList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
