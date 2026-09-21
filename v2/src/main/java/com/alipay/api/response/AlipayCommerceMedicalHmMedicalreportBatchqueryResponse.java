package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MedicalHmMedicalReport;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.medicalreport.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 17:42:51
 */
public class AlipayCommerceMedicalHmMedicalreportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8114781448889171441L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("medical_hm_medical_report")
	private List<MedicalHmMedicalReport> data;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录条数
	 */
	@ApiField("total")
	private Long total;

	public void setData(List<MedicalHmMedicalReport> data) {
		this.data = data;
	}
	public List<MedicalHmMedicalReport> getData( ) {
		return this.data;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
