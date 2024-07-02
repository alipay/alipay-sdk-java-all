package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 钱包操作明细
 *
 * @author auto create
 * @since 1.0, 2024-04-15 11:33:43
 */
public class WalletOperationDetails extends AlipayObject {

	private static final long serialVersionUID = 2752399311682664257L;

	/**
	 * 业务类型【枚举值】
核销: PAYMENT
核销退: REFUND
充值: DEPOSIT
提现: WITHDRAW
充退: RETURN
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 总条数
	 */
	@ApiField("trans_dt")
	private String transDt;

	/**
	 * 交易订单
	 */
	@ApiListField("trans_order")
	@ApiField("string")
	private List<String> transOrder;

	/**
	 * 交易金额，单位元
	 */
	@ApiField("wallet_trans_amount")
	private String walletTransAmount;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getTransDt() {
		return this.transDt;
	}
	public void setTransDt(String transDt) {
		this.transDt = transDt;
	}

	public List<String> getTransOrder() {
		return this.transOrder;
	}
	public void setTransOrder(List<String> transOrder) {
		this.transOrder = transOrder;
	}

	public String getWalletTransAmount() {
		return this.walletTransAmount;
	}
	public void setWalletTransAmount(String walletTransAmount) {
		this.walletTransAmount = walletTransAmount;
	}

}
