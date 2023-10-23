package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心充的配置
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:54:41
 */
public class MemberCardTemplateConfig extends AlipayObject {

	private static final long serialVersionUID = 1491787432875588446L;

	/**
	 * 附加项列表
	 */
	@ApiListField("auxiliary_item_list")
	@ApiField("member_card_template_auxiliary_item")
	private List<MemberCardTemplateAuxiliaryItem> auxiliaryItemList;

	/**
	 * 会员卡头部信息
	 */
	@ApiField("header")
	private MemberCardTemplateHeaderConfig header;

	/**
	 * 操作项列表
	 */
	@ApiListField("operation_item_list")
	@ApiField("member_card_template_operation_item")
	private List<MemberCardTemplateOperationItem> operationItemList;

	/**
	 * 二级区域列表
	 */
	@ApiListField("secondary_item_list")
	@ApiField("member_card_template_secondary_item")
	private List<MemberCardTemplateSecondaryItem> secondaryItemList;

	public List<MemberCardTemplateAuxiliaryItem> getAuxiliaryItemList() {
		return this.auxiliaryItemList;
	}
	public void setAuxiliaryItemList(List<MemberCardTemplateAuxiliaryItem> auxiliaryItemList) {
		this.auxiliaryItemList = auxiliaryItemList;
	}

	public MemberCardTemplateHeaderConfig getHeader() {
		return this.header;
	}
	public void setHeader(MemberCardTemplateHeaderConfig header) {
		this.header = header;
	}

	public List<MemberCardTemplateOperationItem> getOperationItemList() {
		return this.operationItemList;
	}
	public void setOperationItemList(List<MemberCardTemplateOperationItem> operationItemList) {
		this.operationItemList = operationItemList;
	}

	public List<MemberCardTemplateSecondaryItem> getSecondaryItemList() {
		return this.secondaryItemList;
	}
	public void setSecondaryItemList(List<MemberCardTemplateSecondaryItem> secondaryItemList) {
		this.secondaryItemList = secondaryItemList;
	}

}
