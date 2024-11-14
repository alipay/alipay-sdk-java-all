package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易纠纷查询结果
 *
 * @author auto create
 * @since 1.0, 2024-06-17 14:04:15
 */
public class TradeComplainQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 1685259289677742119L;

	/**
	 * 支付宝侧投诉单号
	 */
	@ApiField("complain_event_id")
	private String complainEventId;

	/**
	 * 投诉原因
	 */
	@ApiField("complain_reason")
	private String complainReason;

	/**
	 * 已经扣除了我的钱，为什么再次扣款？？？
	 */
	@ApiField("content")
	private String content;

	/**
	 * 投诉单创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 投诉单结束时间
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
	 * 投诉诉求
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
	 * 状态
商家处理中：MERCHANT_PROCESSING
商家已反馈：MERCHANT_FEEDBACKED
投诉已完结：FINISHED
投诉已撤销：CANCELLED
平台处理中：PLATFORM_PROCESSING
平台处理完结：PLATFORM_FINISH
系统关闭：CLOSED
	 */
	@ApiField("status")
	private String status;

	/**
	 * 应用id，例如小程序id、生活号id、商家pid
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 应用类型
小程序为：APPID
生活号为：PUBLICID
商家为：PID
	 */
	@ApiField("target_type")
	private String targetType;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getComplainEventId() {
		return this.complainEventId;
	}
	public void setComplainEventId(String complainEventId) {
		this.complainEventId = complainEventId;
	}

	public String getComplainReason() {
		return this.complainReason;
	}
	public void setComplainReason(String complainReason) {
		this.complainReason = complainReason;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtFinished() {
		return this.gmtFinished;
	}
	public void setGmtFinished(String gmtFinished) {
		this.gmtFinished = gmtFinished;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getLeafCategoryName() {
		return this.leafCategoryName;
	}
	public void setLeafCategoryName(String leafCategoryName) {
		this.leafCategoryName = leafCategoryName;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
