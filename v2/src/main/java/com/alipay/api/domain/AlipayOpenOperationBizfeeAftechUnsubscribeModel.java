package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融科技订购退订失效通知
 *
 * @author auto create
 * @since 1.0, 2019-07-08 21:11:38
 */
public class AlipayOpenOperationBizfeeAftechUnsubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 8598159943999937881L;

	/**
	 * 系统/应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 业务发生时间
	 */
	@ApiField("gmt_service")
	private String gmtService;

	/**
	 * 订购终止时间
	 */
	@ApiField("gmt_stop")
	private String gmtStop;

	/**
	 * 外部业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 需退还的订购费用金额
单位元，最多两位小数。
	 */
	@ApiField("return_fee_amount")
	private String returnFeeAmount;

	/**
	 * 需退还的订购费用币种
币种数字编码。
	 */
	@ApiField("return_fee_currency")
	private String returnFeeCurrency;

	/**
	 * 租户Id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 已使用的订购服务量
传天数/次数等数值，用于校验退费金额正确性。
	 */
	@ApiField("used_service_amount")
	private String usedServiceAmount;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(String gmtService) {
		this.gmtService = gmtService;
	}

	public String getGmtStop() {
		return this.gmtStop;
	}
	public void setGmtStop(String gmtStop) {
		this.gmtStop = gmtStop;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReturnFeeAmount() {
		return this.returnFeeAmount;
	}
	public void setReturnFeeAmount(String returnFeeAmount) {
		this.returnFeeAmount = returnFeeAmount;
	}

	public String getReturnFeeCurrency() {
		return this.returnFeeCurrency;
	}
	public void setReturnFeeCurrency(String returnFeeCurrency) {
		this.returnFeeCurrency = returnFeeCurrency;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getUsedServiceAmount() {
		return this.usedServiceAmount;
	}
	public void setUsedServiceAmount(String usedServiceAmount) {
		this.usedServiceAmount = usedServiceAmount;
	}

}
