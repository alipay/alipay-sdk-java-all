package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜品定制规则api
 *
 * @author auto create
 * @since 1.0, 2020-09-08 21:01:17
 */
public class KoubeiCateringDishCommruleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8739329518761288164L;

	/**
	 * 规则列表 可批量操作
	 */
	@ApiListField("kbdish_comm_rule_info_list")
	@ApiField("kbdish_comm_rule_info")
	private List<KbdishCommRuleInfo> kbdishCommRuleInfoList;

	public List<KbdishCommRuleInfo> getKbdishCommRuleInfoList() {
		return this.kbdishCommRuleInfoList;
	}
	public void setKbdishCommRuleInfoList(List<KbdishCommRuleInfo> kbdishCommRuleInfoList) {
		this.kbdishCommRuleInfoList = kbdishCommRuleInfoList;
	}

}
