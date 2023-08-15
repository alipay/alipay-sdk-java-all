package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询某通在线服务的聊天记录
 *
 * @author auto create
 * @since 1.0, 2021-05-19 17:22:33
 */
public class AlipayIserviceCcmOlsChatrecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5555858913546956229L;

	/**
	 * 租户实例id（数据权限id），不填，则使用默认的租户实例id
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 在线服务记录id
	 */
	@ApiField("id")
	private String id;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
