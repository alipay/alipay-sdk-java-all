package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新客户关联渠道账号请求对象
 *
 * @author auto create
 * @since 1.0, 2023-10-16 16:43:23
 */
public class UpdateCustomerChannelAccountRequest extends AlipayObject {

	private static final long serialVersionUID = 4176491825585365199L;

	/**
	 * 绑定状态，目前只支持更新为已绑定
	 */
	@ApiField("binding_status")
	private String bindingStatus;

	/**
	 * 表示是否删除该记录
	 */
	@ApiField("delete_flag")
	private Boolean deleteFlag;

	/**
	 * 海图主键ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 操作人工号
	 */
	@ApiField("operator")
	private String operator;

	public String getBindingStatus() {
		return this.bindingStatus;
	}
	public void setBindingStatus(String bindingStatus) {
		this.bindingStatus = bindingStatus;
	}

	public Boolean getDeleteFlag() {
		return this.deleteFlag;
	}
	public void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
