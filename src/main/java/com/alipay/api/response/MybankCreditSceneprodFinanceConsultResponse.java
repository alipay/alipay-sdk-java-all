package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.finance.consult response.
 * 
 * @author auto create
 * @since 1.0, 2018-09-25 16:28:24
 */
public class MybankCreditSceneprodFinanceConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3139243436798916312L;

	/** 
	 * 资方编码
	 */
	@ApiField("finance_inst_code")
	private String financeInstCode;

	/** 
	 * 资方名称
	 */
	@ApiField("finance_inst_name")
	private String financeInstName;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 资方申请编号，用于在mybank.credit.sceneprod.loan.apply 接口申请贷款时，填充finance_inst_iprole_id 字段的值
	 */
	@ApiField("route_no")
	private String routeNo;

	/** 
	 * 路由查询状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setFinanceInstCode(String financeInstCode) {
		this.financeInstCode = financeInstCode;
	}
	public String getFinanceInstCode( ) {
		return this.financeInstCode;
	}

	public void setFinanceInstName(String financeInstName) {
		this.financeInstName = financeInstName;
	}
	public String getFinanceInstName( ) {
		return this.financeInstName;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setRouteNo(String routeNo) {
		this.routeNo = routeNo;
	}
	public String getRouteNo( ) {
		return this.routeNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
