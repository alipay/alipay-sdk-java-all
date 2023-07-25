package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenVoucherDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.batchsend response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:06:50
 */
public class AlipayMarketingVoucherBatchsendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1434215533558276832L;

	/** 
	 * 批量发券信息
	 */
	@ApiListField("vouchers")
	@ApiField("open_voucher_d_t_o")
	private List<OpenVoucherDTO> vouchers;

	public void setVouchers(List<OpenVoucherDTO> vouchers) {
		this.vouchers = vouchers;
	}
	public List<OpenVoucherDTO> getVouchers( ) {
		return this.vouchers;
	}

}
