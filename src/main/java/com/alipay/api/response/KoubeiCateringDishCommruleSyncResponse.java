package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishCommRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.commrule.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-08 21:01:17
 */
public class KoubeiCateringDishCommruleSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1857383341685757612L;

	/** 
	 * 新增返回的数据集合，如果是修改 或者删除 不返回
	 */
	@ApiListField("kbdish_comm_rule_info_list")
	@ApiField("kbdish_comm_rule_info")
	private List<KbdishCommRuleInfo> kbdishCommRuleInfoList;

	public void setKbdishCommRuleInfoList(List<KbdishCommRuleInfo> kbdishCommRuleInfoList) {
		this.kbdishCommRuleInfoList = kbdishCommRuleInfoList;
	}
	public List<KbdishCommRuleInfo> getKbdishCommRuleInfoList( ) {
		return this.kbdishCommRuleInfoList;
	}

}
