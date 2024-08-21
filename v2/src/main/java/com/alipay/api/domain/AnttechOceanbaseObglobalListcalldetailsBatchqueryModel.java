package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询呼叫详情列表
 *
 * @author auto create
 * @since 1.0, 2023-10-23 13:48:47
 */
public class AnttechOceanbaseObglobalListcalldetailsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2268942226877393125L;

	/**
	 * 查询呼叫记录详情列表请求体
	 */
	@ApiField("list_call_detail_records_request")
	private ListCallDetailRecordsRequest listCallDetailRecordsRequest;

	public ListCallDetailRecordsRequest getListCallDetailRecordsRequest() {
		return this.listCallDetailRecordsRequest;
	}
	public void setListCallDetailRecordsRequest(ListCallDetailRecordsRequest listCallDetailRecordsRequest) {
		this.listCallDetailRecordsRequest = listCallDetailRecordsRequest;
	}

}
