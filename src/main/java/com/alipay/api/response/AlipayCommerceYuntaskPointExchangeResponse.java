package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.point.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-31 19:48:59
 */
public class AlipayCommerceYuntaskPointExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2315429224681436752L;

	/** 
	 * 积分流水id
	 */
	@ApiField("instruction_id")
	private String instructionId;

	/** 
	 * 结果信息
	 */
	@ApiField("messsage")
	private String messsage;

	/** 
	 * 兑换积分数
	 */
	@ApiField("point")
	private String point;

	/** 
	 * 处理结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}
	public String getInstructionId( ) {
		return this.instructionId;
	}

	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	public String getMesssage( ) {
		return this.messsage;
	}

	public void setPoint(String point) {
		this.point = point;
	}
	public String getPoint( ) {
		return this.point;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
