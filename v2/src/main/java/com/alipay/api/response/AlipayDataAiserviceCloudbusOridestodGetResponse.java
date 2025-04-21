package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OriDestOdItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.oridestod.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:48
 */
public class AlipayDataAiserviceCloudbusOridestodGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6554429126478711178L;

	/** 
	 * 7OD  结果
	 */
	@ApiListField("result")
	@ApiField("ori_dest_od_item")
	private List<OriDestOdItem> result;

	public void setResult(List<OriDestOdItem> result) {
		this.result = result;
	}
	public List<OriDestOdItem> getResult( ) {
		return this.result;
	}

}
