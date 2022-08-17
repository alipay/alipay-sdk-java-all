package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreditPayOrderQueryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.pay.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-20 20:41:17
 */
public class MybankCreditLoantradePayOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6167677268711489848L;

	/** 
	 * 系统异常
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 查询接口列表
	 */
	@ApiListField("query_result")
	@ApiField("credit_pay_order_query_v_o")
	private List<CreditPayOrderQueryVO> queryResult;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private String success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setQueryResult(List<CreditPayOrderQueryVO> queryResult) {
		this.queryResult = queryResult;
	}
	public List<CreditPayOrderQueryVO> getQueryResult( ) {
		return this.queryResult;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
