package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 组合奖品优惠信息
 *
 * @author auto create
 * @since 1.0, 2026-03-02 14:27:24
 */
public class CombinePrizeDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 3221528697169615735L;

	/**
	 * 可拆分
	 */
	@ApiField("allow_voucher_split")
	private String allowVoucherSplit;

	/**
	 * 优惠类型
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 单张红包优惠信息
	 */
	@ApiListField("sub_prize_list")
	@ApiField("sub_prize_discount_info")
	private List<SubPrizeDiscountInfo> subPrizeList;

	/**
	 * 总面额，单位分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	public String getAllowVoucherSplit() {
		return this.allowVoucherSplit;
	}
	public void setAllowVoucherSplit(String allowVoucherSplit) {
		this.allowVoucherSplit = allowVoucherSplit;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public List<SubPrizeDiscountInfo> getSubPrizeList() {
		return this.subPrizeList;
	}
	public void setSubPrizeList(List<SubPrizeDiscountInfo> subPrizeList) {
		this.subPrizeList = subPrizeList;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

}
