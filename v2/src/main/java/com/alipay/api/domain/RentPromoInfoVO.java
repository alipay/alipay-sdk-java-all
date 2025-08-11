package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销信息
 *
 * @author auto create
 * @since 1.0, 2025-07-16 13:39:50
 */
public class RentPromoInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7257455576729361345L;

	/**
	 * 商家优惠详情
	 */
	@ApiField("merchant_promo_detail")
	private RentMerchantPromoDetailInfoVO merchantPromoDetail;

	/**
	 * 商家优惠汇总，单位：元，精确到小数点后两位
	 */
	@ApiField("merchant_total_amount")
	private String merchantTotalAmount;

	/**
	 * 订单金额，单位：元，精确到小数点后两位
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单优惠后金额，单位：元，精确到小数点后两位
	 */
	@ApiField("order_promo_sale_amount")
	private String orderPromoSaleAmount;

	/**
	 * 平台优惠详情
	 */
	@ApiField("platform_promo_detail")
	private RentPlatformPromoDetailInfoVO platformPromoDetail;

	/**
	 * 平台优惠汇总，单位：元，精确到小数点后两位
	 */
	@ApiField("platform_total_amount")
	private String platformTotalAmount;

	/**
	 * 分期阶段优惠详情
	 */
	@ApiListField("stage_promo_detail_list")
	@ApiField("rent_stage_promo_detail_info_v_o")
	private List<RentStagePromoDetailInfoVO> stagePromoDetailList;

	/**
	 * 优惠总金额，单位：元，精确到小数点后两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public RentMerchantPromoDetailInfoVO getMerchantPromoDetail() {
		return this.merchantPromoDetail;
	}
	public void setMerchantPromoDetail(RentMerchantPromoDetailInfoVO merchantPromoDetail) {
		this.merchantPromoDetail = merchantPromoDetail;
	}

	public String getMerchantTotalAmount() {
		return this.merchantTotalAmount;
	}
	public void setMerchantTotalAmount(String merchantTotalAmount) {
		this.merchantTotalAmount = merchantTotalAmount;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderPromoSaleAmount() {
		return this.orderPromoSaleAmount;
	}
	public void setOrderPromoSaleAmount(String orderPromoSaleAmount) {
		this.orderPromoSaleAmount = orderPromoSaleAmount;
	}

	public RentPlatformPromoDetailInfoVO getPlatformPromoDetail() {
		return this.platformPromoDetail;
	}
	public void setPlatformPromoDetail(RentPlatformPromoDetailInfoVO platformPromoDetail) {
		this.platformPromoDetail = platformPromoDetail;
	}

	public String getPlatformTotalAmount() {
		return this.platformTotalAmount;
	}
	public void setPlatformTotalAmount(String platformTotalAmount) {
		this.platformTotalAmount = platformTotalAmount;
	}

	public List<RentStagePromoDetailInfoVO> getStagePromoDetailList() {
		return this.stagePromoDetailList;
	}
	public void setStagePromoDetailList(List<RentStagePromoDetailInfoVO> stagePromoDetailList) {
		this.stagePromoDetailList = stagePromoDetailList;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
