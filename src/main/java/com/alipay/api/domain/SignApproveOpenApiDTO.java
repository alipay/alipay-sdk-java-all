package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署审核信息
 *
 * @author auto create
 * @since 1.0, 2021-12-27 09:31:50
 */
public class SignApproveOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 3884963548465368685L;

	/**
	 * 审批流id列表
	 */
	@ApiListField("process_ids")
	@ApiField("string")
	private List<String> processIds;

	/**
	 * 审批类型
	 */
	@ApiField("process_type")
	private String processType;

	public List<String> getProcessIds() {
		return this.processIds;
	}
	public void setProcessIds(List<String> processIds) {
		this.processIds = processIds;
	}

	public String getProcessType() {
		return this.processType;
	}
	public void setProcessType(String processType) {
		this.processType = processType;
	}

}
