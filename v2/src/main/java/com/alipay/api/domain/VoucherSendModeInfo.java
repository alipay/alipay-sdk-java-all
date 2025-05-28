package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券发放方式
 *
 * @author auto create
 * @since 1.0, 2025-04-27 19:40:18
 */
public class VoucherSendModeInfo extends AlipayObject {

	private static final long serialVersionUID = 8546336474667727964L;

	/**
	 * 推广渠道列表
	 */
	@ApiListField("delivery_channel_list")
	@ApiField("string")
	private List<String> deliveryChannelList;

	/**
	 * 券包信息。
	 */
	@ApiField("voucher_package_mode_info")
	private VoucherPackageModeInfo voucherPackageModeInfo;

	/**
	 * 券售卖信息。
	 */
	@ApiField("voucher_sale_mode_info")
	private VoucherSaleModeInfo voucherSaleModeInfo;

	/**
	 * 券发放模式。
	 */
	@ApiField("voucher_send_mode")
	private String voucherSendMode;

	/**
	 * 券发放规则。
	 */
	@ApiField("voucher_send_rule_info")
	private VoucherSendRuleInfo voucherSendRuleInfo;

	public List<String> getDeliveryChannelList() {
		return this.deliveryChannelList;
	}
	public void setDeliveryChannelList(List<String> deliveryChannelList) {
		this.deliveryChannelList = deliveryChannelList;
	}

	public VoucherPackageModeInfo getVoucherPackageModeInfo() {
		return this.voucherPackageModeInfo;
	}
	public void setVoucherPackageModeInfo(VoucherPackageModeInfo voucherPackageModeInfo) {
		this.voucherPackageModeInfo = voucherPackageModeInfo;
	}

	public VoucherSaleModeInfo getVoucherSaleModeInfo() {
		return this.voucherSaleModeInfo;
	}
	public void setVoucherSaleModeInfo(VoucherSaleModeInfo voucherSaleModeInfo) {
		this.voucherSaleModeInfo = voucherSaleModeInfo;
	}

	public String getVoucherSendMode() {
		return this.voucherSendMode;
	}
	public void setVoucherSendMode(String voucherSendMode) {
		this.voucherSendMode = voucherSendMode;
	}

	public VoucherSendRuleInfo getVoucherSendRuleInfo() {
		return this.voucherSendRuleInfo;
	}
	public void setVoucherSendRuleInfo(VoucherSendRuleInfo voucherSendRuleInfo) {
		this.voucherSendRuleInfo = voucherSendRuleInfo;
	}

}
