package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普通支付创建订单并支付接口
 *
 * @author auto create
 * @since 1.0, 2019-05-05 18:55:11
 */
public class MybankPaymentTradeNormalpayTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3636636152556857624L;

	/**
	 * 金额，单位：分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 外部平台的单据号，网商订单与外部平台订单一一对应
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 币种
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/**
	 * 扩展参数，内容是JSON格式，并用urlconde编码，按场景约定具体字段。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作场景类型
CHARGE - 收费
	 */
	@ApiField("operate_scene_type")
	private String operateSceneType;

	/**
	 * 收方资产信息，内容是JSON格式，并用urlencode编码，按场景约定具体字段
	 */
	@ApiField("payee_fund_detail")
	private String payeeFundDetail;

	/**
	 * 付方资产信息，内容是JSON格式，并用urlencode编码，按场景约定具体字段
	 */
	@ApiField("payer_fund_detail")
	private String payerFundDetail;

	/**
	 * 支付备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求流水号，表示外部一次请求，幂等字段
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 请求时间，格式是yyyyMMddHHmmss
	 */
	@ApiField("request_time")
	private String requestTime;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCurrencyValue() {
		return this.currencyValue;
	}
	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOperateSceneType() {
		return this.operateSceneType;
	}
	public void setOperateSceneType(String operateSceneType) {
		this.operateSceneType = operateSceneType;
	}

	public String getPayeeFundDetail() {
		return this.payeeFundDetail;
	}
	public void setPayeeFundDetail(String payeeFundDetail) {
		this.payeeFundDetail = payeeFundDetail;
	}

	public String getPayerFundDetail() {
		return this.payerFundDetail;
	}
	public void setPayerFundDetail(String payerFundDetail) {
		this.payerFundDetail = payerFundDetail;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

}
