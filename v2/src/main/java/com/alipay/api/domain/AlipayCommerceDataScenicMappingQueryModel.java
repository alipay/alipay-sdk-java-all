package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 景区内外域映射关系查询
 *
 * @author auto create
 * @since 1.0, 2023-04-17 11:56:00
 */
public class AlipayCommerceDataScenicMappingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4393715319853895773L;

	/**
	 * 景区审核信息查询请求。 集合长度不能超过200
	 */
	@ApiListField("scenic_audit_query_req")
	@ApiField("scenic_audit_query_req")
	private List<ScenicAuditQueryReq> scenicAuditQueryReq;

	public List<ScenicAuditQueryReq> getScenicAuditQueryReq() {
		return this.scenicAuditQueryReq;
	}
	public void setScenicAuditQueryReq(List<ScenicAuditQueryReq> scenicAuditQueryReq) {
		this.scenicAuditQueryReq = scenicAuditQueryReq;
	}

}
