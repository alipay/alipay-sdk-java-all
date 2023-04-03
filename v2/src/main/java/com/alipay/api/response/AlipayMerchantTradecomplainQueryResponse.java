package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReplyRecordResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.tradecomplain.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:01:49
 */
public class AlipayMerchantTradecomplainQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6122134472729911555L;

	/** 
	 * 支付宝侧投诉单号
	 */
	@ApiField("complain_event_id")
	private String complainEventId;

	/** 
	 * 用户投诉原因
	 */
	@ApiField("complain_reason")
	private String complainReason;

	/** 
	 * 用户投诉内容
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 投诉单创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 投诉单完结时间
	 */
	@ApiField("gmt_finished")
	private String gmtFinished;

	/** 
	 * 投诉单修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 投诉图片
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/** 
	 * 用户投诉诉求
	 */
	@ApiField("leaf_category_name")
	private String leafCategoryName;

	/** 
	 * 商家订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 投诉人电话号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/** 
	 * 用户与商家之间的协商记录
	 */
	@ApiListField("reply_detail_infos")
	@ApiField("reply_record_response")
	private List<ReplyRecordResponse> replyDetailInfos;

	/** 
	 * 状态 
待处理：MERCHANT_PROCESSING 
已处理：MERCHANT_FEEDBACKED 
投诉完结：FINISHED 
投诉关闭：CANCELLED 
客服处理中：PLATFORM_PROCESSING 
客服处理完结：PLATFORM_FINISH 
投诉关闭：CLOSED
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 应用id，例如小程序id、生活号id、商家pid
	 */
	@ApiField("target_id")
	private String targetId;

	/** 
	 * 应用类型 例如小程序：APPID 生活号：PUBLICID 商家账户：PID
	 */
	@ApiField("target_type")
	private String targetType;

	/** 
	 * 交易金额，单位元
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

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

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
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

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public String getTargetId( ) {
		return this.targetId;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}
	public String getTargetType( ) {
		return this.targetType;
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

}
