package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评论删除
 *
 * @author auto create
 * @since 1.0, 2025-04-22 13:51:51
 */
public class AlipayContentLiveCommentDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4574816554754178946L;

	/**
	 * tab3评论id
	 */
	@ApiField("alipay_comment_id")
	private String alipayCommentId;

	/**
	 * 外部直播间id
	 */
	@ApiField("out_live_id")
	private String outLiveId;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	public String getAlipayCommentId() {
		return this.alipayCommentId;
	}
	public void setAlipayCommentId(String alipayCommentId) {
		this.alipayCommentId = alipayCommentId;
	}

	public String getOutLiveId() {
		return this.outLiveId;
	}
	public void setOutLiveId(String outLiveId) {
		this.outLiveId = outLiveId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
