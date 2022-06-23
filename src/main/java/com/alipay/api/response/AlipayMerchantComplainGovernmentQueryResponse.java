package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReplyRecordResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.complain.government.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-10 12:55:21
 */
public class AlipayMerchantComplainGovernmentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3281872872271889955L;

	/** 
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * 支付宝侧投诉工单号
	 */
	@ApiField("complain_event_id")
	private String complainEventId;

	/** 
	 * 用户投诉诉求原因
	 */
	@ApiField("complain_reason")
	private String complainReason;

	/** 
	 * 投诉内容
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 线下交易投诉创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 线下交易投诉工单结束时间，当工单达到终态时，才会有结束时间
	 */
	@ApiField("gmt_finished")
	private String gmtFinished;

	/** 
	 * 投诉者申请平台接入（12315）的时间
	 */
	@ApiField("gmt_intervene_platform")
	private String gmtIntervenePlatform;

	/** 
	 * 线下交易投诉修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 用户提交投诉时提交的图片
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/** 
	 * 用户投诉诉求类型名称
	 */
	@ApiField("leaf_category_name")
	private String leafCategoryName;

	/** 
	 * 商家支付宝侧编号
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 投诉人电话号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/** 
	 * 用户、商家、平台之间的沟通记录
	 */
	@ApiListField("reply_detail_infos")
	@ApiField("reply_record_response")
	private List<ReplyRecordResponse> replyDetailInfos;

	/** 
	 * 商家处理中：MERCHANT_PROCESSING  
商家已处理：MERCHANT_FEEDBACKED  
商家已处理超时：MERCHANT_FEEDBACK_OVERTIME 
投诉已完结：FINISHED  
已撤销： CANCELLED  
系统关闭： CLOSED 
平台处理中： PLATFORM_PROCESSING 
平台处理完结：PLATFORM_FINISH
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 交易订单金额
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易商品名称
	 */
	@ApiField("trade_product_name")
	private String tradeProductName;

	/** 
	 * 交易成功时间
	 */
	@ApiField("trade_succeed_time")
	private String tradeSucceedTime;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

	public void setComplainEventId(String complainEventId) {
		this.complainEventId = complainEventId;
	}
	public String getComplainEventId( ) {
		return this.complainEventId;
	}

	public void setComplainReason(String complainReason) {
		this.complainReason = complainReason;
	}
	public String getComplainReason( ) {
		return this.complainReason;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtFinished(String gmtFinished) {
		this.gmtFinished = gmtFinished;
	}
	public String getGmtFinished( ) {
		return this.gmtFinished;
	}

	public void setGmtIntervenePlatform(String gmtIntervenePlatform) {
		this.gmtIntervenePlatform = gmtIntervenePlatform;
	}
	public String getGmtIntervenePlatform( ) {
		return this.gmtIntervenePlatform;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}
	public List<String> getImages( ) {
		return this.images;
	}

	public void setLeafCategoryName(String leafCategoryName) {
		this.leafCategoryName = leafCategoryName;
	}
	public String getLeafCategoryName( ) {
		return this.leafCategoryName;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo( ) {
		return this.phoneNo;
	}

	public void setReplyDetailInfos(List<ReplyRecordResponse> replyDetailInfos) {
		this.replyDetailInfos = replyDetailInfos;
	}
	public List<ReplyRecordResponse> getReplyDetailInfos( ) {
		return this.replyDetailInfos;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	public String getTradeAmount( ) {
		return this.tradeAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeProductName(String tradeProductName) {
		this.tradeProductName = tradeProductName;
	}
	public String getTradeProductName( ) {
		return this.tradeProductName;
	}

	public void setTradeSucceedTime(String tradeSucceedTime) {
		this.tradeSucceedTime = tradeSucceedTime;
	}
	public String getTradeSucceedTime( ) {
		return this.tradeSucceedTime;
	}

}
