package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销订单操作接口
 *
 * @author auto create
 * @since 1.0, 2025-01-16 10:38:59
 */
public class AlipayCommerceMerchantcardDeductionorderSetModel extends AlipayObject {

	private static final long serialVersionUID = 1148287643134425495L;

	/**
	 * 售卖订单id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 核销订单id
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * （1）退款时：当funding_model=PREPAID，会退次数；
当funding_model=PAY_AFTER_CONSUMPTION_MODE，不会退次数；
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * (1) 当 card_type=AXF_MONEY_TIME_CARD && operation_type=REFUND 时，该字段代表退款次数，会逆向按顺序依次退款
	 */
	@ApiField("operation_value")
	private Long operationValue;

	/**
	 * 幂等号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
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

	public Long getOperationValue() {
		return this.operationValue;
	}
	public void setOperationValue(Long operationValue) {
		this.operationValue = operationValue;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
