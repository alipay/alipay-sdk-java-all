package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 使用source_uid查询pid的请求模型
 *
 * @author auto create
 * @since 1.0, 2026-07-28 16:15:46
 */
public class SourceUidPidQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 3345698322699514966L;

	/**
	 * 主体编码 , 该参数可选，它的作用是：当为ZN7 时，若该source_uid的pid不存在需要去注册pid，注册后会同时也注册财资子户。
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 来源uid
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
