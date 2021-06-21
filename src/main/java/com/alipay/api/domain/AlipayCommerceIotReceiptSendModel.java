package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子小票信息发送接口
 *
 * @author auto create
 * @since 1.0, 2021-03-26 15:45:38
 */
public class AlipayCommerceIotReceiptSendModel extends AlipayObject {

	private static final long serialVersionUID = 6662639692624952526L;

	/**
	 * 用户支付宝uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 电子小票详情信息
	 */
	@ApiField("biz_data")
	private ReceiptBizData bizData;

	/**
	 * 机具身份id
	 */
	@ApiField("biztid")
	private String biztid;

	/**
	 * 直联商户填写pid，  pid和smid必填其一
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 间联商户填写smid，pid和smid必填其一
	 */
	@ApiField("smid")
	private String smid;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public ReceiptBizData getBizData() {
		return this.bizData;
	}
	public void setBizData(ReceiptBizData bizData) {
		this.bizData = bizData;
	}

	public String getBiztid() {
		return this.biztid;
	}
	public void setBiztid(String biztid) {
		this.biztid = biztid;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
