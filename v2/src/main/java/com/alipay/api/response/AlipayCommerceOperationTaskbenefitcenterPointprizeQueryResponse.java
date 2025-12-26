package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IsvVehownerBenefitVO;
import com.alipay.api.domain.IsvVoucherVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.taskbenefitcenter.pointprize.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-28 16:12:41
 */
public class AlipayCommerceOperationTaskbenefitcenterPointprizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5422289263424859117L;

	/** 
	 * 是否还有更多数据,用于分页加载下一页
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 商业化权益列表
	 */
	@ApiField("vehowner_benefit_list")
	private IsvVehownerBenefitVO vehownerBenefitList;

	/** 
	 * 券类型奖品列表
	 */
	@ApiField("voucher_list")
	private IsvVoucherVO voucherList;

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setVehownerBenefitList(IsvVehownerBenefitVO vehownerBenefitList) {
		this.vehownerBenefitList = vehownerBenefitList;
	}
	public IsvVehownerBenefitVO getVehownerBenefitList( ) {
		return this.vehownerBenefitList;
	}

	public void setVoucherList(IsvVoucherVO voucherList) {
		this.voucherList = voucherList;
	}
	public IsvVoucherVO getVoucherList( ) {
		return this.voucherList;
	}

}
