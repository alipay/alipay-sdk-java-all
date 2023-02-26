package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备订单打印
 *
 * @author auto create
 * @since 1.0, 2019-06-20 21:52:54
 */
public class AlipayCommerceIotOrderPrintSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2648184146962383268L;

	/**
	 * 设备唯一标识，设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 需要打印的订单数据
	 */
	@ApiField("print_data")
	private String printData;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getPrintData() {
		return this.printData;
	}
	public void setPrintData(String printData) {
		this.printData = printData;
	}

}
