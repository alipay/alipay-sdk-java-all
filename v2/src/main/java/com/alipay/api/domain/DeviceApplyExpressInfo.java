package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流包裹信息
 *
 * @author auto create
 * @since 1.0, 2026-07-03 15:30:16
 */
public class DeviceApplyExpressInfo extends AlipayObject {

	private static final long serialVersionUID = 7293341936866254783L;

	/**
	 * 物流详细信息，包含物流的节点信息
	 */
	@ApiListField("express_detail_list")
	@ApiField("device_apply_express_detail")
	private List<DeviceApplyExpressDetail> expressDetailList;

	/**
	 * 快递单号
	 */
	@ApiField("mail_no")
	private String mailNo;

	public List<DeviceApplyExpressDetail> getExpressDetailList() {
		return this.expressDetailList;
	}
	public void setExpressDetailList(List<DeviceApplyExpressDetail> expressDetailList) {
		this.expressDetailList = expressDetailList;
	}

	public String getMailNo() {
		return this.mailNo;
	}
	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}

}
