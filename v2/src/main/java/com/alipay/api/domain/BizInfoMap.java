package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-21 14:52:46
 */
public class BizInfoMap extends AlipayObject {

	private static final long serialVersionUID = 8128985985545858134L;

	/**
	 * 业务对象的数量
	 */
	@ApiField("biz_count")
	private Long bizCount;

	/**
	 * 业务对象标识，如药品 ID，69 码等
	 */
	@ApiField("biz_object_no")
	private String bizObjectNo;

	/**
	 * 该业务对象标识所属对象库，必填
	 */
	@ApiField("object_library_id")
	private String objectLibraryId;

	public Long getBizCount() {
		return this.bizCount;
	}
	public void setBizCount(Long bizCount) {
		this.bizCount = bizCount;
	}

	public String getBizObjectNo() {
		return this.bizObjectNo;
	}
	public void setBizObjectNo(String bizObjectNo) {
		this.bizObjectNo = bizObjectNo;
	}

	public String getObjectLibraryId() {
		return this.objectLibraryId;
	}
	public void setObjectLibraryId(String objectLibraryId) {
		this.objectLibraryId = objectLibraryId;
	}

}
