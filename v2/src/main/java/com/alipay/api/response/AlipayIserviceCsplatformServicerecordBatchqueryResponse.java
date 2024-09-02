package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceRecordDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.csplatform.servicerecord.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:32:00
 */
public class AlipayIserviceCsplatformServicerecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1863885435696678734L;

	/** 
	 * 服务记录列表
	 */
	@ApiListField("value")
	@ApiField("service_record_detail_v_o")
	private List<ServiceRecordDetailVO> value;

	public void setValue(List<ServiceRecordDetailVO> value) {
		this.value = value;
	}
	public List<ServiceRecordDetailVO> getValue( ) {
		return this.value;
	}

}
