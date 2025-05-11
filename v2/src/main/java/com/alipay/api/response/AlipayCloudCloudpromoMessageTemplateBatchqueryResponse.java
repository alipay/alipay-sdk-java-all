package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SmsTemplateDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.message.template.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-26 11:46:57
 */
public class AlipayCloudCloudpromoMessageTemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6574637482198794467L;

	/** 
	 * 页码。默认取值为1。
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页展示的模板个数。取值范围：1~100。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 模板列表
	 */
	@ApiListField("template_list")
	@ApiField("sms_template_detail")
	private List<SmsTemplateDetail> templateList;

	/** 
	 * 模板总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTemplateList(List<SmsTemplateDetail> templateList) {
		this.templateList = templateList;
	}
	public List<SmsTemplateDetail> getTemplateList( ) {
		return this.templateList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
