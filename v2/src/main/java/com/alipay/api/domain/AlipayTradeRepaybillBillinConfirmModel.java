package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务订单入账确认
 *
 * @author auto create
 * @since 1.0, 2020-09-30 16:28:57
 */
public class AlipayTradeRepaybillBillinConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5517881735786698944L;

	/**
	 * 本次业务订单入账的金额，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 账单产品类型，标识业务用，具体值支付宝根据业务接入场景进行分配。
	 */
	@ApiField("bill_product")
	private String billProduct;

	/**
	 * 业务债务出账金额，账单入账会触发业务债务出账，对于存在售中退款场景，入账金额和债务出账金额会不一致。例如交易金额为10元，售中退款4元，调用此接口入账则amount应该等于10元，biz_debts_out_amount应该等于6元。
	 */
	@ApiField("biz_debts_out_amount")
	private String bizDebtsOutAmount;

	/**
	 * 本次账单同步关联的支付宝交易单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 外部账单编号，用于控制账单的幂等，同一批账单的业务订单外部账单号为同一个
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/**
	 * 外部请求号,唯一标识一次请求
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 账单归属主体，蚂蚁统一会员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBillProduct() {
		return this.billProduct;
	}
	public void setBillProduct(String billProduct) {
		this.billProduct = billProduct;
	}

	public String getBizDebtsOutAmount() {
		return this.bizDebtsOutAmount;
	}
	public void setBizDebtsOutAmount(String bizDebtsOutAmount) {
		this.bizDebtsOutAmount = bizDebtsOutAmount;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getOutBillNo() {
		return this.outBillNo;
	}
	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
