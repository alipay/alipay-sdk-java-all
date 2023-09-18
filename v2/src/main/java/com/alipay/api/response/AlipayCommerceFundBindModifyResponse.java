package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.fund.bind.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-25 13:56:36
 */
public class AlipayCommerceFundBindModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5714729632887415354L;

	/** 
	 * 本此绑卡操作是否幂等。true表示该out_bind_no已经生成过schema，此时的schema为上次已生成的schema
	 */
	@ApiField("idempotent")
	private Boolean idempotent;

	/** 
	 * 绑卡流水号，用来标识一次绑卡行为，商户维度下需确保唯一
	 */
	@ApiField("out_bind_no")
	private String outBindNo;

	/** 
	 * 基金绑卡的跳转地址
	 */
	@ApiField("schema")
	private String schema;

	public void setIdempotent(Boolean idempotent) {
		this.idempotent = idempotent;
	}
	public Boolean getIdempotent( ) {
		return this.idempotent;
	}

	public void setOutBindNo(String outBindNo) {
		this.outBindNo = outBindNo;
	}
	public String getOutBindNo( ) {
		return this.outBindNo;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}
	public String getSchema( ) {
		return this.schema;
	}

}
