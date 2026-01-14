package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 二级分佣任务配置
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:39
 */
public class CascadeMissionConfModel extends AlipayObject {

	private static final long serialVersionUID = 2387497469379695816L;

	/**
	 * 分佣条款列表
1、二级分佣，如果认领人类型为Promote，则不能设置独家（clause_type=MISSION_CLAIM_CLAUSE）
2、二级分用，最大金额无需设置，而是系统自动计算
	 */
	@ApiListField("commission_clause")
	@ApiField("kb_advert_commission_clause")
	private List<KbAdvertCommissionClause> commissionClause;

	/**
	 * 二级分佣认领人类型
PROMOTER:第三方推广者
KOUBEI_PLATFORM：口碑平台推广
	 */
	@ApiField("commission_user_type")
	private String commissionUserType;

	public List<KbAdvertCommissionClause> getCommissionClause() {
		return this.commissionClause;
	}
	public void setCommissionClause(List<KbAdvertCommissionClause> commissionClause) {
		this.commissionClause = commissionClause;
	}

	public String getCommissionUserType() {
		return this.commissionUserType;
	}
	public void setCommissionUserType(String commissionUserType) {
		this.commissionUserType = commissionUserType;
	}

}
