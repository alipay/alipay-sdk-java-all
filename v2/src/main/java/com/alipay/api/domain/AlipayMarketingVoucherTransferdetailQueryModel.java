package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询券交易信息接口
 *
 * @author auto create
 * @since 1.0, 2022-12-22 14:08:12
 */
public class AlipayMarketingVoucherTransferdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4422833311411369629L;

	/**
	 * 资产类型过滤, 默认全部返回
	 */
	@ApiListField("asset_types")
	@ApiField("string")
	private List<String> assetTypes;

	/**
	 * 支付宝用户ID(映射的openId) ，必须保证待使用的券ID归属于该支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户ID ，必须保证待使用的券ID归属于该支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getAssetTypes() {
		return this.assetTypes;
	}
	public void setAssetTypes(List<String> assetTypes) {
		this.assetTypes = assetTypes;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
