package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 移除用户白名单
 *
 * @author auto create
 * @since 1.0, 2025-08-29 14:28:11
 */
public class AlipayCommerceEducateWhiteuserDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1691665691484628884L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 需要添加白名单的花名册id
	 */
	@ApiField("roster_id")
	private String rosterId;

	/**
	 * 白名单类型id列表
	 */
	@ApiListField("white_type_id")
	@ApiField("string")
	private List<String> whiteTypeId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

	public List<String> getWhiteTypeId() {
		return this.whiteTypeId;
	}
	public void setWhiteTypeId(List<String> whiteTypeId) {
		this.whiteTypeId = whiteTypeId;
	}

}
