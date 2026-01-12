package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养评论
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:21:52
 */
public class MerchantshopCommentResult extends AlipayObject {

	private static final long serialVersionUID = 6523218417318854942L;

	/**
	 * 评论内容
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 评论时间格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("comment_time")
	private String commentTime;

	/**
	 * 评论用户的头像url，记录用户评价时头像完整路径
	 */
	@ApiField("face")
	private String face;

	/**
	 * 评论晒图，多个逗号分隔。使用车主平台接口上传图片地址。
	 */
	@ApiField("imgs")
	private String imgs;

	/**
	 * 评论用户的昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 车主平台订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 回复内容
	 */
	@ApiField("reply")
	private String reply;

	/**
	 * 回复时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("reply_time")
	private String replyTime;

	/**
	 * 评分， 两位小数
	 */
	@ApiField("score")
	private String score;

	/**
	 * 车主平台门店编码
	 */
	@ApiField("shop_id")
	private Long shopId;

	/**
	 * 评论用户支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 评论的用户名称，敏感数据脱敏处理。
	 */
	@ApiField("user_name")
	private String userName;

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommentTime() {
		return this.commentTime;
	}
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}

	public String getFace() {
		return this.face;
	}
	public void setFace(String face) {
		this.face = face;
	}

	public String getImgs() {
		return this.imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getReply() {
		return this.reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getReplyTime() {
		return this.replyTime;
	}
	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public Long getShopId() {
		return this.shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
