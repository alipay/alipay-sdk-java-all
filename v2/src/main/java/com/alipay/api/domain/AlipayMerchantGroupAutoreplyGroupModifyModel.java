package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改自动回复生效范围
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:42:31
 */
public class AlipayMerchantGroupAutoreplyGroupModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7424867138937369332L;

	/**
	 * 自动回复id
	 */
	@ApiField("autoreply_id")
	private String autoreplyId;

	/**
	 * 是否全局生效
	 */
	@ApiField("global_valid")
	private Boolean globalValid;

	/**
	 * null
	 */
	@ApiListField("group_id_list")
	@ApiField("string")
	private List<String> groupIdList;

	public String getAutoreplyId() {
		return this.autoreplyId;
	}
	public void setAutoreplyId(String autoreplyId) {
		this.autoreplyId = autoreplyId;
	}

	public Boolean getGlobalValid() {
		return this.globalValid;
	}
	public void setGlobalValid(Boolean globalValid) {
		this.globalValid = globalValid;
	}

	public List<String> getGroupIdList() {
		return this.groupIdList;
	}
	public void setGroupIdList(List<String> groupIdList) {
		this.groupIdList = groupIdList;
	}

}
