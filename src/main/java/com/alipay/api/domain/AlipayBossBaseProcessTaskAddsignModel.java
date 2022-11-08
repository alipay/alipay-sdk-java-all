package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 流程加签
 *
 * @author auto create
 * @since 1.0, 2022-10-20 15:48:11
 */
public class AlipayBossBaseProcessTaskAddsignModel extends AlipayObject {

	private static final long serialVersionUID = 6699313664367984185L;

	/**
	 * 加签内容
	 */
	@ApiListField("add_sign_contents")
	@ApiField("b_p_open_api_add_sign_content")
	private List<BPOpenApiAddSignContent> addSignContents;

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
	 * 是否前置加签
	 */
	@ApiField("prev")
	private Boolean prev;

	/**
	 * 流程全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	public List<BPOpenApiAddSignContent> getAddSignContents() {
		return this.addSignContents;
	}
	public void setAddSignContents(List<BPOpenApiAddSignContent> addSignContents) {
		this.addSignContents = addSignContents;
	}

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

	public Boolean getPrev() {
		return this.prev;
	}
	public void setPrev(Boolean prev) {
		this.prev = prev;
	}

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

}
