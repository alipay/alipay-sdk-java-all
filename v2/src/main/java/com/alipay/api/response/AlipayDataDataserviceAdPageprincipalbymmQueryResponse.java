package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenPrincipalQueryForMMResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.pageprincipalbymm.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 16:47:26
 */
public class AlipayDataDataserviceAdPageprincipalbymmQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8465626353258719227L;

	/** 
	 * 查询结果数据列表，当无数据时，查询数据为空
	 */
	@ApiListField("data_list")
	@ApiField("open_principal_query_for_m_m_response")
	private List<OpenPrincipalQueryForMMResponse> dataList;

	/** 
	 * 分页查询的记录总条数，单位：条
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<OpenPrincipalQueryForMMResponse> dataList) {
		this.dataList = dataList;
	}
	public List<OpenPrincipalQueryForMMResponse> getDataList( ) {
		return this.dataList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
