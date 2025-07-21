package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询短信模板列表
 *
 * @author auto create
 * @since 1.0, 2024-02-26 11:45:52
 */
public class AlipayCloudCloudpromoMessageTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1695847483386899688L;

	/**
	 * 展示第几页的模板信息。默认取值为1。
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页展示的模板个数，取值范围：1~100。默认值为10。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 模板code
	 */
	@ApiField("template_code")
	private String templateCode;

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

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
