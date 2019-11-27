package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询模板的实例化接口
 *
 * @author auto create
 * @since 1.0, 2018-01-11 16:10:40
 */
public class AlipayOpenMiniTemplateInstantiationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3647996872411178527L;

	/**
	 * 查询的页数，默认第一页
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页的数量，最多查询50个，默认查询10个
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板的版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
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
