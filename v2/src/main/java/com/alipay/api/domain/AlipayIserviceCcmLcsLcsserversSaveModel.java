package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保存云客服轻聊客服人员信息
 *
 * @author auto create
 * @since 1.0, 2022-12-12 10:20:26
 */
public class AlipayIserviceCcmLcsLcsserversSaveModel extends AlipayObject {

	private static final long serialVersionUID = 7267559868135229335L;

	/**
	 * 轻聊客服数据添加类型
	 */
	@ApiField("add_type")
	private String addType;

	/**
	 * 租户实例id（数据权限id），不填，则使用默认的租户实例id
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 客服ID列表
	 */
	@ApiListField("server_ids")
	@ApiField("number")
	private List<Long> serverIds;

	public String getAddType() {
		return this.addType;
	}
	public void setAddType(String addType) {
		this.addType = addType;
	}

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public List<Long> getServerIds() {
		return this.serverIds;
	}
	public void setServerIds(List<Long> serverIds) {
		this.serverIds = serverIds;
	}

}
