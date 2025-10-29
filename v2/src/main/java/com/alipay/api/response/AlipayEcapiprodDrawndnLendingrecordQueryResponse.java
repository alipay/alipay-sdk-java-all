package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LendingRecords;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.lendingrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:03
 */
public class AlipayEcapiprodDrawndnLendingrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5168233852846528613L;

	/** 
	 * 放款流水
	 */
	@ApiListField("lending_records")
	@ApiField("lending_records")
	private List<LendingRecords> lendingRecords;

	/** 
	 * 代表一次请求的唯一编号，用于追溯问题，多方联调查询问题时，ISV 可以提供该RequestId给网关，网关用来查询本次请求的具体日志
	 */
	@ApiField("request_id")
	private String requestId;

	public void setLendingRecords(List<LendingRecords> lendingRecords) {
		this.lendingRecords = lendingRecords;
	}
	public List<LendingRecords> getLendingRecords( ) {
		return this.lendingRecords;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
