package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信AE提前收款服务订单放款通知
 *
 * @author auto create
 * @since 1.0, 2023-08-16 19:14:55
 */
public class ZhimaCreditEpAeprepayOrderPrepayModel extends AlipayObject {

	private static final long serialVersionUID = 4525165934771956655L;

	/**
	 * 扩展预留
	 */
	@ApiField("ext_param")
	private ZmEpAePrepayExtParam extParam;

	/**
	 * 是否放款成功
	 */
	@ApiField("make_loan_success")
	private Boolean makeLoanSuccess;

	/**
	 * 订单id
	 */
	@ApiField("order_num")
	private String orderNum;

	/**
	 * 审核单创建时间戳
	 */
	@ApiField("order_time_millis")
	private String orderTimeMillis;

	/**
	 * 商家登陆id
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	/**
	 * 子单担保金额。货币最小单位，如人民币：分
	 */
	@ApiField("sub_order_amt")
	private String subOrderAmt;

	/**
	 * 子单保金额币种
	 */
	@ApiField("sub_order_ccy")
	private String subOrderCcy;

	/**
	 * 用户担保金额。货币最小单位，如人民币：分
	 */
	@ApiField("sub_order_loan_amt")
	private String subOrderLoanAmt;

	/**
	 * 用户担保金额币种
	 */
	@ApiField("sub_order_loan_ccy")
	private String subOrderLoanCcy;

	/**
	 * 子单id
	 */
	@ApiField("sub_order_num")
	private String subOrderNum;

	public ZmEpAePrepayExtParam getExtParam() {
		return this.extParam;
	}
	public void setExtParam(ZmEpAePrepayExtParam extParam) {
		this.extParam = extParam;
	}

	public Boolean getMakeLoanSuccess() {
		return this.makeLoanSuccess;
	}
	public void setMakeLoanSuccess(Boolean makeLoanSuccess) {
		this.makeLoanSuccess = makeLoanSuccess;
	}

	public String getOrderNum() {
		return this.orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getOrderTimeMillis() {
		return this.orderTimeMillis;
	}
	public void setOrderTimeMillis(String orderTimeMillis) {
		this.orderTimeMillis = orderTimeMillis;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

	public String getSubOrderAmt() {
		return this.subOrderAmt;
	}
	public void setSubOrderAmt(String subOrderAmt) {
		this.subOrderAmt = subOrderAmt;
	}

	public String getSubOrderCcy() {
		return this.subOrderCcy;
	}
	public void setSubOrderCcy(String subOrderCcy) {
		this.subOrderCcy = subOrderCcy;
	}

	public String getSubOrderLoanAmt() {
		return this.subOrderLoanAmt;
	}
	public void setSubOrderLoanAmt(String subOrderLoanAmt) {
		this.subOrderLoanAmt = subOrderLoanAmt;
	}

	public String getSubOrderLoanCcy() {
		return this.subOrderLoanCcy;
	}
	public void setSubOrderLoanCcy(String subOrderLoanCcy) {
		this.subOrderLoanCcy = subOrderLoanCcy;
	}

	public String getSubOrderNum() {
		return this.subOrderNum;
	}
	public void setSubOrderNum(String subOrderNum) {
		this.subOrderNum = subOrderNum;
	}

}
