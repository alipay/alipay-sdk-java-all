package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 售卖订单数据同步请求模型
 *
 * @author auto create
 * @since 1.0, 2025-01-10 11:23:41
 */
public class OrderDataSyncRequest extends AlipayObject {

	private static final long serialVersionUID = 4798938165193129197L;

	/**
	 * 业务id，唯一键标识
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 取消类型，由外部传入
	 */
	@ApiField("cancel_type")
	private String cancelType;

	/**
	 * 卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 卡资产版本号
	 */
	@ApiField("card_version")
	private String cardVersion;

	/**
	 * 来源渠道，由外部传入，标识从哪个渠道来
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 周期卡次数单位，标识是几周或者几个月
	 */
	@ApiField("count_unit")
	private String countUnit;

	/**
	 * 售卖订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 扣款计划列表
	 */
	@ApiListField("deduction_plan_list")
	@ApiField("deduction_plan_data_sync_request")
	private List<DeductionPlanDataSyncRequest> deductionPlanList;

	/**
	 * 详情页面链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 环境标识，外部传入
	 */
	@ApiField("env")
	private String env;

	/**
	 * 有效期结束时间
	 */
	@ApiField("expired_end_time")
	private Date expiredEndTime;

	/**
	 * 有效期开始时间
	 */
	@ApiField("expired_start_time")
	private Date expiredStartTime;

	/**
	 * 商品编码，由外部传入
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 卡包实例id，由外部传入
	 */
	@ApiField("kabao_id")
	private String kabaoId;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户pid，由外部传入
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 购卡门店id，由外部传入
	 */
	@ApiField("order_shop_id")
	private String orderShopId;

	/**
	 * 外部单号，由外部传入
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 退卡金额（单位元）
	 */
	@ApiField("refund_price")
	private String refundPrice;

	/**
	 * 退卡时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 卡剩余可使用次数
	 */
	@ApiField("remain_count")
	private Long remainCount;

	/**
	 * 解决方案类型（卡类型）
	 */
	@ApiField("solution_type")
	private String solutionType;

	/**
	 * 售卖订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 总计可使用次数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 总原价（单位元）
	 */
	@ApiField("total_original_price")
	private String totalOriginalPrice;

	/**
	 * 总售价（单位元）
	 */
	@ApiField("total_sale_price")
	private String totalSalePrice;

	/**
	 * 售卖订单更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	/**
	 * 用户id，由外部传入
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCancelType() {
		return this.cancelType;
	}
	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
	}

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardVersion() {
		return this.cardVersion;
	}
	public void setCardVersion(String cardVersion) {
		this.cardVersion = cardVersion;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getCountUnit() {
		return this.countUnit;
	}
	public void setCountUnit(String countUnit) {
		this.countUnit = countUnit;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<DeductionPlanDataSyncRequest> getDeductionPlanList() {
		return this.deductionPlanList;
	}
	public void setDeductionPlanList(List<DeductionPlanDataSyncRequest> deductionPlanList) {
		this.deductionPlanList = deductionPlanList;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public Date getExpiredEndTime() {
		return this.expiredEndTime;
	}
	public void setExpiredEndTime(Date expiredEndTime) {
		this.expiredEndTime = expiredEndTime;
	}

	public Date getExpiredStartTime() {
		return this.expiredStartTime;
	}
	public void setExpiredStartTime(Date expiredStartTime) {
		this.expiredStartTime = expiredStartTime;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getKabaoId() {
		return this.kabaoId;
	}
	public void setKabaoId(String kabaoId) {
		this.kabaoId = kabaoId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderShopId() {
		return this.orderShopId;
	}
	public void setOrderShopId(String orderShopId) {
		this.orderShopId = orderShopId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRefundPrice() {
		return this.refundPrice;
	}
	public void setRefundPrice(String refundPrice) {
		this.refundPrice = refundPrice;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public Long getRemainCount() {
		return this.remainCount;
	}
	public void setRemainCount(Long remainCount) {
		this.remainCount = remainCount;
	}

	public String getSolutionType() {
		return this.solutionType;
	}
	public void setSolutionType(String solutionType) {
		this.solutionType = solutionType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getTotalOriginalPrice() {
		return this.totalOriginalPrice;
	}
	public void setTotalOriginalPrice(String totalOriginalPrice) {
		this.totalOriginalPrice = totalOriginalPrice;
	}

	public String getTotalSalePrice() {
		return this.totalSalePrice;
	}
	public void setTotalSalePrice(String totalSalePrice) {
		this.totalSalePrice = totalSalePrice;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
