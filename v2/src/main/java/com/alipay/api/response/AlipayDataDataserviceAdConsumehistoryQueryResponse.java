package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrincipalFinanceDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.consumehistory.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-13 17:25:31
 */
public class AlipayDataDataserviceAdConsumehistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7324921573633165881L;

	/** 
	 * 查询结果数据列表，当无数据时，查询数据为空
	 */
	@ApiListField("data_list")
	@ApiField("principal_finance_detail")
	private List<PrincipalFinanceDetail> dataList;

	/** 
	 * 分页查询的记录总条数，单位：条
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<PrincipalFinanceDetail> dataList) {
		this.dataList = dataList;
	}
	public List<PrincipalFinanceDetail> getDataList( ) {
		return this.dataList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
