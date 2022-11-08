package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询群详情信息
 *
 * @author auto create
 * @since 1.0, 2022-09-20 19:28:24
 */
public class AlipaySocialBaseBcGroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8459619158346829931L;

	/**
	 * 支付宝商家聊天群的群id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 是否需要返回群成员
	 */
	@ApiField("need_member")
	private Boolean needMember;

	/**
	 * 操作的商家标识id，可选，默认是应用app下的pid；如果填写第三方商家标识id，需要保证app下的pid是该商家的管理员
	 */
	@ApiField("operate_business_id")
	private String operateBusinessId;

	/**
	 * 客户群业务租户id，比如生态商家此id为7，b站开通商户为18
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Boolean getNeedMember() {
		return this.needMember;
	}
	public void setNeedMember(Boolean needMember) {
		this.needMember = needMember;
	}

	public String getOperateBusinessId() {
		return this.operateBusinessId;
	}
	public void setOperateBusinessId(String operateBusinessId) {
		this.operateBusinessId = operateBusinessId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
