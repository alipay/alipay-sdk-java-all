package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新计划
 *
 * @author auto create
 * @since 1.0, 2021-06-16 16:39:46
 */
public class AlipayCommerceIotAdvertiserAdModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8513253875958727481L;

	/**
	 * 下线SN列表
	 */
	@ApiListField("delete_sn_list")
	@ApiField("string")
	private List<String> deleteSnList;

	/**
	 * 计划id
	 */
	@ApiField("id")
	private Long id;

	public List<String> getDeleteSnList() {
		return this.deleteSnList;
	}
	public void setDeleteSnList(List<String> deleteSnList) {
		this.deleteSnList = deleteSnList;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
