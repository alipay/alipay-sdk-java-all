package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 充享惠卡模板配置
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:53:57
 */
public class PayForPrivilegeCardTemplateConfig extends AlipayObject {

	private static final long serialVersionUID = 5769277387366614759L;

	/**
	 * 卡模板的辅助信息项列表
	 */
	@ApiListField("auxiliary_item_list")
	@ApiField("pay_for_privilege_card_template_auxiliary_item")
	private List<PayForPrivilegeCardTemplateAuxiliaryItem> auxiliaryItemList;

	/**
	 * 卡模板头部设置
	 */
	@ApiField("header")
	private PayForPrivilegeCardTemplateHeaderConfig header;

	/**
	 * 卡模板的操作项列表
	 */
	@ApiListField("operation_item_list")
	@ApiField("pay_for_privilege_card_template_operation_item")
	private List<PayForPrivilegeCardTemplateOperationItem> operationItemList;

	/**
	 * 二级区域列表
	 */
	@ApiListField("secondary_item_list")
	@ApiField("pay_for_privilege_card_template_secondary_item")
	private List<PayForPrivilegeCardTemplateSecondaryItem> secondaryItemList;

	public List<PayForPrivilegeCardTemplateAuxiliaryItem> getAuxiliaryItemList() {
		return this.auxiliaryItemList;
	}
	public void setAuxiliaryItemList(List<PayForPrivilegeCardTemplateAuxiliaryItem> auxiliaryItemList) {
		this.auxiliaryItemList = auxiliaryItemList;
	}

	public PayForPrivilegeCardTemplateHeaderConfig getHeader() {
		return this.header;
	}
	public void setHeader(PayForPrivilegeCardTemplateHeaderConfig header) {
		this.header = header;
	}

	public List<PayForPrivilegeCardTemplateOperationItem> getOperationItemList() {
		return this.operationItemList;
	}
	public void setOperationItemList(List<PayForPrivilegeCardTemplateOperationItem> operationItemList) {
		this.operationItemList = operationItemList;
	}

	public List<PayForPrivilegeCardTemplateSecondaryItem> getSecondaryItemList() {
		return this.secondaryItemList;
	}
	public void setSecondaryItemList(List<PayForPrivilegeCardTemplateSecondaryItem> secondaryItemList) {
		this.secondaryItemList = secondaryItemList;
	}

}
