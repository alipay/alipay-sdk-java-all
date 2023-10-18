package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.fqqrcode.hbfq.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-29 10:31:54
 */
public class AlipayPcreditHuabeiFqqrcodeHbfqCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4242867279912466892L;

	/** 
	 * 本次物料申领是否成功,成功为true,失败为false
	 */
	@ApiField("apply")
	private Boolean apply;

	/** 
	 * 码申请流程id,后续可用来查询物流信息.如果申请失败的话,本字段为空.
	 */
	@ApiField("process_id")
	private String processId;

	public void setApply(Boolean apply) {
		this.apply = apply;
	}
	public Boolean getApply( ) {
		return this.apply;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

}
