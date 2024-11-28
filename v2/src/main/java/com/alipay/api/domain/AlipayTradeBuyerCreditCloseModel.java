package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易买家授信关闭
 *
 * @author auto create
 * @since 1.0, 2024-01-29 11:12:49
 */
public class AlipayTradeBuyerCreditCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2842542241546627779L;

	/**
	 * 标识买家授信额度的来源
	 */
	@ApiField("buyer_credit_source")
	private String buyerCreditSource;

	/**
	 * 本次授信拆分的买家主体userId
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 标识本次授信拆分的业务场景，具体的值由支付宝定义
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 标识商家授信额度的来源，具体的值由支付宝定义
	 */
	@ApiField("merchant_credit_source")
	private String merchantCreditSource;

	/**
	 * 商家授权开通账期的卖家userid
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 卖家每次发起授权拆分对应一次外部请求号，用于幂等使用，不能跟授信拆分申请的请求号重复
	 */
	@ApiField("out_reuquest_no")
	private String outReuquestNo;

	public String getBuyerCreditSource() {
		return this.buyerCreditSource;
	}
	public void setBuyerCreditSource(String buyerCreditSource) {
		this.buyerCreditSource = buyerCreditSource;
	}

	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getCreditScene() {
		return this.creditScene;
	}
	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}

	public String getMerchantCreditSource() {
		return this.merchantCreditSource;
	}
	public void setMerchantCreditSource(String merchantCreditSource) {
		this.merchantCreditSource = merchantCreditSource;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOutReuquestNo() {
		return this.outReuquestNo;
	}
	public void setOutReuquestNo(String outReuquestNo) {
		this.outReuquestNo = outReuquestNo;
	}

}
