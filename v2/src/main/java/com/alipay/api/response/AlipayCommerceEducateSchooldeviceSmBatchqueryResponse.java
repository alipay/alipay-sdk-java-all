package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduSmActivityDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.schooldevice.sm.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-22 11:12:36
 */
public class AlipayCommerceEducateSchooldeviceSmBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2278733638165324886L;

	/** 
	 * 间连商户报名查询结果
	 */
	@ApiListField("edu_sm_activity_dto_list")
	@ApiField("edu_sm_activity_d_t_o")
	private List<EduSmActivityDTO> eduSmActivityDtoList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 记录总数
	 */
	@ApiField("total_result_size")
	private Long totalResultSize;

	public void setEduSmActivityDtoList(List<EduSmActivityDTO> eduSmActivityDtoList) {
		this.eduSmActivityDtoList = eduSmActivityDtoList;
	}
	public List<EduSmActivityDTO> getEduSmActivityDtoList( ) {
		return this.eduSmActivityDtoList;
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

	public void setTotalResultSize(Long totalResultSize) {
		this.totalResultSize = totalResultSize;
	}
	public Long getTotalResultSize( ) {
		return this.totalResultSize;
	}

}
