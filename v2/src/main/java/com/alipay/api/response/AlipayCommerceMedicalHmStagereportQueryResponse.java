package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HmStageReport;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.stagereport.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 19:10:19
 */
public class AlipayCommerceMedicalHmStagereportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2479969643743137342L;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * null
	 */
	@ApiListField("reports")
	@ApiField("hm_stage_report")
	private List<HmStageReport> reports;

	/** 
	 * 总条数
	 */
	@ApiField("total")
	private String total;

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setReports(List<HmStageReport> reports) {
		this.reports = reports;
	}
	public List<HmStageReport> getReports( ) {
		return this.reports;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

}
