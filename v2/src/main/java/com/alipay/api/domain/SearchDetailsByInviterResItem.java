package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 邀请单查询结果
 *
 * @author auto create
 * @since 1.0, 2024-07-10 10:23:56
 */
public class SearchDetailsByInviterResItem extends AlipayObject {

	private static final long serialVersionUID = 1648388345864796254L;

	/**
	 * 邀请单id
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 邀请授权资源
	 */
	@ApiListField("resources")
	@ApiField("auth_resource_content")
	private List<AuthResourceContent> resources;

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public List<AuthResourceContent> getResources() {
		return this.resources;
	}
	public void setResources(List<AuthResourceContent> resources) {
		this.resources = resources;
	}

}
