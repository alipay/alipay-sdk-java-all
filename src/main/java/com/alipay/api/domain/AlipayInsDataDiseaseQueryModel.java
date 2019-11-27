package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险-知识图谱-疾病模糊查询
 *
 * @author auto create
 * @since 1.0, 2019-10-11 14:40:36
 */
public class AlipayInsDataDiseaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2642593434482755711L;

	/**
	 * 疾病名称
	 */
	@ApiField("disease_name")
	private String diseaseName;

	/**
	 * 分页使用，页码，1开始
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 页码大小，最大50
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
