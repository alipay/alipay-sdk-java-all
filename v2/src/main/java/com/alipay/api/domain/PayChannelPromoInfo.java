package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 渠道信息
 *
 * @author auto create
 * @since 1.0, 2024-05-13 21:04:16
 */
public class PayChannelPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 6681298989822426688L;

	/**
	 * 渠道额度
	 */
	@ApiField("channel_balance")
	private String channelBalance;

	/**
	 * 前置咨询渠道的渠道编码，从支付决策获取，可对外输出
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 渠道扩展信息
	 */
	@ApiField("channel_detail_params")
	private ChannelDetailParams channelDetailParams;

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
	 * 渠道logo的url
	 */
	@ApiField("channel_logo")
	private String channelLogo;

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
	@ApiListField("installment_info_list")
	@ApiField("installment_info")
	private List<InstallmentInfo> installmentInfoList;

	/**
	 * 营销模型
	 */
	@ApiListField("operation_list")
	@ApiField("pre_pay_operation_info")
	private List<PrePayOperationInfo> operationList;

	public String getChannelBalance() {
		return this.channelBalance;
	}
	public void setChannelBalance(String channelBalance) {
		this.channelBalance = channelBalance;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public ChannelDetailParams getChannelDetailParams() {
		return this.channelDetailParams;
	}
	public void setChannelDetailParams(ChannelDetailParams channelDetailParams) {
		this.channelDetailParams = channelDetailParams;
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

	public String getChannelLogo() {
		return this.channelLogo;
	}
	public void setChannelLogo(String channelLogo) {
		this.channelLogo = channelLogo;
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

	public List<InstallmentInfo> getInstallmentInfoList() {
		return this.installmentInfoList;
	}
	public void setInstallmentInfoList(List<InstallmentInfo> installmentInfoList) {
		this.installmentInfoList = installmentInfoList;
	}

	public List<PrePayOperationInfo> getOperationList() {
		return this.operationList;
	}
	public void setOperationList(List<PrePayOperationInfo> operationList) {
		this.operationList = operationList;
	}

}
