package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商户标准发卡并充值
 *
 * @author auto create
 * @since 1.0, 2022-12-29 17:24:15
 */
public class AlipayAssetVoucherprodChargeSendModel extends AlipayObject {

	private static final long serialVersionUID = 1721271699851779146L;

	/**
	 * 卡资金总金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资产总面额，单位元
	 */
	@ApiField("asset_amount")
	private String assetAmount;

	/**
	 * 资产详情
	 */
	@ApiListField("asset_details")
	@ApiField("vcp_asset_detail")
	private List<VcpAssetDetail> assetDetails;

	/**
	 * 资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产id类型 模板/资产id实例 ASSET_INSTANCE(实例)/ASSET_TEMPLATE(模板)
	 */
	@ApiField("asset_id_type")
	private String assetIdType;

	/**
	 * 资产平台类型卡/券
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 资金流场景
	 */
	@ApiField("fund_scence")
	private String fundScence;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户userId
	 */
	@ApiField("publisher_open_id")
	private String publisherOpenId;

	/**
	 * 用户userId
	 */
	@ApiField("publisher_user_id")
	private String publisherUserId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAssetAmount() {
		return this.assetAmount;
	}
	public void setAssetAmount(String assetAmount) {
		this.assetAmount = assetAmount;
	}

	public List<VcpAssetDetail> getAssetDetails() {
		return this.assetDetails;
	}
	public void setAssetDetails(List<VcpAssetDetail> assetDetails) {
		this.assetDetails = assetDetails;
	}

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
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

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getFundScence() {
		return this.fundScence;
	}
	public void setFundScence(String fundScence) {
		this.fundScence = fundScence;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPublisherOpenId() {
		return this.publisherOpenId;
	}
	public void setPublisherOpenId(String publisherOpenId) {
		this.publisherOpenId = publisherOpenId;
	}

	public String getPublisherUserId() {
		return this.publisherUserId;
	}
	public void setPublisherUserId(String publisherUserId) {
		this.publisherUserId = publisherUserId;
	}

}
