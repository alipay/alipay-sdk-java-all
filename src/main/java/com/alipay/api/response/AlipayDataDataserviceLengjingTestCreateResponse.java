package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.lengjing.test.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceLengjingTestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7171655192414793211L;

	/** 
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("test_param")
	private String testParam;

	public void setTestParam(String testParam) {
		this.testParam = testParam;
	}
	public String getTestParam( ) {
		return this.testParam;
	}

}
