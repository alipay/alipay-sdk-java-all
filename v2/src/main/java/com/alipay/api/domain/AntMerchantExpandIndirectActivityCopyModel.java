package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 间联商户活动权益复制
 *
 * @author auto create
 * @since 1.0, 2019-12-05 18:09:02
 */
public class AntMerchantExpandIndirectActivityCopyModel extends AlipayObject {

	private static final long serialVersionUID = 8555624754326458113L;

	/**
	 * 转移内容，数组类型。目前可选值(不包含引号)："blue_sea"
	 */
	@ApiListField("copy_contents")
	@ApiField("string")
	private List<String> copyContents;

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

	public List<String> getCopyContents() {
		return this.copyContents;
	}
	public void setCopyContents(List<String> copyContents) {
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
