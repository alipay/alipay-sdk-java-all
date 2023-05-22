package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖家授信准入批量查询
 *
 * @author auto create
 * @since 1.0, 2022-10-17 14:16:09
 */
public class AlipayPcreditHuabeiSelleradmitAdmittanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2137432261131259157L;

	/**
	 * 来源系统
	 */
	@ApiField("from_app")
	private String fromApp;

	/**
	 * 合作机构的支付宝id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 收款方的支付宝id
	 */
	@ApiField("payee_alipay_user_id")
	private String payeeAlipayUserId;

	/**
	 * 请求标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 准入查询场景
	 */
	@ApiField("seller_admit_scene")
	private String sellerAdmitScene;

	/**
	 * 摊位id
	 */
	@ApiField("stall_code")
	private String stallCode;

	/**
	 * 二级商户的id
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getFromApp() {
		return this.fromApp;
	}
	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayeeAlipayUserId() {
		return this.payeeAlipayUserId;
	}
	public void setPayeeAlipayUserId(String payeeAlipayUserId) {
		this.payeeAlipayUserId = payeeAlipayUserId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSellerAdmitScene() {
		return this.sellerAdmitScene;
	}
	public void setSellerAdmitScene(String sellerAdmitScene) {
		this.sellerAdmitScene = sellerAdmitScene;
	}

	public String getStallCode() {
		return this.stallCode;
	}
	public void setStallCode(String stallCode) {
		this.stallCode = stallCode;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
