package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片视频捞取请求
 *
 * @author auto create
 * @since 1.0, 2021-04-28 15:11:45
 */
public class AlipayMsaasMediarecogMmtcaftscvPicvideoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7557459754114984489L;

	/**
	 * 请求Id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 交易Id
	 */
	@ApiField("transaction_id")
	private String transactionId;

	/**
	 * 捞取类型: images, videos, video_info
	 */
	@ApiField("type")
	private String type;

	/**
	 * 只对videos类型有效, 例：
{"layers": "0", "segments": "0"}
{"layers": "1,2,3,4,5", "segments": "1,2"}
注：layers 为 "0"为全部层，segments 为 "0"为全部 段
	 */
	@ApiField("video_detail")
	private String videoDetail;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getVideoDetail() {
		return this.videoDetail;
	}
	public void setVideoDetail(String videoDetail) {
		this.videoDetail = videoDetail;
	}

}
