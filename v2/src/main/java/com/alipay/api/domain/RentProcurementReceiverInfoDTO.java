package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收货人信息
 *
 * @author auto create
 * @since 1.0, 2026-05-26 11:12:45
 */
public class RentProcurementReceiverInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2564453328682471344L;

	/**
	 * 收货人身份证号（用于顺丰签收面单）
	 */
	@ApiField("receiver_id_card_no")
	private String receiverIdCardNo;

	public String getReceiverIdCardNo() {
		return this.receiverIdCardNo;
	}
	public void setReceiverIdCardNo(String receiverIdCardNo) {
		this.receiverIdCardNo = receiverIdCardNo;
	}

}
