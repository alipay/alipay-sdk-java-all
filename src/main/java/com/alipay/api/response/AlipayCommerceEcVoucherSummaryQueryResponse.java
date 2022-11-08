package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.voucher.summary.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-22 10:01:49
 */
public class AlipayCommerceEcVoucherSummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2719696757537181721L;

	/** 
	 * 发票信息列表
	 */
	@ApiListField("voucher_info_list")
	@ApiField("ec_voucher_info")
	private List<EcVoucherInfo> voucherInfoList;

	public void setVoucherInfoList(List<EcVoucherInfo> voucherInfoList) {
		this.voucherInfoList = voucherInfoList;
	}
	public List<EcVoucherInfo> getVoucherInfoList( ) {
		return this.voucherInfoList;
	}

}
