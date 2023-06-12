package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容中台优酷视频审核结果回调
 *
 * @author auto create
 * @since 1.0, 2020-04-04 11:10:10
 */
public class AlipayOpenContentContentlibYoukuvideoauditSendModel extends AlipayObject {

	private static final long serialVersionUID = 8357489565611615421L;

	/**
	 * 审核后状态:allowed 审核通 过，blocked 屏蔽驳回， censoring 审核中
	 */
	@ApiField("action")
	private String action;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 审核前状态:allowed 审核通 过，blocked 屏蔽驳回， censoring 审核中
	 */
	@ApiField("old_action")
	private String oldAction;

	/**
	 * 审核来源，1表示审核-一审、 2表示审核-二审、3表示审核- 三审、4表示审核-综合审、 5表示审核-修改审， 30表示播 控， 31表示版权解除屏蔽操 作，32VMS解屏蔽,33表示视 频替换 40来疯先发后审 41 表 示来疯审核
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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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
