package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益核销
 *
 * @author auto create
 * @since 1.0, 2024-10-09 15:58:01
 */
public class AlipayMarketingAssetFundUseModel extends AlipayObject {

	private static final long serialVersionUID = 5869611874274628241L;

	/**
	 * 权益资金信息，包括权益id和权益数量
	 */
	@ApiListField("asset_fund_infos")
	@ApiField("asset_fund_d_t_o")
	private List<AssetFundDTO> assetFundInfos;

	/**
	 * 资产id类型，目前包括ASSET_TEMPLATE(模板)和ASSET_INSTANCE(实例)两种
	 */
	@ApiField("asset_id_type")
	private String assetIdType;

	/**
	 * 资产类型，包括VOUCHER(券)、POINT(积分)、CARD(卡)等多种资产类型
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 资金业务场景，taobaoWechatPay(微信支付)、taobaoAlipayPay(支付宝支付)
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 业务号，用于幂等
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 资产资金场景，包括BIZFUND_SEND_CASH（现金发放）BIZFUND_SEND_CASH_REVERSE(现金发放逆向)等
	 */
	@ApiField("fund_scene")
	private String fundScene;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public List<AssetFundDTO> getAssetFundInfos() {
		return this.assetFundInfos;
	}
	public void setAssetFundInfos(List<AssetFundDTO> assetFundInfos) {
		this.assetFundInfos = assetFundInfos;
	}

	public String getAssetIdType() {
		return this.assetIdType;
	}
	public void setAssetIdType(String assetIdType) {
		this.assetIdType = assetIdType;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getFundScene() {
		return this.fundScene;
	}
	public void setFundScene(String fundScene) {
		this.fundScene = fundScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
