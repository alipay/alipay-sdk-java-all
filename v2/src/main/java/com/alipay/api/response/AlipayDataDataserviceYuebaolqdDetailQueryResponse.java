package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayYebLqdDataResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.yuebaolqd.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:49
 */
public class AlipayDataDataserviceYuebaolqdDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1585355465524653482L;

	/** 
	 * 余额宝清算日预测申赎数据
	 */
	@ApiListField("yeb_ldq_data")
	@ApiField("alipay_yeb_lqd_data_result")
	private List<AlipayYebLqdDataResult> yebLdqData;

	public void setYebLdqData(List<AlipayYebLqdDataResult> yebLdqData) {
		this.yebLdqData = yebLdqData;
	}
	public List<AlipayYebLqdDataResult> getYebLdqData( ) {
		return this.yebLdqData;
	}

}
