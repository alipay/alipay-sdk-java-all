package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流程任务释放
 *
 * @author auto create
 * @since 1.0, 2022-03-25 14:00:26
 */
public class AlipayBossBaseProcessTaskReleaseModel extends AlipayObject {

	private static final long serialVersionUID = 7418498812779444232L;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 当前流程实例节点名,如果未填,则自动获取当前状态,若当前仅有一个节点,则按此处理,否则报错
	 */
	@ApiField("node")
	private String node;

	/**
	 * 处理人域账号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 流程全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNode() {
		return this.node;
	}
	public void setNode(String node) {
		this.node = node;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

}
