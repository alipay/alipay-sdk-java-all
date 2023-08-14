package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款商品信息
 *
 * @author auto create
 * @since 1.0, 2023-08-08 00:07:46
 */
public class MiniRefundGoodsInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7571386986215663977L;

	/**
	 * 商品退款凭证信息，在本地生活等场景下，需要填入凭证号进行退款。
	 */
	@ApiField("certificate_info")
	private MiniRefundCertificateDTO certificateInfo;

	/**
	 * 与alipay.open.mini.order.create接口所传的商品goods_id保持一致
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 提报商品库的商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 提报商品库的商品，sku维度的商品该字段必传
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商品退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	public MiniRefundCertificateDTO getCertificateInfo() {
		return this.certificateInfo;
	}
	public void setCertificateInfo(MiniRefundCertificateDTO certificateInfo) {
		this.certificateInfo = certificateInfo;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

}
