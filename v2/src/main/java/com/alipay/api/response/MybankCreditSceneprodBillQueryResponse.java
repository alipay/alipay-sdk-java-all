package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SceneProdBillDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:19:05
 */
public class MybankCreditSceneprodBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4558192264745687841L;

	/** 
	 * 网商银行申请单号
	 */
	@ApiField("app_seqno")
	private String appSeqno;

	/** 
	 * 账单列表
	 */
	@ApiListField("bill_list")
	@ApiField("scene_prod_bill_detail")
	private List<SceneProdBillDetail> billList;

	/** 
	 * 支用号，银行直投模式这个才有值
	 */
	@ApiField("drawdown_no")
	private String drawdownNo;

	/** 
	 * 支用逾期天数
	 */
	@ApiField("ovd_days")
	private String ovdDays;

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

	public void setBillList(List<SceneProdBillDetail> billList) {
		this.billList = billList;
	}
	public List<SceneProdBillDetail> getBillList( ) {
		return this.billList;
	}

	public void setDrawdownNo(String drawdownNo) {
		this.drawdownNo = drawdownNo;
	}
	public String getDrawdownNo( ) {
		return this.drawdownNo;
	}

	public void setOvdDays(String ovdDays) {
		this.ovdDays = ovdDays;
	}
	public String getOvdDays( ) {
		return this.ovdDays;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
