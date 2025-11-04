package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * dump任务分页返回
 *
 * @author auto create
 * @since 1.0, 2024-08-28 16:16:38
 */
public class DumpPageRes extends AlipayObject {

	private static final long serialVersionUID = 4652874738217588627L;

	/**
	 * 元素为单个dump任务的信息
	 */
	@ApiListField("list")
	@ApiField("ocp_cloud_sql_dump_task_res")
	private List<OcpCloudSqlDumpTaskRes> list;

	/**
	 * 任务总数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public List<OcpCloudSqlDumpTaskRes> getList() {
		return this.list;
	}
	public void setList(List<OcpCloudSqlDumpTaskRes> list) {
		this.list = list;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
