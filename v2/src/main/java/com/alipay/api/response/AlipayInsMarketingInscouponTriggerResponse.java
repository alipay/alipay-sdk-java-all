package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KeyValueDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.inscoupon.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-26 17:58:00
 */
public class AlipayInsMarketingInscouponTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 2671197545749499196L;

	/** 
	 * null
	 */
	@ApiListField("trigger_result")
	@ApiField("key_value_d_t_o")
	private List<KeyValueDTO> triggerResult;

	public void setTriggerResult(List<KeyValueDTO> triggerResult) {
		this.triggerResult = triggerResult;
	}
	public List<KeyValueDTO> getTriggerResult( ) {
		return this.triggerResult;
	}

}
