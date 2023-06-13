package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 技能组分页查询
 *
 * @author auto create
 * @since 1.0, 2023-05-26 10:41:43
 */
public class AlipayIserviceIsresourceSkillgrouppagequeryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2219574697488364456L;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 技能组名称
	 */
	@ApiField("skill_group_name")
	private String skillGroupName;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

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

	public String getSkillGroupName() {
		return this.skillGroupName;
	}
	public void setSkillGroupName(String skillGroupName) {
		this.skillGroupName = skillGroupName;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
