package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云托管OceanBase数据库数据导出结果列表查询
 *
 * @author auto create
 * @since 1.0, 2024-08-28 16:16:38
 */
public class AlipayCloudCloudrunObDumpresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7495273584393667654L;

	/**
	 * 环境id
	 */
	@ApiField("env")
	private String env;

	/**
	 * 实例id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 查询页码，第一页传参数1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 查询列表的页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 四种状态，"WAITING"、"RUNNING"、"FINISH"、"EXPIRE"可传
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	/**
	 * 创建任务的用户名
	 */
	@ApiListField("user_name_list")
	@ApiField("string")
	private List<String> userNameList;

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

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

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

	public List<String> getUserNameList() {
		return this.userNameList;
	}
	public void setUserNameList(List<String> userNameList) {
		this.userNameList = userNameList;
	}

}
