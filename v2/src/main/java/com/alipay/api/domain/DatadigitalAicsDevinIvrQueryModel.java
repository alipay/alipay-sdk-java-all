package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 关联数字员工_IVR列表下拉
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:47:57
 */
public class DatadigitalAicsDevinIvrQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6229871536119426583L;

	/**
	 * 完整流程名称
	 */
	@ApiField("complete_name")
	private String completeName;

	/**
	 * 流程使用环境（AssistantEnvEnum）：LATEST-最新版；PUB-线上版；NONE-所有版本
	 */
	@ApiField("environment")
	private String environment;

	/**
	 * 流程code
	 */
	@ApiField("ivr_code")
	private String ivrCode;

	/**
	 * 流程名称关键字或流程ivrCode关键字（模糊匹配）
	 */
	@ApiField("name")
	private String name;

	/**
	 * 当前页码，默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * null
	 */
	@ApiListField("type_list")
	@ApiField("string")
	private List<String> typeList;

	/**
	 * 版本号（对客字段名 version_no，规避网关预留字 version）
	 */
	@ApiField("version_no")
	private String versionNo;

	public String getCompleteName() {
		return this.completeName;
	}
	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public String getEnvironment() {
		return this.environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getIvrCode() {
		return this.ivrCode;
	}
	public void setIvrCode(String ivrCode) {
		this.ivrCode = ivrCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

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

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public List<String> getTypeList() {
		return this.typeList;
	}
	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}

	public String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}
