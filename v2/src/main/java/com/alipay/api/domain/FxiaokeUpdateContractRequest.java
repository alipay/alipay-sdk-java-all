package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入参
 *
 * @author auto create
 * @since 1.0, 2025-12-01 19:22:42
 */
public class FxiaokeUpdateContractRequest extends AlipayObject {

	private static final long serialVersionUID = 1117484413379337269L;

	/**
	 * 附件url
	 */
	@ApiField("negotiation_file")
	private String negotiationFile;

	/**
	 * 合同磋商编号
	 */
	@ApiField("negotiation_no")
	private String negotiationNo;

	public String getNegotiationFile() {
		return this.negotiationFile;
	}
	public void setNegotiationFile(String negotiationFile) {
		this.negotiationFile = negotiationFile;
	}

	public String getNegotiationNo() {
		return this.negotiationNo;
	}
	public void setNegotiationNo(String negotiationNo) {
		this.negotiationNo = negotiationNo;
	}

}
