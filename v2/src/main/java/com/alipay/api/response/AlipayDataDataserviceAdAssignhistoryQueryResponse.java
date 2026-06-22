package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssignFinanceDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.assignhistory.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-01 13:32:45
 */
public class AlipayDataDataserviceAdAssignhistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2729629426977944533L;

	/** 
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("assign_finance_detail")
	private List<AssignFinanceDetail> dataList;

	/** 
	 * 条数
	 */
	@ApiField("total")
	private String total;

	public void setDataList(List<AssignFinanceDetail> dataList) {
		this.dataList = dataList;
	}
	public List<AssignFinanceDetail> getDataList( ) {
		return this.dataList;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

}
