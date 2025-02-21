package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财资子户申请入参模型
 *
 * @author auto create
 * @since 1.0, 2023-12-06 15:17:32
 */
public class SubAccountApplyRequest extends AlipayObject {

	private static final long serialVersionUID = 6435963286355423487L;

	/**
	 * 在哪个主体下进行子户申请，默认不填时为ZN7
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 来源uid，区分国内DO/海外OS。比如：DO200000200406
	 */
	@ApiField("source_uid")
	private String sourceUid;

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public String getSourceUid() {
		return this.sourceUid;
	}
	public void setSourceUid(String sourceUid) {
		this.sourceUid = sourceUid;
	}

}
