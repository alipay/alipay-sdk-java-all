package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.voucherprod.benefittemplate.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:11
 */
public class AlipayAssetPointVoucherprodBenefittemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1565275363184228134L;

	/** 
	 * 权益模版的可用金额，即总金额减去已结算金额
	 */
	@ApiField("asset_amount")
	private String assetAmount;

	/** 
	 * 资产id，即权益模板的id
	 */
	@ApiField("asset_id")
	private String assetId;

	/** 
	 * 权益模版的总金额，包含采购和追加的金额
	 */
	@ApiField("asset_total_amount")
	private String assetTotalAmount;

	/** 
	 * 资产类型，由支付宝权益结算平台定义，BENEFIT_TEMPLATE表示权益模版
	 */
	@ApiField("asset_type")
	private String assetType;

	/** 
	 * 过期金额，单位元，部分场景有含义，具体咨询相关技术同学
	 */
	@ApiField("expire_amount")
	private String expireAmount;

	/** 
	 * 权益模版的过期时间
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/** 
	 * 发放金额，单位元，部分场景有含义，具体咨询相关技术同学
	 */
	@ApiField("publish_amount")
	private String publishAmount;

	/** 
	 * 已回收金额
	 */
	@ApiField("recycle_amount")
	private String recycleAmount;

	/** 
	 * 权益模版回收时间，回收时间是资金退回的时间
	 */
	@ApiField("recycle_dt")
	private Date recycleDt;

	/** 
	 * 退款金额，单位元，部分场景有含义，具体咨询相关技术同学
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 权益模版状态：
WAIT_EFFECTIVE:待生效，已创建未发布；
EFFECTIVE:已发布;
WAIT_RECYCLE:待回收，已过期未处理；
RECYCLE:已回收
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 使用金额，单位元，即结算的金额
	 */
	@ApiField("use_amount")
	private String useAmount;

	/** 
	 * 支付宝会员id，权益模板所属的商家的支付宝会员id
	 */
	@ApiField("user_id")
	private String userId;

	public void setAssetAmount(String assetAmount) {
		this.assetAmount = assetAmount;
	}
	public String getAssetAmount( ) {
		return this.assetAmount;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getAssetId( ) {
		return this.assetId;
	}

	public void setAssetTotalAmount(String assetTotalAmount) {
		this.assetTotalAmount = assetTotalAmount;
	}
	public String getAssetTotalAmount( ) {
		return this.assetTotalAmount;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public String getAssetType( ) {
		return this.assetType;
	}

	public void setExpireAmount(String expireAmount) {
		this.expireAmount = expireAmount;
	}
	public String getExpireAmount( ) {
		return this.expireAmount;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Date getExpireDate( ) {
		return this.expireDate;
	}

	public void setPublishAmount(String publishAmount) {
		this.publishAmount = publishAmount;
	}
	public String getPublishAmount( ) {
		return this.publishAmount;
	}

	public void setRecycleAmount(String recycleAmount) {
		this.recycleAmount = recycleAmount;
	}
	public String getRecycleAmount( ) {
		return this.recycleAmount;
	}

	public void setRecycleDt(Date recycleDt) {
		this.recycleDt = recycleDt;
	}
	public Date getRecycleDt( ) {
		return this.recycleDt;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUseAmount(String useAmount) {
		this.useAmount = useAmount;
	}
	public String getUseAmount( ) {
		return this.useAmount;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
