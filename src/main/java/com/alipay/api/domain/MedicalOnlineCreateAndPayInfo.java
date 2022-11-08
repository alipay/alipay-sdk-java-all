package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国家医保局线上业务下单信息
 *
 * @author auto create
 * @since 1.0, 2022-06-29 15:54:09
 */
public class MedicalOnlineCreateAndPayInfo extends AlipayObject {

	private static final long serialVersionUID = 2346358347599152865L;

	/**
	 * 渠道订单流水号
	 */
	@ApiField("chnl_ord_sn")
	private String chnlOrdSn;

	/**
	 * 医院订单号(入参中的医院订单号)
	 */
	@ApiField("med_org_ord")
	private String medOrgOrd;

	/**
	 * 第三方平台商单号(入参中的第三方平台商号)
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付订单号(入参中的支付订单号)
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/**
	 * 支付宝中间页链接
	 */
	@ApiField("pay_url")
	private String payUrl;

	/**
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	public String getChnlOrdSn() {
		return this.chnlOrdSn;
	}
	public void setChnlOrdSn(String chnlOrdSn) {
		this.chnlOrdSn = chnlOrdSn;
	}

	public String getMedOrgOrd() {
		return this.medOrgOrd;
	}
	public void setMedOrgOrd(String medOrgOrd) {
		this.medOrgOrd = medOrgOrd;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayOrderId() {
		return this.payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}

	public String getPayUrl() {
		return this.payUrl;
	}
	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
