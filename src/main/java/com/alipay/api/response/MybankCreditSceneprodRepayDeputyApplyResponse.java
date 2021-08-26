package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SceneProdDeputyPaymentBillQuery;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.repay.deputy.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-27 14:37:52
 */
public class MybankCreditSceneprodRepayDeputyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1715355731616672347L;

	/** 
	 * 网商分配的申请单号
	 */
	@ApiField("app_seqno")
	private String appSeqno;

	/** 
	 * 代客还款账单详情
	 */
	@ApiListField("bill_list")
	@ApiField("scene_prod_deputy_payment_bill_query")
	private List<SceneProdDeputyPaymentBillQuery> billList;

	/** 
	 * 网商分配的支用号
	 */
	@ApiField("drawdown_no")
	private String drawdownNo;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setAppSeqno(String appSeqno) {
		this.appSeqno = appSeqno;
	}
	public String getAppSeqno( ) {
		return this.appSeqno;
	}

	public void setBillList(List<SceneProdDeputyPaymentBillQuery> billList) {
		this.billList = billList;
	}
	public List<SceneProdDeputyPaymentBillQuery> getBillList( ) {
		return this.billList;
	}

	public void setDrawdownNo(String drawdownNo) {
		this.drawdownNo = drawdownNo;
	}
	public String getDrawdownNo( ) {
		return this.drawdownNo;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
