package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 团体资金单据明细，详细描述每笔单据中的资金来源去向
 *
 * @author auto create
 * @since 1.0, 2019-05-13 16:48:58
 */
public class GroupFundDetail extends AlipayObject {

	private static final long serialVersionUID = 7385984774749313975L;

	/**
	 * 明细金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 收资方支付宝账户ID
	 */
	@ApiField("receiver_user_id")
	private String receiverUserId;

	/**
	 * 出资方支付宝账户ID
	 */
	@ApiField("sender_user_id")
	private String senderUserId;

	/**
	 * 明细状态, VALID: 有效的明细, VERIFY: 有效但待核身, INVAILD: 无效的明细,收款方无收款权限
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getReceiverUserId() {
		return this.receiverUserId;
	}
	public void setReceiverUserId(String receiverUserId) {
		this.receiverUserId = receiverUserId;
	}

	public String getSenderUserId() {
		return this.senderUserId;
	}
	public void setSenderUserId(String senderUserId) {
		this.senderUserId = senderUserId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
