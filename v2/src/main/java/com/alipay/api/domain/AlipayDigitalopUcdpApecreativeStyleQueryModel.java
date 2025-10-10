package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询风格表
 *
 * @author auto create
 * @since 1.0, 2023-09-13 16:13:15
 */
public class AlipayDigitalopUcdpApecreativeStyleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4732384577586223442L;

	/**
	 * page唯一用于分页。如果传空，默认为第一页
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * pagesize唯一，每页查询出来的个数。如果没传，默认传5
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 风格图片的行业信息。通过行业信息来查询图片。
	 */
	@ApiField("profession")
	private String profession;

	/**
	 * projectId唯一用于鉴权使用
	 */
	@ApiField("project_id")
	private String projectId;

	public String getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProfession() {
		return this.profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
