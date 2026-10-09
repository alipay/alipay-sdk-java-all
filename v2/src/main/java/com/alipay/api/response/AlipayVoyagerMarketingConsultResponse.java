package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitDisplayVO;
import com.alipay.api.domain.VoyagerPriceInfoDTO;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.marketing.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-23 10:42:55
 */
public class AlipayVoyagerMarketingConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2228892428667621275L;

	/** 
	 * null
	 */
	@ApiListField("available_benefit_list")
	@ApiField("benefit_display_v_o")
	private List<BenefitDisplayVO> availableBenefitList;

	/** 
	 * null
	 */
	@ApiListField("best_benefit_list")
	@ApiField("benefit_display_v_o")
	private List<BenefitDisplayVO> bestBenefitList;

	/** 
	 * 价格信息（订单维度价格计算结果透传）
	 */
	@ApiField("price_info_dto")
	private VoyagerPriceInfoDTO priceInfoDto;

	/** 
	 * 业务结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	/** 
	 * 传入的 voucherIds 对应券是否都可用（未传 voucherIds 时为 null；false 时 bestBenefitList 已兜底最优券）
	 */
	@ApiField("selected_voucher_available")
	private Boolean selectedVoucherAvailable;

	/** 
	 * null
	 */
	@ApiListField("un_available_benefit_list")
	@ApiField("benefit_display_v_o")
	private List<BenefitDisplayVO> unAvailableBenefitList;

	public void setAvailableBenefitList(List<BenefitDisplayVO> availableBenefitList) {
		this.availableBenefitList = availableBenefitList;
	}
	public List<BenefitDisplayVO> getAvailableBenefitList( ) {
		return this.availableBenefitList;
	}

	public void setBestBenefitList(List<BenefitDisplayVO> bestBenefitList) {
		this.bestBenefitList = bestBenefitList;
	}
	public List<BenefitDisplayVO> getBestBenefitList( ) {
		return this.bestBenefitList;
	}

	public void setPriceInfoDto(VoyagerPriceInfoDTO priceInfoDto) {
		this.priceInfoDto = priceInfoDto;
	}
	public VoyagerPriceInfoDTO getPriceInfoDto( ) {
		return this.priceInfoDto;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

	public void setSelectedVoucherAvailable(Boolean selectedVoucherAvailable) {
		this.selectedVoucherAvailable = selectedVoucherAvailable;
	}
	public Boolean getSelectedVoucherAvailable( ) {
		return this.selectedVoucherAvailable;
	}

	public void setUnAvailableBenefitList(List<BenefitDisplayVO> unAvailableBenefitList) {
		this.unAvailableBenefitList = unAvailableBenefitList;
	}
	public List<BenefitDisplayVO> getUnAvailableBenefitList( ) {
		return this.unAvailableBenefitList;
	}

}
