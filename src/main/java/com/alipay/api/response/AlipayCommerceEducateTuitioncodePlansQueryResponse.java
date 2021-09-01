package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstalmentPlanDetailTuitionDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.tuitioncode.plans.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-08 19:25:14
 */
public class AlipayCommerceEducateTuitioncodePlansQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6462591561234846627L;

	/** 
	 * 到账明细列表
	 */
	@ApiListField("data")
	@ApiField("instalment_plan_detail_tuition_d_t_o")
	private List<InstalmentPlanDetailTuitionDTO> data;

	/** 
	 * 分页号
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setData(List<InstalmentPlanDetailTuitionDTO> data) {
		this.data = data;
	}
	public List<InstalmentPlanDetailTuitionDTO> getData( ) {
		return this.data;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
