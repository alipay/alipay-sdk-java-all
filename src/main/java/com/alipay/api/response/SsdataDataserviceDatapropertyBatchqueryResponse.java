package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.dataproperty.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-12 20:00:42
 */
public class SsdataDataserviceDatapropertyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6437183989417982654L;

	/** 
	 * 服务端处理响应id
	 */
	@ApiField("process_id")
	private String processId;

	/** 
	 * 描述了返回的结果体的key名
	 */
	@ApiField("result_key")
	private String resultKey;

	/** 
	 * 返回的response数据
	 */
	@ApiField("result_response")
	private String resultResponse;

	/** 
	 * 描述渠道执行操作返回的result类型
	 */
	@ApiField("result_type")
	private String resultType;

	/** 
	 * 数据渠道返回结果体的value值
	 */
	@ApiField("result_value")
	private String resultValue;

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

	public void setResultKey(String resultKey) {
		this.resultKey = resultKey;
	}
	public String getResultKey( ) {
		return this.resultKey;
	}

	public void setResultResponse(String resultResponse) {
		this.resultResponse = resultResponse;
	}
	public String getResultResponse( ) {
		return this.resultResponse;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}
	public String getResultType( ) {
		return this.resultType;
	}

	public void setResultValue(String resultValue) {
		this.resultValue = resultValue;
	}
	public String getResultValue( ) {
		return this.resultValue;
	}

}
