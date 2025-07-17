package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询购卡订单上签署的协议内容
 *
 * @author auto create
 * @since 1.0, 2025-06-17 15:52:30
 */
public class AlipayCommerceMerchantcardAgreementcontentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3518531963428822632L;

	/**
	 * 售卖订单Id(安心付卡号)
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 购卡用户的openId，out_order_no查询时，user_id和open_id必选一个
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 售卖订单(安心付卡)的外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 购卡用户uid，当使用out_order_no查询时，user_id和open_id必选一个
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
