package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数字员工分页查询
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:08
 */
public class DatadigitalAicsDevinWorkerPageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8421348756773186844L;

	/**
	 * null
	 */
	@ApiListField("code_list")
	@ApiField("string")
	private List<String> codeList;

	/**
	 * 数字员工名称，非空时模糊查询
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
	 * 是否有效：0-无效 1-有效，非空时精确过滤
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 类型，默认aiworker，非空时精确过滤
	 */
	@ApiField("type")
	private String type;

	/**
	 * 版本类型：空=不过滤；simple=极致版；其他非空值查version_type IS NULL(旧版数据)
	 */
	@ApiField("version_type")
	private String versionType;

	public List<String> getCodeList() {
		return this.codeList;
	}
	public void setCodeList(List<String> codeList) {
		this.codeList = codeList;
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

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getVersionType() {
		return this.versionType;
	}
	public void setVersionType(String versionType) {
		this.versionType = versionType;
	}

}
