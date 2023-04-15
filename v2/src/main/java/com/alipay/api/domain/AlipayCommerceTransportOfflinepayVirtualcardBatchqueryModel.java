package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟卡信息查询
 *
 * @author auto create
 * @since 1.0, 2022-11-18 20:53:51
 */
public class AlipayCommerceTransportOfflinepayVirtualcardBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3474928429386727724L;

	/**
	 * 卡号。和卡类型一起，唯一确定一张卡。为空时将返回该用户该卡类型下的所有卡。
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡类型。每种虚拟卡都有对应的卡类型，该值由支付宝分配给商户。
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 是否返回包含已删除卡片
false：不返回已删除卡片，默认值；
true：返回已删除卡片
	 */
	@ApiField("include_deleted")
	private Boolean includeDeleted;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

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

	public Boolean getIncludeDeleted() {
		return this.includeDeleted;
	}
	public void setIncludeDeleted(Boolean includeDeleted) {
		this.includeDeleted = includeDeleted;
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
