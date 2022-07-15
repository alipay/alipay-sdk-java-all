package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量确认应收结果对象
 *
 * @author auto create
 * @since 1.0, 2020-03-26 17:43:24
 */
public class ConfirmReceivableDTO extends AlipayObject {

	private static final long serialVersionUID = 5588662399987482353L;

	/**
	 * 确认模式，支持ONE_TIME和BY_STRATEGY
	 */
	@ApiField("confirm_model")
	private String confirmModel;

	/**
	 * 请求时的业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 应收确认单号
	 */
	@ApiField("receivable_no")
	private String receivableNo;

	public String getConfirmModel() {
		return this.confirmModel;
	}
	public void setConfirmModel(String confirmModel) {
		this.confirmModel = confirmModel;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReceivableNo() {
		return this.receivableNo;
	}
	public void setReceivableNo(String receivableNo) {
		this.receivableNo = receivableNo;
	}

}
