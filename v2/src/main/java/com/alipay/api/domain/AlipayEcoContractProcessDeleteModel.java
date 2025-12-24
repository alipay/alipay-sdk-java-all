package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署平台流程信息删除
 *
 * @author auto create
 * @since 1.0, 2020-03-30 14:15:00
 */
public class AlipayEcoContractProcessDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8424676558165628242L;

	/**
	 * MCCCode
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 流程Id
	 */
	@ApiListField("flow_ids")
	@ApiField("string")
	private List<String> flowIds;

	/**
	 * 签署平台的代码
	 */
	@ApiField("sign_platform_code")
	private String signPlatformCode;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public List<String> getFlowIds() {
		return this.flowIds;
	}
	public void setFlowIds(List<String> flowIds) {
		this.flowIds = flowIds;
	}

	public String getSignPlatformCode() {
		return this.signPlatformCode;
	}
	public void setSignPlatformCode(String signPlatformCode) {
		this.signPlatformCode = signPlatformCode;
	}

}
