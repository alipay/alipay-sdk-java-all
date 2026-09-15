package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MedicalHmAssessmentRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.assessment.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 17:38:55
 */
public class AlipayCommerceMedicalHmAssessmentBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8522778514757316775L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("medical_hm_assessment_record")
	private List<MedicalHmAssessmentRecord> data;

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

	public void setData(List<MedicalHmAssessmentRecord> data) {
		this.data = data;
	}
	public List<MedicalHmAssessmentRecord> getData( ) {
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
