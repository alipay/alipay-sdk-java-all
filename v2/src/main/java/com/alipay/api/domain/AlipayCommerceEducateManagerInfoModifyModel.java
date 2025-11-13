package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改管理员信息
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:33:00
 */
public class AlipayCommerceEducateManagerInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3379266935962288771L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 管理员ID
	 */
	@ApiField("manager_id")
	private String managerId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 管理的组织节点ID列表
	 */
	@ApiListField("node_id_list")
	@ApiField("string")
	private List<String> nodeIdList;

	/**
	 * 管理的位置ID列表
	 */
	@ApiListField("place_id_list")
	@ApiField("string")
	private List<String> placeIdList;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getManagerId() {
		return this.managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<String> getNodeIdList() {
		return this.nodeIdList;
	}
	public void setNodeIdList(List<String> nodeIdList) {
		this.nodeIdList = nodeIdList;
	}

	public List<String> getPlaceIdList() {
		return this.placeIdList;
	}
	public void setPlaceIdList(List<String> placeIdList) {
		this.placeIdList = placeIdList;
	}

}
