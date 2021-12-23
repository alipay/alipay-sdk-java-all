package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融科技预付订单撤销
 *
 * @author auto create
 * @since 1.0, 2019-07-08 20:31:37
 */
public class AlipayOpenOperationBizfeeAftechCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7545455757985952373L;

	/**
	 * 系统/应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 业务发生时间
	 */
	@ApiField("gmt_service")
	private String gmtService;

	/**
	 * 订单流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 租户Id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(String gmtService) {
		this.gmtService = gmtService;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
