package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子订单数据
 *
 * @author auto create
 * @since 1.0, 2022-06-17 17:00:30
 */
public class SubOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 8828624236826156617L;

	/**
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 户号
	 */
	@ApiField("billkey")
	private String billkey;

	/**
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 子订单状态:
I-等待付款 P-已支付 C-单据关闭 
F-失败  S-成功
	 */
	@ApiField("status")
	private String status;

	/**
	 * 水费：WATER
电费：ELECTRIC
燃气费：GAS
暖气费：HEATING
有限电视：CATV
固话和宽带都是：COMMUN
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 子订单流水号
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillkey() {
		return this.billkey;
	}
	public void setBillkey(String billkey) {
		this.billkey = billkey;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getSubOrderNo() {
		return this.subOrderNo;
	}
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

}
