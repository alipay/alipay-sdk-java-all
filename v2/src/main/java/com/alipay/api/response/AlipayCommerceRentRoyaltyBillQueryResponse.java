package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentRoyaltyBillInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.royalty.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-14 10:57:27
 */
public class AlipayCommerceRentRoyaltyBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3579965232795633424L;

	/** 
	 * 分账账单列表
	 */
	@ApiListField("royalty_bill_info_list")
	@ApiField("rent_royalty_bill_info_d_t_o")
	private List<RentRoyaltyBillInfoDTO> royaltyBillInfoList;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setRoyaltyBillInfoList(List<RentRoyaltyBillInfoDTO> royaltyBillInfoList) {
		this.royaltyBillInfoList = royaltyBillInfoList;
	}
	public List<RentRoyaltyBillInfoDTO> getRoyaltyBillInfoList( ) {
		return this.royaltyBillInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
