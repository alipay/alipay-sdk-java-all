package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PageTemplateInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.pagetemplate.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-09 11:36:55
 */
public class DatadigitalFincloudFinsaasDesignPagetemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1321539919457279845L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 该查询的数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 运营任务列表
	 */
	@ApiListField("template_list")
	@ApiField("page_template_info_d_t_o")
	private List<PageTemplateInfoDTO> templateList;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

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

	public void setTemplateList(List<PageTemplateInfoDTO> templateList) {
		this.templateList = templateList;
	}
	public List<PageTemplateInfoDTO> getTemplateList( ) {
		return this.templateList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
