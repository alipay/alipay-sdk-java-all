package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 周期卡订单操作接口
 *
 * @author auto create
 * @since 1.0, 2024-11-15 15:53:19
 */
public class AlipayCommerceMerchantcardOrderSetModel extends AlipayObject {

	private static final long serialVersionUID = 7754817586322289199L;

	/**
	 * 取消期数列表
	 */
	@ApiListField("cancel_period_list")
	@ApiField("string")
	private List<String> cancelPeriodList;

	/**
	 * 售卖订单ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 卡适用范围
【CANCEL】 AXF_MERCHANT_PERIOD_PAY、 AXF_MERCHANT_PERIOD_PAY_INDIRECT
【PAUSE/RECOVER】AXF_MERCHANT_PERIOD_PAY、 AXF_MERCHANT_PERIOD_PAY_INDIRECT
【UNBIND_CARD】AXF_MERCHANT_PERIOD_PAY、 AXF_MERCHANT_PERIOD_PAY_INDIRECT、AXF_MONEY_TIME_CARD、AXF_MONEY_CARD
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getCancelPeriodList() {
		return this.cancelPeriodList;
	}
	public void setCancelPeriodList(List<String> cancelPeriodList) {
		this.cancelPeriodList = cancelPeriodList;
	}

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

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
