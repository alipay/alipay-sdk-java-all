package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款账号
 *
 * @author auto create
 * @since 1.0, 2024-10-31 16:17:08
 */
public class GroupAccountVO extends AlipayObject {

	private static final long serialVersionUID = 1772923156859882961L;

	/**
	 * 商业主体类型
	 */
	@ApiField("biz_entity_type")
	private String bizEntityType;

	/**
	 * 收款账号
	 */
	@ApiField("collect_account_no")
	private String collectAccountNo;

	/**
	 * 范围类型。直连账号：PID，间连账号：SMID。
	 */
	@ApiField("scope_item")
	private String scopeItem;

	public String getBizEntityType() {
		return this.bizEntityType;
	}
	public void setBizEntityType(String bizEntityType) {
		this.bizEntityType = bizEntityType;
	}

	public String getCollectAccountNo() {
		return this.collectAccountNo;
	}
	public void setCollectAccountNo(String collectAccountNo) {
		this.collectAccountNo = collectAccountNo;
	}

	public String getScopeItem() {
		return this.scopeItem;
	}
	public void setScopeItem(String scopeItem) {
		this.scopeItem = scopeItem;
	}

}
