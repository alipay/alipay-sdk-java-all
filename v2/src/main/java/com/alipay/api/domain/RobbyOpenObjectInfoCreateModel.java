package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务对象信息创建更新
 *
 * @author auto create
 * @since 1.0, 2026-01-05 17:47:43
 */
public class RobbyOpenObjectInfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7589869416516376173L;

	/**
	 * null
	 */
	@ApiListField("biz_object_field_info")
	@ApiField("object_field_info")
	private List<ObjectFieldInfo> bizObjectFieldInfo;

	/**
	 * 业务对象库编号
	 */
	@ApiField("biz_object_library_no")
	private String bizObjectLibraryNo;

	/**
	 * 业务对象名称，如药品名称等
	 */
	@ApiField("biz_object_name")
	private String bizObjectName;

	/**
	 * 业务对象编号，如药品 ID、69 码等
	 */
	@ApiField("biz_object_no")
	private String bizObjectNo;

	public List<ObjectFieldInfo> getBizObjectFieldInfo() {
		return this.bizObjectFieldInfo;
	}
	public void setBizObjectFieldInfo(List<ObjectFieldInfo> bizObjectFieldInfo) {
		this.bizObjectFieldInfo = bizObjectFieldInfo;
	}

	public String getBizObjectLibraryNo() {
		return this.bizObjectLibraryNo;
	}
	public void setBizObjectLibraryNo(String bizObjectLibraryNo) {
		this.bizObjectLibraryNo = bizObjectLibraryNo;
	}

	public String getBizObjectName() {
		return this.bizObjectName;
	}
	public void setBizObjectName(String bizObjectName) {
		this.bizObjectName = bizObjectName;
	}

	public String getBizObjectNo() {
		return this.bizObjectNo;
	}
	public void setBizObjectNo(String bizObjectNo) {
		this.bizObjectNo = bizObjectNo;
	}

}
