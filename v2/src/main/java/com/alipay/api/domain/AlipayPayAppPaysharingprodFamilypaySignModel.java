package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约亲情卡
 *
 * @author auto create
 * @since 1.0, 2023-05-11 17:12:17
 */
public class AlipayPayAppPaysharingprodFamilypaySignModel extends AlipayObject {

	private static final long serialVersionUID = 7233944544973161862L;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 亲情卡赠卡人信息
	 */
	@ApiField("payer_info")
	private FamilyPayBizUserInfo payerInfo;

	/**
	 * 签约额度信息
	 */
	@ApiField("quota_info")
	private FamilyPayQuotaInfo quotaInfo;

	/**
	 * 签约完成回跳地址
	 */
	@ApiField("return_path")
	private String returnPath;

	/**
	 * 支付宝亲情卡业务定义给外部平台唯一业务身份标识，接入值咨询@子矛
	 */
	@ApiField("source")
	private String source;

	/**
	 * 收卡人信息
	 */
	@ApiField("spender_info")
	private FamilyPayBizUserInfo spenderInfo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public FamilyPayBizUserInfo getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(FamilyPayBizUserInfo payerInfo) {
		this.payerInfo = payerInfo;
	}

	public FamilyPayQuotaInfo getQuotaInfo() {
		return this.quotaInfo;
	}
	public void setQuotaInfo(FamilyPayQuotaInfo quotaInfo) {
		this.quotaInfo = quotaInfo;
	}

	public String getReturnPath() {
		return this.returnPath;
	}
	public void setReturnPath(String returnPath) {
		this.returnPath = returnPath;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public FamilyPayBizUserInfo getSpenderInfo() {
		return this.spenderInfo;
	}
	public void setSpenderInfo(FamilyPayBizUserInfo spenderInfo) {
		this.spenderInfo = spenderInfo;
	}

}
