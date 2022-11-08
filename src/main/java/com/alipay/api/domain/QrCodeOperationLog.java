package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能量码操作日志
 *
 * @author auto create
 * @since 1.0, 2022-04-08 12:53:58
 */
public class QrCodeOperationLog extends AlipayObject {

	private static final long serialVersionUID = 8433875576962988457L;

	/**
	 * 能量码所属的goods_id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 能量所属的商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 能量码ID
	 */
	@ApiField("qr_code_id")
	private String qrCodeId;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getQrCodeId() {
		return this.qrCodeId;
	}
	public void setQrCodeId(String qrCodeId) {
		this.qrCodeId = qrCodeId;
	}

}
