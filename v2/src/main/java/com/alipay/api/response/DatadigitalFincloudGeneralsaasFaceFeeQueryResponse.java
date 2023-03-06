package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantChargeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.fee.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-16 20:01:37
 */
public class DatadigitalFincloudGeneralsaasFaceFeeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1424525556427891539L;

	/** 
	 * certify_id：要查询计费状态的单据
charge_type：计费结果状态，FAIL_NOT_CHARGE，表示该certify_id不计费；CHARGE，表示该certify_id计费
error_code：目前暂时只有INVALID_CERTIFY_ID，表示certify_id无效。
	 */
	@ApiListField("fee_info")
	@ApiField("merchant_charge_info")
	private List<MerchantChargeInfo> feeInfo;

	public void setFeeInfo(List<MerchantChargeInfo> feeInfo) {
		this.feeInfo = feeInfo;
	}
	public List<MerchantChargeInfo> getFeeInfo( ) {
		return this.feeInfo;
	}

}
