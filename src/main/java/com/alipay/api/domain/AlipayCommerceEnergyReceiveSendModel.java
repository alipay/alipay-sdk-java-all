package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * FSC用户能量领取接口
 *
 * @author auto create
 * @since 1.0, 2022-10-10 16:27:36
 */
public class AlipayCommerceEnergyReceiveSendModel extends AlipayObject {

	private static final long serialVersionUID = 7477739387596681742L;

	/**
	 * 支付宝用户uid;
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 绿色能量发放归属的商户信息。
说明：
如果该复杂对象不填。则默认为该绿色能量发放的归属者是调用者本人。
如果填写，则认为该绿色能量发放的归属者是该商户。

限制:服务商身份接入时必传
	 */
	@ApiField("belong_merchant_info")
	private BelongMerchantInfoDTO belongMerchantInfo;

	/**
	 * 能量领取时间
	 */
	@ApiField("get_time")
	private String getTime;

	/**
	 * 需要发放能量的商品码; 如果不传，则按照整笔订单的环保类型进行发放
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 每批次调用的数据需要生成record_id,基于该字段做幂等校验，冲突返回错误ORDER_DUPLICATE
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 订单所对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public BelongMerchantInfoDTO getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(BelongMerchantInfoDTO belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public String getGetTime() {
		return this.getTime;
	}
	public void setGetTime(String getTime) {
		this.getTime = getTime;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
