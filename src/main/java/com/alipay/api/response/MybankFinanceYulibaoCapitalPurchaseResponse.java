package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.yulibao.capital.purchase response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-02 15:47:19
 */
public class MybankFinanceYulibaoCapitalPurchaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2366465947813917114L;

	/** 
	 * 余利宝内部的交易流水号。
	 */
	@ApiField("inner_biz_no")
	private String innerBizNo;

	/** 
	 * 交易结果的备注信息。
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 交易结果，目前会有3种状态值，1：success，表示交易成功、2：fail，表示交易失败:、3：inprocess，表示交易处理中。其中交易处理中的状态可以使用回查交易历史的方式查看其处理结果。
	 */
	@ApiField("trans_result")
	private String transResult;

	public void setInnerBizNo(String innerBizNo) {
		this.innerBizNo = innerBizNo;
	}
	public String getInnerBizNo( ) {
		return this.innerBizNo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setTransResult(String transResult) {
		this.transResult = transResult;
	}
	public String getTransResult( ) {
		return this.transResult;
	}

}
