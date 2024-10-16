package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 景区审核信息查询结果
 *
 * @author auto create
 * @since 1.0, 2021-06-10 15:24:56
 */
public class ScenicAuditResponse extends AlipayObject {

	private static final long serialVersionUID = 1734135918975775815L;

	/**
	 * 景区审核信息查询结果
	 */
	@ApiListField("scenic_audit_info")
	@ApiField("scenic_audit_info")
	private List<ScenicAuditInfo> scenicAuditInfo;

	public List<ScenicAuditInfo> getScenicAuditInfo() {
		return this.scenicAuditInfo;
	}
	public void setScenicAuditInfo(List<ScenicAuditInfo> scenicAuditInfo) {
		this.scenicAuditInfo = scenicAuditInfo;
	}

}
