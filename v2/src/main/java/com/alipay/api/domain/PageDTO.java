package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分页查询结果
 *
 * @author auto create
 * @since 1.0, 2024-06-11 19:48:00
 */
public class PageDTO extends AlipayObject {

	private static final long serialVersionUID = 1251972891773196179L;

	/**
	 * 返回的业务数据集合
	 */
	@ApiListField("data")
	@ApiField("template_version_d_t_o")
	private List<TemplateVersionDTO> data;

	/**
	 * 当前页号
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 单页大小
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 分页结果total
	 */
	@ApiField("total")
	private Long total;

	public List<TemplateVersionDTO> getData() {
		return this.data;
	}
	public void setData(List<TemplateVersionDTO> data) {
		this.data = data;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
