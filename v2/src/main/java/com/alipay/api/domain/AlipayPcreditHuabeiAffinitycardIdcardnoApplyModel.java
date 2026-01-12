package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户根据用户身份证号申请开通花呗联名卡
 *
 * @author auto create
 * @since 1.0, 2026-01-09 10:57:45
 */
public class AlipayPcreditHuabeiAffinitycardIdcardnoApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3273363314414954295L;

	/**
	 * 业务场景，hellobike_hb_card-哈罗花呗联名卡
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用户身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 商户与支付宝签约的PID，从商户与支付宝签约的销售方案中获取
	 */
	@ApiField("merchant_partner_id")
	private String merchantPartnerId;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 外部业务单号，用于幂等，不超过32位
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getMerchantPartnerId() {
		return this.merchantPartnerId;
	}
	public void setMerchantPartnerId(String merchantPartnerId) {
		this.merchantPartnerId = merchantPartnerId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
