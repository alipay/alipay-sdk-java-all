package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询使用ISV模板的托管小程序列表
 *
 * @author auto create
 * @since 1.0, 2018-01-24 23:51:50
 */
public class AlipayOpenMiniTemplateUsageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8686257822378363875L;

	/**
	 * 查询的页数，默认第一页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页的数量，最多查询50个，默认查询10个
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板小程序的版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
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

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

}
