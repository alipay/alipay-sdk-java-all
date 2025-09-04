package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HonorCouponDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.lendcoupon.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-01 17:27:39
 */
public class AlipayPcreditLoanHonorLendcouponQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8595412174796899464L;

	/** 
	 * 优惠券列表，按照「可使用 倒序 && 发放时间 倒序」排序优惠券列表。
	 */
	@ApiListField("records")
	@ApiField("honor_coupon_d_t_o")
	private List<HonorCouponDTO> records;

	/** 
	 * 记录总条数
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setRecords(List<HonorCouponDTO> records) {
		this.records = records;
	}
	public List<HonorCouponDTO> getRecords( ) {
		return this.records;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
