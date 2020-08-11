package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子小票信息发送接口
 *
 * @author auto create
 * @since 1.0, 2020-06-02 16:02:36
 */
public class AlipayCommerceIotReceiptSendModel extends AlipayObject {

	private static final long serialVersionUID = 1285665729592459856L;

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
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

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

}
