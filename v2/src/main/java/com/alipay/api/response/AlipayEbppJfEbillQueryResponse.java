package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.ebill.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:51
 */
public class AlipayEbppJfEbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3552433711674839975L;

	/** 
	 * 扣款金额
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/** 
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * 订单对应的状态
	 */
	@ApiField("bill_status")
	private String billStatus;

	/** 
	 * 户号
	 */
	@ApiField("billkey")
	private String billkey;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 失败代码
	 */
	@ApiField("fail_code")
	private String failCode;

	/** 
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 机构服务码
	 */
	@ApiField("inst_code")
	private String instCode;

	/** 
	 * 子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	public String getBillAmount( ) {
		return this.billAmount;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBillDate( ) {
		return this.billDate;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public String getBillStatus( ) {
		return this.billStatus;
	}

	public void setBillkey(String billkey) {
		this.billkey = billkey;
	}
	public String getBillkey( ) {
		return this.billkey;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}
	public String getFailCode( ) {
		return this.failCode;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	public String getInstCode( ) {
		return this.instCode;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	public String getSubBizType( ) {
		return this.subBizType;
	}

}
