package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道信息
 *
 * @author auto create
 * @since 1.0, 2023-07-19 17:38:22
 */
public class PayChannelPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 5194946273385563651L;

	/**
	 * 渠道额度
	 */
	@ApiField("channel_balance")
	private String channelBalance;

	/**
	 * 渠道可用性标识
	 */
	@ApiField("channel_enable")
	private Boolean channelEnable;

	/**
	 * 渠道唯一索引
	 */
	@ApiField("channel_index")
	private String channelIndex;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 支付时需要带回的渠道信息
	 */
	@ApiField("channel_operation_info")
	private String channelOperationInfo;

	/**
	 * 分期模型
	 */
	@ApiField("installment_info_list")
	private InstallmentInfo installmentInfoList;

	/**
	 * 营销模型
	 */
	@ApiField("operation_list")
	private PrePayOperationInfo operationList;

	public String getChannelBalance() {
		return this.channelBalance;
	}
	public void setChannelBalance(String channelBalance) {
		this.channelBalance = channelBalance;
	}

	public Boolean getChannelEnable() {
		return this.channelEnable;
	}
	public void setChannelEnable(Boolean channelEnable) {
		this.channelEnable = channelEnable;
	}

	public String getChannelIndex() {
		return this.channelIndex;
	}
	public void setChannelIndex(String channelIndex) {
		this.channelIndex = channelIndex;
	}

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelOperationInfo() {
		return this.channelOperationInfo;
	}
	public void setChannelOperationInfo(String channelOperationInfo) {
		this.channelOperationInfo = channelOperationInfo;
	}

	public InstallmentInfo getInstallmentInfoList() {
		return this.installmentInfoList;
	}
	public void setInstallmentInfoList(InstallmentInfo installmentInfoList) {
		this.installmentInfoList = installmentInfoList;
	}

	public PrePayOperationInfo getOperationList() {
		return this.operationList;
	}
	public void setOperationList(PrePayOperationInfo operationList) {
		this.operationList = operationList;
	}

}
