package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金订单信息
 *
 * @author auto create
 * @since 1.0, 2019-02-25 15:20:02
 */
public class VcpAssetBillInfo extends AlipayObject {

	private static final long serialVersionUID = 3489529994785484669L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务时间
	 */
	@ApiField("biz_dt")
	private String bizDt;

	/**
	 * 资金流场景
	 */
	@ApiField("fund_scence")
	private String fundScence;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(String bizDt) {
		this.bizDt = bizDt;
	}

	public String getFundScence() {
		return this.fundScence;
	}
	public void setFundScence(String fundScence) {
		this.fundScence = fundScence;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
