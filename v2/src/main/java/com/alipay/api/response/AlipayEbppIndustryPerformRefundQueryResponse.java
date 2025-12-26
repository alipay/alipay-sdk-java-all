package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PerformBill;
import com.alipay.api.domain.PerformRefundQueryRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.perform.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-25 14:07:24
 */
public class AlipayEbppIndustryPerformRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4418298398697921295L;

	/** 
	 * 行业受理平台的主订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 订单详情
	 */
	@ApiField("perform_bill")
	private PerformBill performBill;

	/** 
	 * 退款单明细
	 */
	@ApiListField("refund_record_list")
	@ApiField("perform_refund_query_record")
	private List<PerformRefundQueryRecord> refundRecordList;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setPerformBill(PerformBill performBill) {
		this.performBill = performBill;
	}
	public PerformBill getPerformBill( ) {
		return this.performBill;
	}

	public void setRefundRecordList(List<PerformRefundQueryRecord> refundRecordList) {
		this.refundRecordList = refundRecordList;
	}
	public List<PerformRefundQueryRecord> getRefundRecordList( ) {
		return this.refundRecordList;
	}

}
