package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产信息
 *
 * @author auto create
 * @since 1.0, 2021-04-27 23:58:35
 */
public class AssetBillInfo extends AlipayObject {

	private static final long serialVersionUID = 4627777884678619251L;

	/**
	 * 单据金额
amount = asset_amount + 手续费
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资产金额
	 */
	@ApiField("asset_amount")
	private String assetAmount;

	/**
	 * 资产id，资金单据流水所属资产的id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产类型，资金流水所属资产的类型，BENEFIT_TEMPLATE表示权益模板，由支付宝权益结算平台定义
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 资金单据流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * biz_type = BENEFIT_TEMPLATE_RECHARGE时有效，表示业务系统来源
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 业务号，上游业务系统填充的业务号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务类型
BENEFIT_TEMPLATE_RECHARGE: 创建模版
BENEFIT_TEMPLATE_RECYCLE: 模版回收
BENEFIT_TEMPLATE_SETTLE: 结算
BENEFIT_TEMPLATE_APPEND: 追加
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * biz_type=BENEFIT_TEMPLATE_RECHARGE时有效，表示活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 外部资金单据号
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/**
	 * biz_type = BENEFIT_TEMPLATE_SETTLE时有效，表示结算收款方账号
	 */
	@ApiField("partner_settle_id")
	private String partnerSettleId;

	/**
	 * biz_type= BENEFIT_TEMPLATE_SETTLE时有效，表示结算收款方账号类型
	 */
	@ApiField("partner_settle_id_type")
	private String partnerSettleIdType;

	/**
	 * 流水状态
I：初始化，结算已受理，资金划拨尚未完成；
S：划拨资金成功；
C：划拨资金失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * biz_type = BENEFIT_TEMPLATE_SETTLE时有效，表示结算交易时间
	 */
	@ApiField("trans_dt")
	private Date transDt;

	/**
	 * 资产所属方的支付宝会员id
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
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

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getOutBillNo() {
		return this.outBillNo;
	}
	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
	}

	public String getPartnerSettleId() {
		return this.partnerSettleId;
	}
	public void setPartnerSettleId(String partnerSettleId) {
		this.partnerSettleId = partnerSettleId;
	}

	public String getPartnerSettleIdType() {
		return this.partnerSettleIdType;
	}
	public void setPartnerSettleIdType(String partnerSettleIdType) {
		this.partnerSettleIdType = partnerSettleIdType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTransDt() {
		return this.transDt;
	}
	public void setTransDt(Date transDt) {
		this.transDt = transDt;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
