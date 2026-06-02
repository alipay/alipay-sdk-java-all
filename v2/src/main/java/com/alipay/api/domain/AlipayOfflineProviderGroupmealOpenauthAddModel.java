package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 碰一下团餐批量签约授权
 *
 * @author auto create
 * @since 1.0, 2026-03-17 11:42:44
 */
public class AlipayOfflineProviderGroupmealOpenauthAddModel extends AlipayObject {

	private static final long serialVersionUID = 8167534983785113284L;

	/**
	 * 机构id
	 */
	@ApiField("logic_group_id")
	private String logicGroupId;

	/**
	 * null
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	/**
	 * null
	 */
	@ApiListField("uid_list")
	@ApiField("string")
	private List<String> uidList;

	public String getLogicGroupId() {
		return this.logicGroupId;
	}
	public void setLogicGroupId(String logicGroupId) {
		this.logicGroupId = logicGroupId;
	}

	public List<String> getOpenIdList() {
		return this.openIdList;
	}
	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}

	public List<String> getUidList() {
		return this.uidList;
	}
	public void setUidList(List<String> uidList) {
		this.uidList = uidList;
	}

}
