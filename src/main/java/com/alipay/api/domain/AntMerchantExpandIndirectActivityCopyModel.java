package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联商户活动权益复制
 *
 * @author auto create
 * @since 1.0, 2019-11-22 15:19:37
 */
public class AntMerchantExpandIndirectActivityCopyModel extends AlipayObject {

	private static final long serialVersionUID = 7644452435818844319L;

	/**
	 * 转移内容。数组类型。目前可选值(不包含引号)："blue_sea"
	 */
	@ApiField("copy_contents")
	private String copyContents;

	/**
	 * 活动权益复制源smid
	 */
	@ApiField("source_smid")
	private String sourceSmid;

	/**
	 * 活动权益复制目标smid
	 */
	@ApiField("target_smid")
	private String targetSmid;

	public String getCopyContents() {
		return this.copyContents;
	}
	public void setCopyContents(String copyContents) {
		this.copyContents = copyContents;
	}

	public String getSourceSmid() {
		return this.sourceSmid;
	}
	public void setSourceSmid(String sourceSmid) {
		this.sourceSmid = sourceSmid;
	}

	public String getTargetSmid() {
		return this.targetSmid;
	}
	public void setTargetSmid(String targetSmid) {
		this.targetSmid = targetSmid;
	}

}
