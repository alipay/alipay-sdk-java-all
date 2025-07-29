package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投诉查询结果
 *
 * @author auto create
 * @since 1.0, 2023-10-12 09:59:45
 */
public class ComplaintProcessorResponse extends AlipayObject {

	private static final long serialVersionUID = 3342725654127196646L;

	/**
	 * 卡ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 投诉ID
	 */
	@ApiField("complaint_id")
	private String complaintId;

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
	private Date createTime;

	/**
	 * 投诉图片
	 */
	@ApiListField("image_url_list")
	@ApiField("string")
	private List<String> imageUrlList;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户的pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 回复内容
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

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<String> getImageUrlList() {
		return this.imageUrlList;
	}
	public void setImageUrlList(List<String> imageUrlList) {
		this.imageUrlList = imageUrlList;
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

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getReplyContent() {
		return this.replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

}
