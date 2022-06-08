package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店产品通知接口
 *
 * @author auto create
 * @since 1.0, 2020-12-31 11:48:28
 */
public class AlipayEcoMycarMaintainOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4447428847444314177L;

	/**
	 * 业务订单状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 状态描述
	 */
	@ApiField("biz_status_txt")
	private String bizStatusTxt;

	/**
	 * 拓展参数，区分4S厂商
{”remark”:”DFRC”}
日产- DFRC,  北现- BJXD
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 业务订单编号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 交易主题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 交易摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 交易金额，单位：分
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getBizStatusTxt() {
		return this.bizStatusTxt;
	}
	public void setBizStatusTxt(String bizStatusTxt) {
		this.bizStatusTxt = bizStatusTxt;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
