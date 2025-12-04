package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付核销接口
 *
 * @author auto create
 * @since 1.0, 2025-05-29 19:57:31
 */
public class AlipayCommerceMerchantcardDeductionorderUseModel extends AlipayObject {

	private static final long serialVersionUID = 5485936117222579224L;

	/**
	 * 幂等号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 售卖订单id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 注意：先享次卡目前只支持同时核销1次
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家发起核销需要服务商回传外部交易订单号，商户开启了用户核销免授权确认，参数必传。
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 推荐填入，一般填写核销原因
	 */
	@ApiField("use_desc")
	private String useDesc;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUseDesc() {
		return this.useDesc;
	}
	public void setUseDesc(String useDesc) {
		this.useDesc = useDesc;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
