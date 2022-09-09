package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReplyRecordResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.serviceconsult.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:14
 */
public class AlipayMerchantServiceconsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8166351828697845967L;

	/** 
	 * 支付宝侧服务咨询单号
	 */
	@ApiField("consult_event_id")
	private String consultEventId;

	/** 
	 * 咨询内容
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 咨询单创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 咨询工单结束时间，当工单达到终态时，才会有结束时间
	 */
	@ApiField("gmt_finished")
	private String gmtFinished;

	/** 
	 * 咨询工单修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 咨询图片
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/** 
	 * 最近一笔商家订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 咨询人电话号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/** 
	 * 问题类型
	 */
	@ApiField("question_type")
	private String questionType;

	/** 
	 * 用户与商家之间的沟通记录
	 */
	@ApiListField("reply_detail_infos")
	@ApiField("reply_record_response")
	private List<ReplyRecordResponse> replyDetailInfos;

	/** 
	 * 二级问题类型
	 */
	@ApiField("second_question_type")
	private String secondQuestionType;

	/** 
	 * 状态 商家处理中：MERCHANT_PROCESSING 商家已回复： MERCHANT_REPLIED 已撤销： CANCELLED 系统关闭： CLOSED
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 应用id，例如小程序id
	 */
	@ApiField("target_id")
	private String targetId;

	/** 
	 * 应用类型 小程序为：APPID 生活号为：PUBLICID
	 */
	@ApiField("target_type")
	private String targetType;

	/** 
	 * 最近一笔支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setConsultEventId(String consultEventId) {
		this.consultEventId = consultEventId;
	}
	public String getConsultEventId( ) {
		return this.consultEventId;
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

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public String getQuestionType( ) {
		return this.questionType;
	}

	public void setReplyDetailInfos(List<ReplyRecordResponse> replyDetailInfos) {
		this.replyDetailInfos = replyDetailInfos;
	}
	public List<ReplyRecordResponse> getReplyDetailInfos( ) {
		return this.replyDetailInfos;
	}

	public void setSecondQuestionType(String secondQuestionType) {
		this.secondQuestionType = secondQuestionType;
	}
	public String getSecondQuestionType( ) {
		return this.secondQuestionType;
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

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
