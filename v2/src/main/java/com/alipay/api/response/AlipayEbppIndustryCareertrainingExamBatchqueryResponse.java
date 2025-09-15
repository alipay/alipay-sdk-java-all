package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExamVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.exam.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:12:34
 */
public class AlipayEbppIndustryCareertrainingExamBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5443957218919347165L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("exam_v_o")
	private List<ExamVO> list;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 最大50
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 考试总数量
	 */
	@ApiField("total")
	private String total;

	public void setList(List<ExamVO> list) {
		this.list = list;
	}
	public List<ExamVO> getList( ) {
		return this.list;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

}
