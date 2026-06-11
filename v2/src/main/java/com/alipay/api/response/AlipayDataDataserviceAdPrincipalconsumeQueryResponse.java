package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrincipalConsumeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principalconsume.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-19 17:22:44
 */
public class AlipayDataDataserviceAdPrincipalconsumeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6878429738915474482L;

	/** 
	 * 查询结果数据列表，当无数据时，查询数据为空
	 */
	@ApiListField("data_list")
	@ApiField("principal_consume_detail")
	private List<PrincipalConsumeDetail> dataList;

	/** 
	 * 分页查询的记录总条数，单位：条
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<PrincipalConsumeDetail> dataList) {
		this.dataList = dataList;
	}
	public List<PrincipalConsumeDetail> getDataList( ) {
		return this.dataList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
