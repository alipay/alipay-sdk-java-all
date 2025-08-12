package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户申请花呗额度劵
 *
 * @author auto create
 * @since 1.0, 2025-07-11 16:51:50
 */
public class AlipayPcreditHuabeiAffinitycardApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6894771975164219368L;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务场景，hellobike_hb_card-哈罗花呗联名卡
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 商户与支付宝签约的PID，从商户与支付宝签约的销售方案中获取
	 */
	@ApiField("merchant_partner_id")
	private String merchantPartnerId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务单号，用于幂等，不超过32位
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMerchantPartnerId() {
		return this.merchantPartnerId;
	}
	public void setMerchantPartnerId(String merchantPartnerId) {
		this.merchantPartnerId = merchantPartnerId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
