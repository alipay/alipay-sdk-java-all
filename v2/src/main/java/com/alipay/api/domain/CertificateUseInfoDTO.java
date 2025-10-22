package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销记录明细
 *
 * @author auto create
 * @since 1.0, 2025-10-21 19:20:59
 */
public class CertificateUseInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4661688481355938313L;

	/**
	 * 核销信息
	 */
	@ApiField("certificate_use_info")
	private MiniCertificateUseInfo certificateUseInfo;

	/**
	 * 商品信息
	 */
	@ApiField("item_info")
	private MiniItemInfo itemInfo;

	/**
	 * 订单基础信息
	 */
	@ApiField("order_base_info")
	private OrderBaseInfo orderBaseInfo;

	/**
	 * 价格信息
	 */
	@ApiField("price_info")
	private MiniPriceInfoDTO priceInfo;

	/**
	 * 退款信息
	 */
	@ApiField("refund_info")
	private MiniRefundInfo refundInfo;

	/**
	 * 状态信息
	 */
	@ApiField("status_info")
	private MiniStatusInfo statusInfo;

	/**
	 * 使用人信息
	 */
	@ApiField("user_info")
	private MiniUserInfo userInfo;

	public MiniCertificateUseInfo getCertificateUseInfo() {
		return this.certificateUseInfo;
	}
	public void setCertificateUseInfo(MiniCertificateUseInfo certificateUseInfo) {
		this.certificateUseInfo = certificateUseInfo;
	}

	public MiniItemInfo getItemInfo() {
		return this.itemInfo;
	}
	public void setItemInfo(MiniItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}

	public OrderBaseInfo getOrderBaseInfo() {
		return this.orderBaseInfo;
	}
	public void setOrderBaseInfo(OrderBaseInfo orderBaseInfo) {
		this.orderBaseInfo = orderBaseInfo;
	}

	public MiniPriceInfoDTO getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(MiniPriceInfoDTO priceInfo) {
		this.priceInfo = priceInfo;
	}

	public MiniRefundInfo getRefundInfo() {
		return this.refundInfo;
	}
	public void setRefundInfo(MiniRefundInfo refundInfo) {
		this.refundInfo = refundInfo;
	}

	public MiniStatusInfo getStatusInfo() {
		return this.statusInfo;
	}
	public void setStatusInfo(MiniStatusInfo statusInfo) {
		this.statusInfo = statusInfo;
	}

	public MiniUserInfo getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(MiniUserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
