package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitDiscountInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.member.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 14:17:28
 */
public class AlipayCommerceMedicalMemberBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3674556941344916258L;

	/** 
	 * 权益订单ID
	 */
	@ApiField("benefit_order_id")
	private String benefitOrderId;

	/** 
	 * 权益优惠列表
	 */
	@ApiListField("discount_info_list")
	@ApiField("benefit_discount_info_d_t_o")
	private List<BenefitDiscountInfoDTO> discountInfoList;

	/** 
	 * 权益优惠类型	
 - voucher：券优惠
 - exchange：0元兑换
	 */
	@ApiField("discount_type")
	private String discountType;

	/** 
	 * 会员价 单位：元
	 */
	@ApiField("member_price")
	private String memberPrice;

	/** 
	 * 是否有会员资格：true-有；false-无
	 */
	@ApiField("membership")
	private Boolean membership;

	/** 
	 * 商品原价：元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/** 
	 * 商品ID
	 */
	@ApiField("product_id")
	private String productId;

	public void setBenefitOrderId(String benefitOrderId) {
		this.benefitOrderId = benefitOrderId;
	}
	public String getBenefitOrderId( ) {
		return this.benefitOrderId;
	}

	public void setDiscountInfoList(List<BenefitDiscountInfoDTO> discountInfoList) {
		this.discountInfoList = discountInfoList;
	}
	public List<BenefitDiscountInfoDTO> getDiscountInfoList( ) {
		return this.discountInfoList;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public String getDiscountType( ) {
		return this.discountType;
	}

	public void setMemberPrice(String memberPrice) {
		this.memberPrice = memberPrice;
	}
	public String getMemberPrice( ) {
		return this.memberPrice;
	}

	public void setMembership(Boolean membership) {
		this.membership = membership;
	}
	public Boolean getMembership( ) {
		return this.membership;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getOriginalPrice( ) {
		return this.originalPrice;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId( ) {
		return this.productId;
	}

}
