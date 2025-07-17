package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创单
 *
 * @author auto create
 * @since 1.0, 2024-09-25 17:02:53
 */
public class AlipayEbppIndustryPerformOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1285649426176537658L;

	/**
	 * 通过支付宝收银台支付的资产详情，主要包括该笔订单的资产类型、资产金额、资产协议、支付描述等
	 */
	@ApiField("alipay_trade_asset")
	private TradeAssetRequest alipayTradeAsset;

	/**
	 * 账单金额(订单原价，金额元)
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 商户创单类型。用户主动创建指需要用户主动拉起收银台，用户主动确认后例如输入付款密码进行支付。商户直连代扣创建指商户和用户已签约代扣协议，由商户主动发起代扣、不需要用户主动确认，该场景商户必传用户代扣协议号。
	 */
	@ApiField("create_type")
	private String createType;

	/**
	 * 透传二级商户smid 例如2088**********33
	 */
	@ApiField("inst_smid")
	private String instSmid;

	/**
	 * 商户app_id维度下的用户标识，目前为47位字符串。ser_id和open_id必传其一，建议商户传递open_id。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号。
由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
有根据商户订单号支付幂等需求的必传。
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 目前只支持直付通模式的商家分账。
	 */
	@ApiListField("profit_sharing_list")
	@ApiField("profit_sharing_request")
	private List<ProfitSharingRequest> profitSharingList;

	/**
	 * 业务服务用户载体(户号\卡号\手机号等)，比如手机充值业务，充值手机号即为该服务载体。
	 */
	@ApiField("service_account")
	private String serviceAccount;

	/**
	 * 订单超时未支付的关单时间 单位秒。
外部传入则以传入时间为准，否则以系统默认10分钟未支付则关闭订单。
	 */
	@ApiField("timeout_close")
	private Long timeoutClose;

	/**
	 * 行业业务受理平台-服务模型唯一编码。该编码由业务BD入驻行业业务受理平台后分配给外部商户。
	 */
	@ApiField("unique_code")
	private String uniqueCode;

	/**
	 * 支付宝用户的userId，目前为16位纯数字。user_id和open_id必传其一。
	 */
	@ApiField("user_id")
	private String userId;

	public TradeAssetRequest getAlipayTradeAsset() {
		return this.alipayTradeAsset;
	}
	public void setAlipayTradeAsset(TradeAssetRequest alipayTradeAsset) {
		this.alipayTradeAsset = alipayTradeAsset;
	}

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getCreateType() {
		return this.createType;
	}
	public void setCreateType(String createType) {
		this.createType = createType;
	}

	public String getInstSmid() {
		return this.instSmid;
	}
	public void setInstSmid(String instSmid) {
		this.instSmid = instSmid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	public List<ProfitSharingRequest> getProfitSharingList() {
		return this.profitSharingList;
	}
	public void setProfitSharingList(List<ProfitSharingRequest> profitSharingList) {
		this.profitSharingList = profitSharingList;
	}

	public String getServiceAccount() {
		return this.serviceAccount;
	}
	public void setServiceAccount(String serviceAccount) {
		this.serviceAccount = serviceAccount;
	}

	public Long getTimeoutClose() {
		return this.timeoutClose;
	}
	public void setTimeoutClose(Long timeoutClose) {
		this.timeoutClose = timeoutClose;
	}

	public String getUniqueCode() {
		return this.uniqueCode;
	}
	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
