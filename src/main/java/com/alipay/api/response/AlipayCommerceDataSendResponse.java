package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DataSendBusinessResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceDataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7755593939526214149L;

	/** 
	 * data_send_business_result:数据发送业务处理结果信息
	 */
	@ApiField("data_send_business_result")
	private DataSendBusinessResult dataSendBusinessResult;

	public void setDataSendBusinessResult(DataSendBusinessResult dataSendBusinessResult) {
		this.dataSendBusinessResult = dataSendBusinessResult;
	}
	public DataSendBusinessResult getDataSendBusinessResult( ) {
		return this.dataSendBusinessResult;
	}

}
