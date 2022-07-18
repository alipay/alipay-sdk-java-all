package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易还款账单创建接口
 *
 * @author auto create
 * @since 1.0, 2019-11-25 20:58:35
 */
public class AlipayTradeRepaybillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2179844773838474818L;

	/**
	 * 本次创建账单的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 账单产品类型，标识业务用，具体值支付宝根据业务接入场景进行分配。
	 */
	@ApiField("bill_product")
	private String billProduct;

	/**
	 * 外部账单编号，每个外部编号对应一个唯一的账单，用于幂等使用
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/**
	 * 还款账单的用户正常最晚还款日期。 格式为：yyyy-MM-dd hh:mm:ss。
	 */
	@ApiField("repay_expire_date")
	private String repayExpireDate;

	/**
	 * 账单包含的还款交易详情
	 */
	@ApiListField("repay_trade_details")
	@ApiField("repay_trade_detail")
	private List<RepayTradeDetail> repayTradeDetails;

	/**
	 * 账单归属主体，蚂蚁统一会员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillProduct() {
		return this.billProduct;
	}
	public void setBillProduct(String billProduct) {
		this.billProduct = billProduct;
	}

	public String getOutBillNo() {
		return this.outBillNo;
	}
	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
	}

	public String getRepayExpireDate() {
		return this.repayExpireDate;
	}
	public void setRepayExpireDate(String repayExpireDate) {
		this.repayExpireDate = repayExpireDate;
	}

	public List<RepayTradeDetail> getRepayTradeDetails() {
		return this.repayTradeDetails;
	}
	public void setRepayTradeDetails(List<RepayTradeDetail> repayTradeDetails) {
		this.repayTradeDetails = repayTradeDetails;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
