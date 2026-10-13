package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResultInfoDTO;
import com.alipay.api.domain.VoyagerVoucherVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.marketing.campaignapply response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-23 10:41:25
 */
public class AlipayVoyagerMarketingCampaignapplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6333868147398633817L;

	/** 
	 * 活动申领号
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/** 
	 * 业务结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	/** 
	 * null
	 */
	@ApiListField("voucher_vos")
	@ApiField("voyager_voucher_v_o")
	private List<VoyagerVoucherVO> voucherVos;

	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}
	public String getApplyOrderId( ) {
		return this.applyOrderId;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

	public void setVoucherVos(List<VoyagerVoucherVO> voucherVos) {
		this.voucherVos = voucherVos;
	}
	public List<VoyagerVoucherVO> getVoucherVos( ) {
		return this.voucherVos;
	}

}
