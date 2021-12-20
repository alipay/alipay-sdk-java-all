package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.benefit.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:03
 */
public class KoubeiMarketingCampaignBenefitSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1889557398476137388L;

	/** 
	 * 领取的权益列表
	 */
	@ApiListField("benefit_ids")
	@ApiField("string")
	private List<String> benefitIds;

	/** 
	 * 发放券展示模型
	 */
	@ApiListField("voucher_vo_list")
	@ApiField("voucher_v_o")
	private List<VoucherVO> voucherVoList;

	/** 
	 * 发放券展示模型（该字段已废弃）
	 */
	@ApiField("voucher_vos")
	private VoucherVO voucherVos;

	public void setBenefitIds(List<String> benefitIds) {
		this.benefitIds = benefitIds;
	}
	public List<String> getBenefitIds( ) {
		return this.benefitIds;
	}

	public void setVoucherVoList(List<VoucherVO> voucherVoList) {
		this.voucherVoList = voucherVoList;
	}
	public List<VoucherVO> getVoucherVoList( ) {
		return this.voucherVoList;
	}

	public void setVoucherVos(VoucherVO voucherVos) {
		this.voucherVos = voucherVos;
	}
	public VoucherVO getVoucherVos( ) {
		return this.voucherVos;
	}

}
