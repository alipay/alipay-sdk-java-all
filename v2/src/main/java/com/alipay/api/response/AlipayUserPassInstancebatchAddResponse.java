package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.pass.instancebatch.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:00
 */
public class AlipayUserPassInstancebatchAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7326867788545318619L;

	/** 
	 * opType表示操作类型，目前固定为ADD。errorCode和errorMsg对应错误信息。passList是券实例列表，仅当发券成功才有值，其中：
serialNumber：唯一核销凭证串号（必须由动态传参指定） 
passId：券唯一id 
order：券在大礼包中的顺序
	 */
	@ApiListField("result")
	@ApiField("string")
	private List<String> result;

	/** 
	 * 操作结果标识，true：成功，false：失败。
	 */
	@ApiField("success")
	private String success;

	public void setResult(List<String> result) {
		this.result = result;
	}
	public List<String> getResult( ) {
		return this.result;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
