package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdAccountPrincipalInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.pageprincipal.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 10:42:32
 */
public class AlipayDataDataserviceAdPageprincipalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6574248995811267284L;

	/** 
	 * 查询结果数据列表，当无数据时，查询数据为空
	 */
	@ApiListField("data_list")
	@ApiField("ad_account_principal_info_response")
	private List<AdAccountPrincipalInfoResponse> dataList;

	/** 
	 * 分页查询的记录总条数，单位：条
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<AdAccountPrincipalInfoResponse> dataList) {
		this.dataList = dataList;
	}
	public List<AdAccountPrincipalInfoResponse> getDataList( ) {
		return this.dataList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
