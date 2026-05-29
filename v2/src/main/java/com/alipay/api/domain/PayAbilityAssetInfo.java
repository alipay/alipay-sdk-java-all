package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付能力咨询场景下的资产单元明细
 *
 * @author auto create
 * @since 1.0, 2026-03-18 10:59:58
 */
public class PayAbilityAssetInfo extends AlipayObject {

	private static final long serialVersionUID = 7796346329629226611L;

	/**
	 * 似同资产
	 */
	@ApiField("asset_type_code")
	private String assetTypeCode;

	/**
	 * 渠道编码的展示
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 是否足额参数
	 */
	@ApiField("enough")
	private Boolean enough;

	/**
	 * 成功则true
	 */
	@ApiField("has_history_pay_success")
	private Boolean hasHistoryPaySuccess;

	/**
	 * 代表银行机构，这里表示招商银行
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 标识机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public Boolean getEnough() {
		return this.enough;
	}
	public void setEnough(Boolean enough) {
		this.enough = enough;
	}

	public Boolean getHasHistoryPaySuccess() {
		return this.hasHistoryPaySuccess;
	}
	public void setHasHistoryPaySuccess(Boolean hasHistoryPaySuccess) {
		this.hasHistoryPaySuccess = hasHistoryPaySuccess;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

}
