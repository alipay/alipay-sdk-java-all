package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商品查询
 *
 * @author auto create
 * @since 1.0, 2022-11-24 17:24:02
 */
public class KoubeiItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8278333853555516424L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 商品Id,多个用,分割，最多支持传5个,如果不传递则查询商户下所有商品，但是不返回适用门店字段，使用了该参数，则无需填写page_no和page_size
	 */
	@ApiField("item_ids")
	private String itemIds;

	/**
	 * 操作上下文 isv角色操作时必填；其他角色不需填写
	 */
	@ApiField("operation_context")
	private KoubeiOperationContext operationContext;

	/**
	 * 页码，留空标示第一页，默认10个结果为一页
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 每页记录数，默认10，最大20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

	public KoubeiOperationContext getOperationContext() {
		return this.operationContext;
	}
	public void setOperationContext(KoubeiOperationContext operationContext) {
		this.operationContext = operationContext;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
