package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 环节类型信息列表
 *
 * @author auto create
 * @since 1.0, 2022-03-30 15:37:26
 */
public class LinkTypeListResult extends AlipayObject {

	private static final long serialVersionUID = 2378354494965133218L;

	/**
	 * 环节类型信息
	 */
	@ApiListField("link_type_list")
	@ApiField("link_type_result")
	private List<LinkTypeResult> linkTypeList;

	public List<LinkTypeResult> getLinkTypeList() {
		return this.linkTypeList;
	}
	public void setLinkTypeList(List<LinkTypeResult> linkTypeList) {
		this.linkTypeList = linkTypeList;
	}

}
