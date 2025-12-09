package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.bill.simple.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-15 10:56:09
 */
public class AlipayUserBillSimpleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4796129723937565758L;

	/** 
	 * 交易金额/转账金额。单位为元
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 业务状态
	 */
	@ApiField("biz_state")
	private String bizState;

	/** 
	 * 业务创建时间
	 */
	@ApiField("gmt_biz_create")
	private Date gmtBizCreate;

	/** 
	 * 资金流入流出类型 IN 表示收入 OUT表示支出
	 */
	@ApiField("in_out_type")
	private String inOutType;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setBizState(String bizState) {
		this.bizState = bizState;
	}
	public String getBizState( ) {
		return this.bizState;
	}

	public void setGmtBizCreate(Date gmtBizCreate) {
		this.gmtBizCreate = gmtBizCreate;
	}
	public Date getGmtBizCreate( ) {
		return this.gmtBizCreate;
	}

	public void setInOutType(String inOutType) {
		this.inOutType = inOutType;
	}
	public String getInOutType( ) {
		return this.inOutType;
	}

}
