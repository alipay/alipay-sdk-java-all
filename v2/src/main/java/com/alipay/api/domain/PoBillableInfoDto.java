package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票信息
 *
 * @author auto create
 * @since 1.0, 2023-08-18 11:46:02
 */
public class PoBillableInfoDto extends AlipayObject {

	private static final long serialVersionUID = 3461923395389952876L;

	/**
	 * 是否海外
	 */
	@ApiField("is_abroad")
	private Boolean isAbroad;

	/**
	 * 是否当前采购人
	 */
	@ApiField("is_current_buyer")
	private Boolean isCurrentBuyer;

	/**
	 * 采购订单编号
	 */
	@ApiField("po_no")
	private String poNo;

	/**
	 * 收件人信息
	 */
	@ApiField("receive_info")
	private ReceiveInfoDto receiveInfo;

	public Boolean getIsAbroad() {
		return this.isAbroad;
	}
	public void setIsAbroad(Boolean isAbroad) {
		this.isAbroad = isAbroad;
	}

	public Boolean getIsCurrentBuyer() {
		return this.isCurrentBuyer;
	}
	public void setIsCurrentBuyer(Boolean isCurrentBuyer) {
		this.isCurrentBuyer = isCurrentBuyer;
	}

	public String getPoNo() {
		return this.poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	public ReceiveInfoDto getReceiveInfo() {
		return this.receiveInfo;
	}
	public void setReceiveInfo(ReceiveInfoDto receiveInfo) {
		this.receiveInfo = receiveInfo;
	}

}
