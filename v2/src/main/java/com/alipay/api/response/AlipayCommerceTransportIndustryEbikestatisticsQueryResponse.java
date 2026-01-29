package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EbikeBindServiceStatisticsDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.industry.ebikestatistics.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-17 15:42:38
 */
public class AlipayCommerceTransportIndustryEbikestatisticsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7643281341992718156L;

	/** 
	 * query_type=month，date_str格式为yyyyMM； query_type=day，date_str格式为yyyyMMdd
	 */
	@ApiField("date_str")
	private String dateStr;

	/** 
	 * 页码，默认值1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页大小，默认值50
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询类型（month/day） 
month：查询月数据 day：查询日数据
	 */
	@ApiField("query_type")
	private String queryType;

	/** 
	 * 两轮车服务绑车相关服务统计数据
	 */
	@ApiListField("record_list")
	@ApiField("ebike_bind_service_statistics_d_t_o")
	private List<EbikeBindServiceStatisticsDTO> recordList;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}
	public String getDateStr( ) {
		return this.dateStr;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	public String getQueryType( ) {
		return this.queryType;
	}

	public void setRecordList(List<EbikeBindServiceStatisticsDTO> recordList) {
		this.recordList = recordList;
	}
	public List<EbikeBindServiceStatisticsDTO> getRecordList( ) {
		return this.recordList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
