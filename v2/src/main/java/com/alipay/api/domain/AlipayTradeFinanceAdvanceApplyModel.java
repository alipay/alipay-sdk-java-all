package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快收垫资申请
 *
 * @author auto create
 * @since 1.0, 2025-09-01 10:31:48
 */
public class AlipayTradeFinanceAdvanceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2142167833496178467L;

	/**
	 * 垫资申请金额，单位元，精确到小数点后2位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务时间，即接入方认为的垫资申请的业务预期时间
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 扩展字段，会用于保司or其他机构审核用
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部订单号，接入方的业务单据唯一id
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部请求号，幂等字段
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 结算单号，预下单时通过ext_info返回
	 */
	@ApiField("settlement_no")
	private String settlementNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSettlementNo() {
		return this.settlementNo;
	}
	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}

}
