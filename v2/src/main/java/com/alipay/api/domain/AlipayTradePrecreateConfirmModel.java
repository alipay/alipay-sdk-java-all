package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预下单订单确认接口
 *
 * @author auto create
 * @since 1.0, 2022-04-13 11:47:30
 */
public class AlipayTradePrecreateConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7827339453247628844L;

	/**
	 * 买家id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家id类型：

蚂蚁通行证，取值：

antid
	 */
	@ApiField("buyer_id_type")
	private String buyerIdType;

	/**
	 * 预下单阶段产生的码串，对应预下单订单。
	 */
	@ApiField("confirm_id")
	private String confirmId;

	/**
	 * 预下单阶段的码串类型 
订单二维码，取值：qr_code
	 */
	@ApiField("confirm_type")
	private String confirmType;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private TradePrecreateConfirmExtendParam extendParams;

	/**
	 * 发卡站ID，由支付宝中国分配
	 */
	@ApiField("issuer_id")
	private String issuerId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerIdType() {
		return this.buyerIdType;
	}
	public void setBuyerIdType(String buyerIdType) {
		this.buyerIdType = buyerIdType;
	}

	public String getConfirmId() {
		return this.confirmId;
	}
	public void setConfirmId(String confirmId) {
		this.confirmId = confirmId;
	}

	public String getConfirmType() {
		return this.confirmType;
	}
	public void setConfirmType(String confirmType) {
		this.confirmType = confirmType;
	}

	public TradePrecreateConfirmExtendParam getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(TradePrecreateConfirmExtendParam extendParams) {
		this.extendParams = extendParams;
	}

	public String getIssuerId() {
		return this.issuerId;
	}
	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

}
