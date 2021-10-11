package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 欠款交易详情同步接口
 *
 * @author auto create
 * @since 1.0, 2021-03-24 11:41:37
 */
public class AlipayPayAppTradeArrearSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5641245259725841246L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 商品摘要。格式参照示例，多款商品则使用逗号分隔。用于催缴展示给用户
	 */
	@ApiField("goods_digest")
	private String goodsDigest;

	/**
	 * 收款商户名称，用户通知用户页面展示，请务必传正确
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getGoodsDigest() {
		return this.goodsDigest;
	}
	public void setGoodsDigest(String goodsDigest) {
		this.goodsDigest = goodsDigest;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
