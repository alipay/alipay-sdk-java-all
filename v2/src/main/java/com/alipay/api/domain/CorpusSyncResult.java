package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识同步结果
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:37:24
 */
public class CorpusSyncResult extends AlipayObject {

	private static final long serialVersionUID = 2774539148813837959L;

	/**
	 * 异常数量
	 */
	@ApiField("exception_count")
	private String exceptionCount;

	/**
	 * 描述知识同步的备注信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 知识同步成功的数量
	 */
	@ApiField("insert_count")
	private Long insertCount;

	/**
	 * 修改成功的数量
	 */
	@ApiField("modified_count")
	private Long modifiedCount;

	public String getExceptionCount() {
		return this.exceptionCount;
	}
	public void setExceptionCount(String exceptionCount) {
		this.exceptionCount = exceptionCount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getInsertCount() {
		return this.insertCount;
	}
	public void setInsertCount(Long insertCount) {
		this.insertCount = insertCount;
	}

	public Long getModifiedCount() {
		return this.modifiedCount;
	}
	public void setModifiedCount(Long modifiedCount) {
		this.modifiedCount = modifiedCount;
	}

}
