package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电子借条参与人信息
 *
 * @author auto create
 * @since 1.0, 2024-04-10 15:22:51
 */
public class EcoContractParticipantInfo extends AlipayObject {

	private static final long serialVersionUID = 3669126216123528656L;

	/**
	 * 如果该参与人删除了合同，则为1，如果未删除该合同，为0
	 */
	@ApiField("delete_status")
	private String deleteStatus;

	/**
	 * 参与人名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部商户用户身份标识
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 用户角色，签署合约双方分别为出借人和借款人，同时有一人为合约发起人
	 */
	@ApiListField("role")
	@ApiField("string")
	private List<String> role;

	/**
	 * 签署人状态枚举字段
	 */
	@ApiField("status")
	private String status;

	public String getDeleteStatus() {
		return this.deleteStatus;
	}
	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public List<String> getRole() {
		return this.role;
	}
	public void setRole(List<String> role) {
		this.role = role;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
