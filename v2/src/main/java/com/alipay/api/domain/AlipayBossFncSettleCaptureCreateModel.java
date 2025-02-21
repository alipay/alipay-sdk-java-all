package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 请款单批量创建
 *
 * @author auto create
 * @since 1.0, 2020-03-26 17:40:40
 */
public class AlipayBossFncSettleCaptureCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6526319272731845768L;

	/**
	 * 请款创建单列表
	 */
	@ApiListField("capture_create_order_list")
	@ApiField("capture_create_order")
	private List<CaptureCreateOrder> captureCreateOrderList;

	public List<CaptureCreateOrder> getCaptureCreateOrderList() {
		return this.captureCreateOrderList;
	}
	public void setCaptureCreateOrderList(List<CaptureCreateOrder> captureCreateOrderList) {
		this.captureCreateOrderList = captureCreateOrderList;
	}

}
