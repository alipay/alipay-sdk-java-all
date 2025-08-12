package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.isvfrozen.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-16 13:37:15
 */
public class AlipayCommerceEcCreditIsvfrozenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5527819723753554961L;

	/** 
	 * 已冻结金额，单位元，精确到分
	 */
	@ApiField("frozen_amount")
	private String frozenAmount;

	/** 
	 * 冻结时间，精确到秒
	 */
	@ApiField("frozen_time")
	private Date frozenTime;

	/** 
	 * 冻结状态，FROZEN-冻结中、CLOSED-已关单（冻结额度已全额请款或者解冻都会触发关单）
	 */
	@ApiField("status")
	private String status;

	public void setFrozenAmount(String frozenAmount) {
		this.frozenAmount = frozenAmount;
	}
	public String getFrozenAmount( ) {
		return this.frozenAmount;
	}

	public void setFrozenTime(Date frozenTime) {
		this.frozenTime = frozenTime;
	}
	public Date getFrozenTime( ) {
		return this.frozenTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
