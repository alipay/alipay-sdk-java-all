package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 花名册信息删除
 *
 * @author auto create
 * @since 1.0, 2025-04-28 19:41:58
 */
public class AlipayCommerceEducateRosterInfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7196238659798762553L;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 要删除的花名册ID列表
	 */
	@ApiListField("roster_id_list")
	@ApiField("string")
	private List<String> rosterIdList;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public List<String> getRosterIdList() {
		return this.rosterIdList;
	}
	public void setRosterIdList(List<String> rosterIdList) {
		this.rosterIdList = rosterIdList;
	}

}
