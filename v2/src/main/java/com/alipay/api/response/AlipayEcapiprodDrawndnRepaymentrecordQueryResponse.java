package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RepaymentRecords;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.repaymentrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:29
 */
public class AlipayEcapiprodDrawndnRepaymentrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2295888598372516391L;

	/** 
	 * 还款流水
	 */
	@ApiListField("repayment_records")
	@ApiField("repayment_records")
	private List<RepaymentRecords> repaymentRecords;

	/** 
	 * 唯一标识这次请求
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRepaymentRecords(List<RepaymentRecords> repaymentRecords) {
		this.repaymentRecords = repaymentRecords;
	}
	public List<RepaymentRecords> getRepaymentRecords( ) {
		return this.repaymentRecords;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
