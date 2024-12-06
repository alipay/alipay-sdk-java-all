package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款商品明细信息
 *
 * @author auto create
 * @since 1.0, 2024-09-10 17:24:16
 */
public class RefundGoodsDetail extends AlipayObject {

	private static final long serialVersionUID = 2781255942982838739L;

	/**
	 * 商品编号。
对应支付时传入的goods_id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 外部商品凭证编号列表
	 */
	@ApiListField("out_certificate_no_list")
	@ApiField("string")
	private List<String> outCertificateNoList;

	/**
	 * 商家侧小程序商品ID，具体使用方式请参考：https://opendocs.alipay.com/pre-open/06uila?pathHash=87297d0a
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商家侧小程序商品sku ID，具体使用方式请参考：https://opendocs.alipay.com/pre-open/06uila?pathHash=87297d0a
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 该商品的退款总金额，单位为元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public List<String> getOutCertificateNoList() {
		return this.outCertificateNoList;
	}
	public void setOutCertificateNoList(List<String> outCertificateNoList) {
		this.outCertificateNoList = outCertificateNoList;
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
