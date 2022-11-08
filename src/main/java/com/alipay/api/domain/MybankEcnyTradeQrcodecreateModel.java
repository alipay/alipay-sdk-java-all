package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人民币收款码发码
 *
 * @author auto create
 * @since 1.0, 2022-09-14 14:33:46
 */
public class MybankEcnyTradeQrcodecreateModel extends AlipayObject {

	private static final long serialVersionUID = 8238478672946774194L;

	/**
	 * 未设置为不带金额的收款码，设置为带金额的收款码
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 附加信息，受理机构在发码时传入，收款运营机构在交易确认的时候会回传
	 */
	@ApiField("attach_params")
	private String attachParams;

	/**
	 * 业务扩展参数,json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 不填为默认值收款码(collect_code)
	 */
	@ApiField("scene")
	private String scene;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAttachParams() {
		return this.attachParams;
	}
	public void setAttachParams(String attachParams) {
		this.attachParams = attachParams;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
