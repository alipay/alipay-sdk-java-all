package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信用区域金融授信变动通知接口
 *
 * @author auto create
 * @since 1.0, 2025-05-13 14:23:51
 */
public class ZhimaCreditEpRegionalfinanceCreditchangesyncNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8322811354881468771L;

	/**
	 * 金融产品code码，接口提供方分配。不同的机构的金融产品code码不同
	 */
	@ApiField("financial_product_code")
	private String financialProductCode;

	/**
	 * 商户自身的请求id，需保证其唯一性
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	/**
	 * 授信变动通知具体内容，json字符串
json字段描示例如下：
{"requestNo": "业务请求流水号", "creditApplyNo": "企信授信单号", "channelSeqNo": "行方授信单号(选填)", "channelUserId": "行方用户id", "approvelResult": "授信结果(0-不通过,1-通过)", "rejectCode": "拒绝原因编码(选填)", "rejectReason": "拒绝原因描述(选填)", "creditAmount": "授信额度,两位小数(选填)", "creditAmountValidity": "额度有效期,yyyy-MM-dd(选填)", "creditDrawValidity": "额度支用有效期,yyyy-MM-dd(选填)"}
	 */
	@ApiField("notify_content")
	private String notifyContent;

	public String getFinancialProductCode() {
		return this.financialProductCode;
	}
	public void setFinancialProductCode(String financialProductCode) {
		this.financialProductCode = financialProductCode;
	}

	public String getMerchantRequestId() {
		return this.merchantRequestId;
	}
	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}

	public String getNotifyContent() {
		return this.notifyContent;
	}
	public void setNotifyContent(String notifyContent) {
		this.notifyContent = notifyContent;
	}

}
