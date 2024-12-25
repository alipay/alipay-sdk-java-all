package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约合同模板配置查询列表服务
 *
 * @author auto create
 * @since 1.0, 2023-05-18 15:28:41
 */
public class AlipayFinancialnetAuthEcsignTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1271881322594968836L;

	/**
	 * 页，默认1，必须要大于0。
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页面大小，默认10。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 合同模板ID，如果存在则为唯一值，由系统生成，在保存成功后会返回该值。
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 合同模板名称，非唯一值，由用户自行输入。
	 */
	@ApiField("template_name")
	private String templateName;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
