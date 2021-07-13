package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.label.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-23 14:45:20
 */
public class AlipayMobilePublicLabelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6852835729985494967L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 所有标签
	 */
	@ApiListField("labels")
	@ApiField("string")
	private List<String> labels;

	/** 
	 * 结果信息
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	public List<String> getLabels( ) {
		return this.labels;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
