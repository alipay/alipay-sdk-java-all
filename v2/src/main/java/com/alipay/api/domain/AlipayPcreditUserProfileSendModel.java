package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 采集数据上报
 *
 * @author auto create
 * @since 1.0, 2017-04-11 11:14:05
 */
public class AlipayPcreditUserProfileSendModel extends AlipayObject {

	private static final long serialVersionUID = 1593552844624517256L;

	/**
	 * 委派采集唯一业务流水号，用户标识回执的委派采集任务，业务方在委派数据采集时提供到商户
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 采集的数据类别，用于标识采集数据类型，商户需要和平台约定，数据类别由平台分配给商户，如：
公积金数据 - HOUSING_FUND
运营商数据 - MOBILE_PHONE_CONTACTS
信用卡账单 - CREDIT_CARD_BILL
	 */
	@ApiField("item_key")
	private String itemKey;

	/**
	 * 采集业务单号，用于在商户系统唯一标识一次采集任务，由商户系统生成
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 扩展参数，json格式，用于商户回执给业务方，每种数据类别的扩展信息可能不同，具体信息由业务方和商户约定，如无约定，默认可不传
	 */
	@ApiField("params")
	private String params;

	/**
	 * 数据采集状态，用于标记采集结果，状态值和商户约定，目前支持:
SUCCESS-成功
FAIL-失败
	 */
	@ApiField("status")
	private String status;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getItemKey() {
		return this.itemKey;
	}
	public void setItemKey(String itemKey) {
		this.itemKey = itemKey;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
