package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LeadsOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.leads.record.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-27 17:07:00
 */
public class KoubeiServindustryLeadsRecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8697535152576892834L;

	/** 
	 * 客资详情列表
	 */
	@ApiListField("leads_order_info_list")
	@ApiField("leads_order_info")
	private List<LeadsOrderInfo> leadsOrderInfoList;

	/** 
	 * 客资总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setLeadsOrderInfoList(List<LeadsOrderInfo> leadsOrderInfoList) {
		this.leadsOrderInfoList = leadsOrderInfoList;
	}
	public List<LeadsOrderInfo> getLeadsOrderInfoList( ) {
		return this.leadsOrderInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
