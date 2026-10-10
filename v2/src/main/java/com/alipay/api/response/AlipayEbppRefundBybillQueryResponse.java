package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EbppRefundInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.refund.bybill.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-22 16:12:55
 */
public class AlipayEbppRefundBybillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7678547427333944461L;

	/** 
	 * 业务受理平台业务28位订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 退款信息的集合
	 */
	@ApiListField("refund_info_list")
	@ApiField("ebpp_refund_info")
	private List<EbppRefundInfo> refundInfoList;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setRefundInfoList(List<EbppRefundInfo> refundInfoList) {
		this.refundInfoList = refundInfoList;
	}
	public List<EbppRefundInfo> getRefundInfoList( ) {
		return this.refundInfoList;
	}

}
