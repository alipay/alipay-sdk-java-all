package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投诉信息
 *
 * @author auto create
 * @since 1.0, 2024-11-15 16:03:54
 */
public class Complaint extends AlipayObject {

	private static final long serialVersionUID = 1162429568552195314L;

	/**
	 * 售卖订单id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 投诉ID
	 */
	@ApiField("complaint_id")
	private String complaintId;

	/**
	 * complaint_name
	 */
	@ApiField("complaint_name")
	private String complaintName;

	/**
	 * complaint_phone
	 */
	@ApiField("complaint_phone")
	private String complaintPhone;

	/**
	 * 投诉状态
	 */
	@ApiField("complaint_status")
	private String complaintStatus;

	/**
	 * 投诉类型
	 */
	@ApiField("complaint_type")
	private String complaintType;

	/**
	 * 投诉内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 投诉图片
	 */
	@ApiListField("image_url_list")
	@ApiField("string")
	private List<String> imageUrlList;

	/**
	 * 服务商处理链接
	 */
	@ApiField("isv_reply_url")
	private String isvReplyUrl;

	/**
	 * 商户处理链接
	 */
	@ApiField("merchant_reply_url")
	private String merchantReplyUrl;

	/**
	 * 商家对于投诉的回复内容
	 */
	@ApiField("reply_content")
	private String replyContent;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getComplaintId() {
		return this.complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}

	public String getComplaintName() {
		return this.complaintName;
	}
	public void setComplaintName(String complaintName) {
		this.complaintName = complaintName;
	}

	public String getComplaintPhone() {
		return this.complaintPhone;
	}
	public void setComplaintPhone(String complaintPhone) {
		this.complaintPhone = complaintPhone;
	}

	public String getComplaintStatus() {
		return this.complaintStatus;
	}
	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	public String getComplaintType() {
		return this.complaintType;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public List<String> getImageUrlList() {
		return this.imageUrlList;
	}
	public void setImageUrlList(List<String> imageUrlList) {
		this.imageUrlList = imageUrlList;
	}

	public String getIsvReplyUrl() {
		return this.isvReplyUrl;
	}
	public void setIsvReplyUrl(String isvReplyUrl) {
		this.isvReplyUrl = isvReplyUrl;
	}

	public String getMerchantReplyUrl() {
		return this.merchantReplyUrl;
	}
	public void setMerchantReplyUrl(String merchantReplyUrl) {
		this.merchantReplyUrl = merchantReplyUrl;
	}

	public String getReplyContent() {
		return this.replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

}
