package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优酷视频审核结果回调
 *
 * @author auto create
 * @since 1.0, 2019-03-29 15:58:24
 */
public class AlipayOpenAppYoukuvideoAuditcallbackSendModel extends AlipayObject {

	private static final long serialVersionUID = 2261931915584711772L;

	/**
	 * 审核后状态：allowed 审核通过，blocked 屏蔽驳回， censoring 审核中
	 */
	@ApiField("action")
	private String action;

	/**
	 * 审核前状态：allowed 审核通过，blocked 屏蔽驳回， censoring 审核中
	 */
	@ApiField("old_action")
	private String oldAction;

	/**
	 * 审核来源，1表示审核-一审、2表示审核-二审、3表示审核-三审、4表示审核-综合审、5表示审核-修改审， 30表示播控， 31表示版权解除屏蔽操作，32VMS解屏蔽,33表示视频替换 40表示来疯先发后审 41 表示来疯审核
	 */
	@ApiField("source")
	private String source;

	/**
	 * 视频ID
	 */
	@ApiField("vid")
	private String vid;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getOldAction() {
		return this.oldAction;
	}
	public void setOldAction(String oldAction) {
		this.oldAction = oldAction;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}
