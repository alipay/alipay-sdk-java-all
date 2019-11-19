package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChargeInstMode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.config.chargeinst.search response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEbppConfigChargeinstSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4275486337645724792L;

	/** 
	 * 接口输出参数列表 ChargeInstResult{ List<ChargeInstMode>}对象
	 */
	@ApiListField("charge_inst_mode_result")
	@ApiField("charge_inst_mode")
	private List<ChargeInstMode> chargeInstModeResult;

	public void setChargeInstModeResult(List<ChargeInstMode> chargeInstModeResult) {
		this.chargeInstModeResult = chargeInstModeResult;
	}
	public List<ChargeInstMode> getChargeInstModeResult( ) {
		return this.chargeInstModeResult;
	}

}
