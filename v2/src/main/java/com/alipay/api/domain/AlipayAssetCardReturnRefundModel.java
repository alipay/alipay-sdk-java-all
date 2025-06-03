package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商户标准卡退款
 *
 * @author auto create
 * @since 1.0, 2024-05-27 13:58:45
 */
public class AlipayAssetCardReturnRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1297886568411313791L;

	/**
	 * 资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产id类型
	 */
	@ApiField("asset_id_type")
	private String assetIdType;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 业务来源
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 退卡资金场景
	 */
	@ApiField("fund_scence")
	private String fundScence;

	/**
	 * 是否销卡，true为销卡，false不销卡，只退余额
	 */
	@ApiField("is_cancel")
	private String isCancel;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作人id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订单明细
	 */
	@ApiListField("recharge_details")
	@ApiField("recharge_detail")
	private List<RechargeDetail> rechargeDetails;

	/**
	 * 退卡真实资金，单位元，包含手续费
	 */
	@ApiField("return_amount")
	private String returnAmount;

	/**
	 * 退卡面额，单位元，包含手续费
	 */
	@ApiField("return_asset_amount")
	private String returnAssetAmount;

	/**
	 * 退卡手续费真实资金，单位元，没有放0
	 */
	@ApiField("return_fee_amount")
	private String returnFeeAmount;

	/**
	 * 退卡手续费面额，单位元，没有放0
	 */
	@ApiField("return_fee_asset_amount")
	private String returnFeeAssetAmount;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
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

	public String getIsCancel() {
		return this.isCancel;
	}
	public void setIsCancel(String isCancel) {
		this.isCancel = isCancel;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<RechargeDetail> getRechargeDetails() {
		return this.rechargeDetails;
	}
	public void setRechargeDetails(List<RechargeDetail> rechargeDetails) {
		this.rechargeDetails = rechargeDetails;
	}

	public String getReturnAmount() {
		return this.returnAmount;
	}
	public void setReturnAmount(String returnAmount) {
		this.returnAmount = returnAmount;
	}

	public String getReturnAssetAmount() {
		return this.returnAssetAmount;
	}
	public void setReturnAssetAmount(String returnAssetAmount) {
		this.returnAssetAmount = returnAssetAmount;
	}

	public String getReturnFeeAmount() {
		return this.returnFeeAmount;
	}
	public void setReturnFeeAmount(String returnFeeAmount) {
		this.returnFeeAmount = returnFeeAmount;
	}

	public String getReturnFeeAssetAmount() {
		return this.returnFeeAssetAmount;
	}
	public void setReturnFeeAssetAmount(String returnFeeAssetAmount) {
		this.returnFeeAssetAmount = returnFeeAssetAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
