package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询风格表布局表及关联表信息
 *
 * @author auto create
 * @since 1.0, 2023-10-16 21:08:32
 */
public class AlipayDigitalopUcdpApecreativeStyledesignrelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5116887482965914981L;

	/**
	 * designId 唯一用来查询所有的布局风格关以及关联表的信息。
	 */
	@ApiField("design_id")
	private String designId;

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
	 * 布局图片的行业信息。通过行业信息来查询图片。
	 */
	@ApiField("profession")
	private String profession;

	/**
	 * projectId唯一用于鉴权使用
	 */
	@ApiField("project_id")
	private String projectId;

	public String getDesignId() {
		return this.designId;
	}
	public void setDesignId(String designId) {
		this.designId = designId;
	}

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
